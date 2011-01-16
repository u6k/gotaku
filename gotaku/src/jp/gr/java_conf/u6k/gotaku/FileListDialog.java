
package jp.gr.java_conf.u6k.gotaku;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class FileListDialog {

    private Dialog _dialog;

    private ListView _fileListView;

    private String _filePath;

    private List<String> _fileList;

    private String _currentDirectoryPath;

    public FileListDialog(Context context) {
        // ダイアログの設定、ビューの取得を行います。
        this._dialog = new Dialog(context);
        this._dialog.setContentView(R.layout.file_list);
        this._dialog.setTitle(R.string.select_gotaku_file);

        this._fileListView = (ListView) this._dialog.findViewById(R.id.FileListView);
        Button cancelButton = (Button) this._dialog.findViewById(R.id.CancelButton);

        // ビューを設定します。
        this._fileListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    // "../"が選択された場合、親ディレクトリに移動します。
                    File currentDir = new File(FileListDialog.this._currentDirectoryPath);
                    FileListDialog.this._currentDirectoryPath = currentDir.getParent();

                    FileListDialog.this.refreshFileList();
                } else {
                    String selectedDir = FileListDialog.this._fileList.get(position - 1);

                    if (selectedDir.endsWith("/")) {
                        // ディレクトリが選択された場合、選択されたディレクトリに移動します。
                        File dir = new File(FileListDialog.this._currentDirectoryPath, selectedDir);
                        FileListDialog.this._currentDirectoryPath = dir.getPath();

                        FileListDialog.this.refreshFileList();
                    } else {
                        // ファイルが選択された場合、選択されたファイルをプロパティに設定して、ダイアログを閉じます。
                        File file = new File(FileListDialog.this._currentDirectoryPath, selectedDir);
                        FileListDialog.this._filePath = file.getPath();

                        FileListDialog.this._dialog.dismiss();
                    }
                }
            }

        });

        this._currentDirectoryPath = "/";
        this.refreshFileList();

        cancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                FileListDialog.this._dialog.dismiss();
            }

        });
    }

    public String getFilePath() {
        return this._filePath;
    }

    public void show() {
        this._dialog.show();
    }

    private void refreshFileList() {
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
    }

}
