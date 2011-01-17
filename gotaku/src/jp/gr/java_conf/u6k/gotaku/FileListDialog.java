
package jp.gr.java_conf.u6k.gotaku;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class FileListDialog {

    private CloseListener _listener;

    private Dialog _dialog;

    private ListView _fileListView;

    private String _filePath;

    private List<String> _fileList;

    private String _currentDirectoryPath;

    public FileListDialog(Context context, CloseListener listener) {
        Log.d("gotaku", this.getClass().getName() + ".ctor start");

        this._listener = listener;

        // ダイアログの設定、ビューの取得を行います。
        this._dialog = new Dialog(context);
        this._dialog.setContentView(R.layout.file_list);
        this._dialog.setTitle(R.string.select_gotaku_file);

        this._fileListView = (ListView) this._dialog.findViewById(R.id.FileListView);
        Button cancelButton = (Button) this._dialog.findViewById(R.id.CancelButton);

        // ビューを設定します。
        this._fileListView.setOnItemClickListener(new FileListViewClickListener());

        this._currentDirectoryPath = "/";
        this.refreshFileList();

        cancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("gotaku", this.getClass().getName() + " Cancel start");

                FileListDialog.this._dialog.dismiss();

                Log.d("gotaku", this.getClass().getName() + " Cancel end");
            }

        });

        Log.d("gotaku", this.getClass().getName() + ".ctor end");
    }

    public String getFilePath() {
        return this._filePath;
    }

    public void show() {
        Log.d("gotaku", this.getClass().getName() + ".show start");

        this._dialog.show();

        Log.d("gotaku", this.getClass().getName() + ".show end");
    }

    private void refreshFileList() {
        Log.d("gotaku", this.getClass().getName() + ".refreshFileList start");

        this._fileList = new ArrayList<String>();

        // ファイル・リストを作成します。
        if (!"/".equals(this._currentDirectoryPath)) {
            this._fileList.add("../");
        }

        File currentDir = new File(this._currentDirectoryPath);

        File[] files = currentDir.listFiles();

        if (files != null) {
            for (File dir : files) {
                List<String> l = new ArrayList<String>();

                if (dir.isDirectory()) {
                    l.add(dir.getName() + "/");
                }

                Collections.sort(l);

                this._fileList.addAll(l);
            }

            for (File file : files) {
                List<String> l = new ArrayList<String>();

                if (file.isFile()) {
                    l.add(file.getName());
                }

                Collections.sort(l);

                this._fileList.addAll(l);
            }
        }

        // アダプターを作成し、ファイル・リスト・ビューに設定します。
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this._dialog.getContext(), R.layout.file_list_item, this._fileList);

        this._fileListView.setAdapter(adapter);

        Log.d("gotaku", this.getClass().getName() + ".refreshFileList end");
    }

    private class FileListViewClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Log.d("gotaku", this.getClass().getName() + " onItemClick start");
            Log.d("gotaku", this.getClass().getName() + " position: " + position);

            if (position == 0) {
                // "../"が選択された場合、親ディレクトリに移動します。
                File currentDir = new File(FileListDialog.this._currentDirectoryPath);
                FileListDialog.this._currentDirectoryPath = currentDir.getParent();

                Log.d("gotaku", this.getClass().getName() + " currentDirectory: " + FileListDialog.this._currentDirectoryPath);

                FileListDialog.this.refreshFileList();
            } else {
                String selectedFile = FileListDialog.this._fileList.get(position);

                Log.d("gotaku", this.getClass().getName() + " selectedFile: " + selectedFile);

                if (selectedFile.endsWith("/")) {
                    // ディレクトリが選択された場合、選択されたディレクトリに移動します。
                    File dir = new File(FileListDialog.this._currentDirectoryPath, selectedFile);
                    FileListDialog.this._currentDirectoryPath = dir.getPath();

                    Log.d("gotaku", this.getClass().getName() + " currentDirectory: " + FileListDialog.this._currentDirectoryPath);

                    FileListDialog.this.refreshFileList();
                } else {
                    // ファイルが選択された場合、選択されたファイルをプロパティに設定して、ダイアログを閉じます。
                    File file = new File(FileListDialog.this._currentDirectoryPath, selectedFile);
                    FileListDialog.this._filePath = file.getPath();

                    Log.d("gotaku", this.getClass().getName() + " selectedFile: " + FileListDialog.this._filePath);

                    if (FileListDialog.this._listener != null) {
                        Log.d("gotaku", this.getClass().getName() + " CloseListener start");

                        FileListDialog.this._listener.execute(FileListDialog.this);

                        Log.d("gotaku", this.getClass().getName() + " CloseListener end");
                    }

                    FileListDialog.this._dialog.dismiss();

                    Log.d("gotaku", this.getClass().getName() + " close");
                }
            }

            Log.d("gotaku", this.getClass().getName() + " onItemClick end");
        }

    }

    public interface CloseListener {

        void execute(FileListDialog dialog);

    }

}
