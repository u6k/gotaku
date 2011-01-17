
package jp.gr.java_conf.u6k.gotaku.db;

import java.util.ArrayList;
import java.util.List;

import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuGenreInfo;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuQuestionInfo;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class GotakuGenreDao {

    private SQLiteDatabase _db;

    public GotakuGenreDao(SQLiteDatabase db) {
        this._db = db;
    }

    public long create(long setId, String name) {
        ContentValues values = new ContentValues();
        values.put("set_id", setId);
        values.put("name", name);

        long genreId = this._db.insert("gotaku_genre", null, values);

        return genreId;
    }

    public List<IGotakuGenreInfo> findBySetId(long setId) {
        List<IGotakuGenreInfo> l = new ArrayList<IGotakuGenreInfo>();

        String sql = "select _id, name from gotaku_genre where set_id = ? order by _id";

        Cursor c = this._db.rawQuery(sql, new String[] { Long.toString(setId) });
        try {
            c.moveToFirst();

            while (!c.isAfterLast()) {
                GotakuGenreInfo g = new GotakuGenreInfo();
                g.setId(c.getLong(0));
                g.setSetId(setId);
                g.setName(c.getString(1));

                l.add(g);

                c.moveToNext();
            }
        } finally {
            c.close();
        }

        return l;
    }

    private class GotakuGenreInfo implements IGotakuGenreInfo {

        private long _id;

        private long _setId;

        private String _name;

        @Override
        public long getId() {
            return this._id;
        }

        public void setId(long id) {
            this._id = id;
        }

        @Override
        public long getSetId() {
            return this._setId;
        }

        public void setSetId(long setId) {
            this._setId = setId;
        }

        @Override
        public String getName() {
            return this._name;
        }

        public void setName(String name) {
            this._name = name;
        }

        @Override
        public List<IGotakuQuestionInfo> getQuestionList() {
            return null;
        }

    }

}
