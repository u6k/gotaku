
package jp.gr.java_conf.u6k.gotaku.db;

import java.util.ArrayList;
import java.util.List;

import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuGenreInfo;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuInfo;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class GotakuSetDao {

    private SQLiteDatabase _db;

    public GotakuSetDao(SQLiteDatabase db) {
        this._db = db;
    }

    public long create(String name) {
        ContentValues values = new ContentValues();
        values.put("name", name);

        long setId = this._db.insert("gotaku_set", null, values);

        return setId;
    }

    public List<IGotakuInfo> findAll() {
        List<IGotakuInfo> l = new ArrayList<IGotakuInfo>();

        String sql = "select _id, name from gotaku_set order by name";

        Cursor c = this._db.rawQuery(sql, null);
        try {
            c.moveToFirst();

            while (!c.isAfterLast()) {
                GotakuInfo g = new GotakuInfo();
                g.setId(c.getLong(0));
                g.setName(c.getString(1));

                l.add(g);

                c.moveToNext();
            }
        } finally {
            c.close();
        }

        return l;
    }

    private class GotakuInfo implements IGotakuInfo {

        private long _id;

        private String _name;

        @Override
        public long getId() {
            return this._id;
        }

        public void setId(long id) {
            this._id = id;
        }

        @Override
        public String getName() {
            return this._name;
        }

        public void setName(String name) {
            this._name = name;
        }

        @Override
        public List<IGotakuGenreInfo> getGenreList() {
            return null;
        }

    }

}
