
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

    public IGotakuInfo read(File file) throws IOException {
        List<IGotakuGenreInfo> genreList;

        InputStream in = new FileInputStream(file);
        try {
            genreList = new ArrayList<IGotakuGenreInfo>();

            // ジャンル・ヘッダーを読み込みます。
            for (int i = 0; i < 8; i++) {
                String genreName = IOUtil.readString(in, 16);
                int genreReserved = IOUtil.readInt(in);
                int genreCount = IOUtil.readInt(in);
                int genreOffset = IOUtil.readInt(in);
                String genrePlayerData = IOUtil.readString(in, 12);
                String genreId = IOUtil.readString(in, 8);
                IOUtil.readSkip(in, 214);

                GotakuGenreInfo genre = new GotakuGenreInfo();
                genre.setName(genreName);
                genre.setCount(genreCount);
                genre.setOffset(genreOffset);

                genreList.add(genre);

                // TODO
                Log.v("gotaku", "ジャンル名: \"" + genre.getName() + "\"");
                Log.v("gotaku", "予約域: \"" + genreReserved + "\"");
                Log.v("gotaku", "問題数: \"" + genre.getCount() + "\"");
                Log.v("gotaku", "先頭位置: \"" + genre.getOffset() + "\"");
                Log.v("gotaku", "プレイヤーデータファイル名: \"" + genrePlayerData + "\"");
                Log.v("gotaku", "ID: \"" + genreId + "\"");
            }

            for (IGotakuGenreInfo gotakuGenre : genreList) {
                GotakuGenreInfo genre = (GotakuGenreInfo) gotakuGenre;

                List<IGotakuQuestionInfo> questionList = new ArrayList<IGotakuQuestionInfo>();

                for (int i = 0; i < genre.getCount(); i++) {
                    GotakuQuestionInfo question = new GotakuQuestionInfo();

                    String q = IOUtil.readQuestionString(in, 116);

                    List<String> answerList = new ArrayList<String>();
                    answerList.add(IOUtil.readQuestionString(in, 28));
                    answerList.add(IOUtil.readQuestionString(in, 28));
                    answerList.add(IOUtil.readQuestionString(in, 28));
                    answerList.add(IOUtil.readQuestionString(in, 28));
                    answerList.add(IOUtil.readQuestionString(in, 28));

                    question.setQuestion(q);
                    question.setAnswerList(answerList);

                    questionList.add(question);
                }

                genre.setQuestionList(questionList);
            }
        } finally {
            in.close();
        }

        GotakuInfo gotaku = new GotakuInfo();
        gotaku.setName(file.getName());
        gotaku.setGenreList(genreList);

        return gotaku;
    }

    public void readFileAndInsertData(IGotakuInfo gotaku, Context context) throws IOException {
        DbOpenHelper dbHelper = new DbOpenHelper(context);
        try {
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            try {
                db.beginTransaction();
                try {
                    GotakuSetDao gotakuSetDao = new GotakuSetDao(db);
                    long setId = gotakuSetDao.create(gotaku.getName());

                    for (IGotakuGenreInfo genre : gotaku.getGenreList()) {
                        GotakuGenreDao gotakuGenreDao = new GotakuGenreDao(db);
                        long genreId = gotakuGenreDao.create(setId, genre.getName());

                        for (IGotakuQuestionInfo question : genre.getQuestionList()) {
                            GotakuQuestionDao gotakuQuestionDao = new GotakuQuestionDao(db);
                            gotakuQuestionDao.create(genreId, question.getQuestion(), question.getAnswerList().get(0), question.getAnswerList().get(1), question.getAnswerList().get(2), question.getAnswerList().get(3), question.getAnswerList().get(4));
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

}
