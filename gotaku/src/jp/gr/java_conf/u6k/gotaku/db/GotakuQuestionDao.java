
package jp.gr.java_conf.u6k.gotaku.db;

import java.util.ArrayList;
import java.util.List;

import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuQuestionInfo;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class GotakuQuestionDao {

    private SQLiteDatabase _db;

    public GotakuQuestionDao(SQLiteDatabase db) {
        this._db = db;
    }

    public long create(long genreId, String question, String answer1, String answer2, String answer3, String answer4, String answer5) {
        ContentValues values = new ContentValues();
        values.put("genre_id", genreId);
        values.put("question", question);
        values.put("answer1", answer1);
        values.put("answer2", answer2);
        values.put("answer3", answer3);
        values.put("answer4", answer4);
        values.put("answer5", answer5);

        long questionId = this._db.insert("gotaku_question", null, values);

        return questionId;
    }

    public List<IGotakuQuestionInfo> findByGenreId(long genreId) {
        List<IGotakuQuestionInfo> l = new ArrayList<IGotakuQuestionInfo>();

        String sql = "select _id, genre_id, question, answer1, answer2, answer3, answer4, answer5 from gotaku_question where genre_id = ? order by _id";

        Cursor c = this._db.rawQuery(sql, new String[] { Long.toString(genreId) });
        try {
            c.moveToFirst();

            while (!c.isAfterLast()) {
                GotakuQuestionInfo q = new GotakuQuestionInfo();
                q.setId(c.getLong(0));
                q.setGenreId(genreId);
                q.setQuestion(c.getString(1));
                q.getAnswerList().add(c.getString(2));
                q.getAnswerList().add(c.getString(3));
                q.getAnswerList().add(c.getString(4));
                q.getAnswerList().add(c.getString(5));
                q.getAnswerList().add(c.getString(6));

                l.add(q);

                c.moveToNext();
            }
        } finally {
            c.close();
        }

        return l;
    }

    private class GotakuQuestionInfo implements IGotakuQuestionInfo {

        private long _id;

        private long _genreId;

        private String _question;

        private List<String> _answerList = new ArrayList<String>();

        @Override
        public long getId() {
            return this._id;
        }

        public void setId(long id) {
            this._id = id;
        }

        @Override
        public long getGenreId() {
            return this._genreId;
        }

        public void setGenreId(long genreId) {
            this._genreId = genreId;
        }

        @Override
        public String getQuestion() {
            return this._question;
        }

        public void setQuestion(String question) {
            this._question = question;
        }

        @Override
        public List<String> getAnswerList() {
            return this._answerList;
        }

    }

}
