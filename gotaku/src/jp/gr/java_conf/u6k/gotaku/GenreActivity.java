
package jp.gr.java_conf.u6k.gotaku;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jp.gr.java_conf.u6k.gotaku.db.DbOpenHelper;
import jp.gr.java_conf.u6k.gotaku.db.GotakuGenreDao;
import jp.gr.java_conf.u6k.gotaku.db.GotakuSetDao;
import jp.gr.java_conf.u6k.gotaku.gotaku.GotakuFileBuilder;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuGenreInfo;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuInfo;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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

    private List<IGotakuInfo> _gotakuList;

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
                GenreListItem item = (GenreListItem) view.getTag();
                if (item._genreId != -1) {
                    Intent intent = new Intent(GenreActivity.this, SinglePlayActivity.class);
                    intent.putExtra("setId", item._setId);
                    intent.putExtra("genreId", item._genreId);
                    GenreActivity.this.startActivity(intent);

                    GenreActivity.this.finish();
                }
            }

        });

        // ごたくデータの読み込みを開始します。
        new Thread(new RefreshGenreListRunnable(new Handler())).start();
    }

    /**
     * <p>
     * 問題セットをDBから取得して、ジャンル・リストを更新します。
     * </p>
     */
    private class RefreshGenreListRunnable implements Runnable {

        private Handler _handler;

        public RefreshGenreListRunnable(Handler handler) {
            this._handler = handler;
        }

        @Override
        public void run() {
            Log.d("gotaku", this.getClass().getName() + " run start");
            try {
                // DBを開きます。
                DbOpenHelper dbHelper = new DbOpenHelper(GenreActivity.this);
                try {
                    SQLiteDatabase db = dbHelper.getReadableDatabase();
                    try {
                        // 問題セットをDBから取得します。
                        GotakuSetDao setDao = new GotakuSetDao(db);
                        GotakuGenreDao genreDao = new GotakuGenreDao(db);

                        GenreActivity.this._gotakuList = setDao.findAll();

                        List<GenreListItem> l = new ArrayList<GenreActivity.GenreListItem>();

                        for (IGotakuInfo gotaku : GenreActivity.this._gotakuList) {
                            GenreListItem item = new GenreListItem();
                            item._setId = gotaku.getId();
                            item._genreId = -1;
                            item._name = gotaku.getName();

                            l.add(item);

                            List<IGotakuGenreInfo> genreList = genreDao.findBySetId(gotaku.getId());
                            for (IGotakuGenreInfo genre : genreList) {
                                item = new GenreListItem();
                                item._setId = gotaku.getId();
                                item._genreId = genre.getId();
                                item._name = genre.getName();

                                l.add(item);
                            }
                        }

                        // ジャンル・リストを更新します。
                        final GenreListViewAdapter adapter = new GenreListViewAdapter(GenreActivity.this, l);

                        this._handler.post(new Runnable() {

                            @Override
                            public void run() {
                                GenreActivity.this._genreListView.setAdapter(adapter);
                            }

                        });

                        // DBを閉じます。
                    } finally {
                        db.close();
                    }
                } finally {
                    dbHelper.close();
                }

            } catch (Exception e) {
                Log.e("gotaku", this.getClass().getName() + " run error", e);

                Toast.makeText(GenreActivity.this, e.getClass().getName() + ": " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
            Log.d("gotaku", this.getClass().getName() + " run end");
        }

    }

    /**
     * <p>
     * ジャンル・リストをアダプターを実装します。
     * </p>
     */
    private class GenreListViewAdapter extends ArrayAdapter<GenreListItem> {

        private LayoutInflater _inflater;

        private List<GenreListItem> _list;

        public GenreListViewAdapter(Context context, List<GenreListItem> objects) {
            super(context, R.id.GenreListView, objects);

            this._inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this._list = objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = this._inflater.inflate(R.layout.genre_list, null);
                TextView genreNameTextView = (TextView) convertView.findViewById(R.id.GenreNameTextView);

                GenreListItem item = this._list.get(position);
                if (item._genreId == -1) {
                    genreNameTextView.setText(item._name);
                } else {
                    genreNameTextView.setText("    " + item._name);
                }

                convertView.setTag(item);
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
                // ごたくファイルの選択ダイアログを表示します。
                FileListDialog fileListDialog = new FileListDialog(this, new LoadGotakuRunnable(new Handler()));
                fileListDialog.show();

                break;
            default:
                throw new RuntimeException();
        }

        return true;
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
    private class LoadGotakuRunnable implements FileListDialog.CloseListener {

        private Handler _handler;

        public LoadGotakuRunnable(Handler handler) {
            this._handler = handler;
        }

        @Override
        public void execute(FileListDialog dialog) {
            Log.d("gotaku", this.getClass().getName() + " execute start");

            // ファイル選択の結果を取得します。
            final String filePath = dialog.getFilePath();

            Log.d("gotaku", this.getClass().getName() + " filePath: " + filePath);

            // ごたくファイルの読み込みを開始します。
            Thread t = new Thread(new Runnable() {

                private ProgressDialog _progressDialog;

                private boolean _isRunning;

                private Object _lock = new Object();

                @Override
                public void run() {
                    Log.d("gotaku", this.getClass().getName() + " execute start");
                    try {
                        // プログレス・ダイアログを表示します。
                        this._isRunning = true;

                        LoadGotakuRunnable.this._handler.post(new Runnable() {

                            @Override
                            public void run() {
                                _progressDialog = new ProgressDialog(GenreActivity.this);
                                _progressDialog.setMessage("ごたくファイルを読み込み中...");
                                _progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                                _progressDialog.setCancelable(false);
                                _progressDialog.show();

                                synchronized (_lock) {
                                    _isRunning = false;
                                    _lock.notifyAll();
                                }
                            }

                        });

                        synchronized (this._lock) {
                            while (this._isRunning) {
                                this._lock.wait();
                            }
                        }

                        // ごたくデータを読み込みます。
                        File file = new File(filePath);

                        GotakuFileBuilder gb = new GotakuFileBuilder();
                        gb.readFileAndWriteDb(file, GenreActivity.this);

                        // リスト・ビューに表示します。
                        Thread t = new Thread(new RefreshGenreListRunnable(LoadGotakuRunnable.this._handler));
                        t.start();
                        t.join();

                        // プログレス・ダイアログを閉じます。
                        this._isRunning = true;

                        LoadGotakuRunnable.this._handler.post(new Runnable() {

                            @Override
                            public void run() {
                                _progressDialog.cancel();

                                synchronized (_lock) {
                                    _isRunning = false;
                                    _lock.notifyAll();
                                }
                            }

                        });

                        synchronized (this._lock) {
                            while (this._isRunning) {
                                this._lock.wait();
                            }
                        }
                    } catch (Exception e) {
                        Log.e("gotaku", this.getClass().getName() + " execute error", e);
                    }

                    Log.d("gotaku", this.getClass().getName() + " execute end");
                }

            });
            t.start();

            Log.d("gotaku", this.getClass().getName() + " execute end");
        }
    }

    private class GenreListItem {

        long _setId;

        long _genreId;

        String _name;

    }

}
