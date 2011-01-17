
package jp.gr.java_conf.u6k.gotaku.gotaku;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jp.gr.java_conf.u6k.gotaku.db.DbOpenHelper;
import jp.gr.java_conf.u6k.gotaku.db.GotakuGenreDao;
import jp.gr.java_conf.u6k.gotaku.db.GotakuQuestionDao;
import jp.gr.java_conf.u6k.gotaku.db.GotakuSetDao;
import jp.gr.java_conf.u6k.gotaku.util.IOUtil;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class GotakuFileBuilder {

    public void readFileAndWriteDb(File file, Context context) throws IOException {
        // ごたくファイルを読み込みます。
        List<InternalGotakuGenreInfo> genreList;

        InputStream in = new FileInputStream(file);
        try {
            genreList = new ArrayList<InternalGotakuGenreInfo>();

            // ジャンル・ヘッダーを読み込みます。
            for (int i = 0; i < 8; i++) {
                String genreName = IOUtil.readString(in, 16);
                int genreReserved = IOUtil.readInt(in);
                int genreCount = IOUtil.readInt(in);
                int genreOffset = IOUtil.readInt(in);
                String genrePlayerData = IOUtil.readString(in, 12);
                String genreId = IOUtil.readString(in, 8);
                IOUtil.readSkip(in, 214);

                InternalGotakuGenreInfo genre = new InternalGotakuGenreInfo();
                genre._name = genreName;
                genre._count = genreCount;
                genre._offset = genreOffset;

                genreList.add(genre);

                // TODO
                Log.v("gotaku", "ジャンル名: \"" + genre._name + "\"");
                Log.v("gotaku", "予約域: \"" + genreReserved + "\"");
                Log.v("gotaku", "問題数: \"" + genre._count + "\"");
                Log.v("gotaku", "先頭位置: \"" + genre._offset + "\"");
                Log.v("gotaku", "プレイヤーデータファイル名: \"" + genrePlayerData + "\"");
                Log.v("gotaku", "ID: \"" + genreId + "\"");
            }

            // 問題を読み込みます。
            for (InternalGotakuGenreInfo gotakuGenre : genreList) {
                List<InternalGotakuQuestionInfo> questionList = new ArrayList<InternalGotakuQuestionInfo>();

                for (int i = 0; i < gotakuGenre._count; i++) {
                    InternalGotakuQuestionInfo question = new InternalGotakuQuestionInfo();

                    String q = IOUtil.readQuestionString(in, 116);

                    List<String> answerList = new ArrayList<String>();
                    answerList.add(IOUtil.readQuestionString(in, 28));
                    answerList.add(IOUtil.readQuestionString(in, 28));
                    answerList.add(IOUtil.readQuestionString(in, 28));
                    answerList.add(IOUtil.readQuestionString(in, 28));
                    answerList.add(IOUtil.readQuestionString(in, 28));

                    question._question = q;
                    question._answerList = answerList;

                    questionList.add(question);
                }

                gotakuGenre._questionList = questionList;
            }
        } finally {
            in.close();
        }

        InternalGotakuSetInfo gotaku = new InternalGotakuSetInfo();
        gotaku._name = file.getName();
        gotaku._genreList = genreList;

        // DBに書き込みます。
        DbOpenHelper dbHelper = new DbOpenHelper(context);
        try {
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            try {
                db.beginTransaction();
                try {
                    GotakuSetDao gotakuSetDao = new GotakuSetDao(db);
                    long setId = gotakuSetDao.create(gotaku._name);

                    for (InternalGotakuGenreInfo genre : gotaku._genreList) {
                        GotakuGenreDao gotakuGenreDao = new GotakuGenreDao(db);
                        long genreId = gotakuGenreDao.create(setId, genre._name);

                        for (InternalGotakuQuestionInfo question : genre._questionList) {
                            GotakuQuestionDao gotakuQuestionDao = new GotakuQuestionDao(db);
                            gotakuQuestionDao.create(genreId, question._question, question._answerList.get(0), question._answerList.get(1), question._answerList.get(2), question._answerList.get(3), question._answerList.get(4));
                        }
                    }

                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }
            } finally {
                db.close();
            }
        } finally {
            dbHelper.close();
        }
    }

    private class InternalGotakuSetInfo {

        String _name;

        List<InternalGotakuGenreInfo> _genreList = new ArrayList<InternalGotakuGenreInfo>();

    }

    private class InternalGotakuGenreInfo {

        String _name;

        List<InternalGotakuQuestionInfo> _questionList = new ArrayList<InternalGotakuQuestionInfo>();

        int _count;

        int _offset;

    }

    private class InternalGotakuQuestionInfo {

        String _question;

        List<String> _answerList = new ArrayList<String>();

    }

}
