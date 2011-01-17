
package jp.gr.java_conf.u6k.gotaku.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbOpenHelper extends SQLiteOpenHelper {

    public DbOpenHelper(Context context) {
        super(context, "gotaku", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.beginTransaction();
        try {
            String sql;
            sql = "create table gotaku_set (";
            sql += "  _id integer primary key autoincrement not null,";
            sql += "  name text not null";
            sql += ")";

            db.execSQL(sql);

            sql = "create table gotaku_genre (";
            sql += "  _id integer primary key autoincrement not null,";
            sql += "  set_id integer not null,";
            sql += "  name text not null";
            sql += ")";

            db.execSQL(sql);

            sql = "create table gotaku_question (";
            sql += "  _id integer primary key autoincrement not null,";
            sql += "  genre_id integer not null,";
            sql += "  question text not null,";
            sql += "  answer1 text not null,";
            sql += "  answer2 text not null,";
            sql += "  answer3 text not null,";
            sql += "  answer4 text not null,";
            sql += "  answer5 text not null";
            sql += ")";

            db.execSQL(sql);

            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

}
