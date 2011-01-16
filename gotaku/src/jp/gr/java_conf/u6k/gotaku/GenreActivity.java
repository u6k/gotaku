
package jp.gr.java_conf.u6k.gotaku;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jp.gr.java_conf.u6k.gotaku.gotaku.GotakuFileBuilder;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuGenreInfo;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuInfo;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class GenreActivity extends Activity {

    private static final int MENU_SELECT_FILE = 0;

    private ListView _genreListView;

    private IGotakuInfo _gotaku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // レイアウトを設定し、ビューを取得します。
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.genre);

        this._genreListView = (ListView) this.findViewById(R.id.GenreListView);

        // ビューの設定を行います。
        this._genreListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parentView, View view, int position, long id) {
                IGotakuGenreInfo genre = GenreActivity.this._gotaku.getGenreList().get(position);

                Intent intent = new Intent(GenreActivity.this, SinglePlayActivity.class);
                intent.putExtra("genre", genre);
                GenreActivity.this.startActivity(intent);

                GenreActivity.this.finish();
            }

        });

        // ごたくデータの読み込みを開始します。
        Thread t = new Thread(new LoadGotakuRunnable(new Handler()));
        t.start();
    }

    private class GenreListViewAdapter extends ArrayAdapter<String> {

        private LayoutInflater _inflater;

        private List<String> _list;

        public GenreListViewAdapter(Context context, List<String> objects) {
            super(context, R.id.GenreListView, objects);

            this._inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this._list = objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = this._inflater.inflate(R.layout.genre_list, null);

                TextView genreNameTextView = (TextView) convertView.findViewById(R.id.GenreNameTextView);
                genreNameTextView.setText(this._list.get(position));
            }

            return convertView;
        }

    }

    /*
     * メニュー関連の処理。
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, GenreActivity.MENU_SELECT_FILE, 0, R.string.select_gotaku_file);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_SELECT_FILE:
                this.menuSelectFile();
                break;
            default:
                throw new RuntimeException();
        }

        return true;
    }

    private void menuSelectFile() {
        FileListDialog fileListDialog = new FileListDialog(this);
        fileListDialog.show();
    }

    /**
     * ごたくデータを読み込みます。
     * 
     * <ol>
     * <li>プログレス・ダイアログを表示します。
     * <li>ごたくデータを読み込みます。
     * <li>リスト・ビューに表示します。
     * <li>プログレス・ダイアログを閉じます。
     * </ol>
     */
    private class LoadGotakuRunnable implements Runnable {

        private Handler _handler;

        private ProgressDialog _progressDialog;

        private boolean _isRunning;

        private Object _lock = new Object();

        public LoadGotakuRunnable(Handler handler) {
            this._handler = handler;
        }

        @Override
        public void run() {
            try {
                Log.d("gotaku", "LoadGotakuThread.run start");

                // プログレス・ダイアログを表示します。
                this._isRunning = true;

                this._handler.post(new Runnable() {

                    @Override
                    public void run() {
                        LoadGotakuRunnable.this._progressDialog = new ProgressDialog(GenreActivity.this);
                        LoadGotakuRunnable.this._progressDialog.setMessage("ごたくデータを読み込み中...");
                        LoadGotakuRunnable.this._progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                        LoadGotakuRunnable.this._progressDialog.setCancelable(false);
                        LoadGotakuRunnable.this._progressDialog.show();

                        synchronized (LoadGotakuRunnable.this._lock) {
                            LoadGotakuRunnable.this._isRunning = false;
                            LoadGotakuRunnable.this._lock.notifyAll();
                        }
                    }

                });

                synchronized (this._lock) {
                    while (this._isRunning) {
                        this._lock.wait();
                    }
                }

                // ごたくデータを読み込みます。
                InputStream in = GenreActivity.this.getAssets().open("testdata/SAD_M1&2.5TQ");
                try {
                    GotakuFileBuilder gb = new GotakuFileBuilder();
                    GenreActivity.this._gotaku = gb.build(in);
                } finally {
                    in.close();
                }

                // リスト・ビューに表示します。
                List<String> genreNameList = new ArrayList<String>();

                for (IGotakuGenreInfo genre : GenreActivity.this._gotaku.getGenreList()) {
                    genreNameList.add(genre.getName());
                }

                final GenreListViewAdapter adapter = new GenreListViewAdapter(GenreActivity.this, genreNameList);

                this._isRunning = true;

                this._handler.post(new Runnable() {

                    @Override
                    public void run() {
                        GenreActivity.this._genreListView.setAdapter(adapter);

                        synchronized (LoadGotakuRunnable.this._lock) {
                            LoadGotakuRunnable.this._isRunning = false;
                            LoadGotakuRunnable.this._lock.notifyAll();
                        }
                    }

                });

                synchronized (this._lock) {
                    while (this._isRunning) {
                        this._lock.wait();
                    }
                }

                // プログレス・ダイアログを閉じます。
                this._isRunning = true;

                this._handler.post(new Runnable() {

                    @Override
                    public void run() {
                        LoadGotakuRunnable.this._progressDialog.cancel();

                        synchronized (LoadGotakuRunnable.this._lock) {
                            LoadGotakuRunnable.this._isRunning = false;
                            LoadGotakuRunnable.this._lock.notifyAll();
                        }
                    }

                });

                synchronized (this._lock) {
                    while (this._isRunning) {
                        this._lock.wait();
                    }
                }

                Log.d("gotaku", "LoadGotakuThread.run end");
            } catch (Exception e) {
                Log.e("gotaku", "LoadGotakuThread.run", e);

                Toast.makeText(GenreActivity.this, e.getClass().getName() + ": " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

    }

}
