package com.example.myappproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=7;

    public DBHelper(Context context){
        super(context, "datadb", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String driverTable="create table tb_drive ("+"_id integer primary key autoincrement,"+"name)";

        db.execSQL(driverTable);
        db.execSQL("insert into tb_drive (name) values ('고슴도치')");
        db.execSQL("insert into tb_drive (name) values ('다람쥐')");
        db.execSQL("insert into tb_drive (name) values ('주머니쥐')");
        db.execSQL("insert into tb_drive (name) values ('토끼')");
        db.execSQL("insert into tb_drive (name) values ('뱀')");
        db.execSQL("insert into tb_drive (name) values ('거북이')");
        db.execSQL("insert into tb_drive (name) values ('여우')");
        db.execSQL("insert into tb_drive (name) values ('고양이')");
        db.execSQL("insert into tb_drive (name) values ('쥐')");
        db.execSQL("insert into tb_drive (name) values ('강아지')");
        db.execSQL("insert into tb_drive (name) values ('소')");
        db.execSQL("insert into tb_drive (name) values ('돼지')");
        db.execSQL("insert into tb_drive (name) values ('숫사자')");
        db.execSQL("insert into tb_drive (name) values ('암사자')");
        db.execSQL("insert into tb_drive (name) values ('양')");
        db.execSQL("insert into tb_drive (name) values ('두더지')");
        db.execSQL("insert into tb_drive (name) values ('도마뱀')");
        db.execSQL("insert into tb_drive (name) values ('개구리')");
        db.execSQL("insert into tb_drive (name) values ('반달가슴곰')");
        db.execSQL("insert into tb_drive (name) values ('곰')");
        db.execSQL("insert into tb_drive (name) values ('기린')");
        db.execSQL("insert into tb_drive (name) values ('코끼리')");
        db.execSQL("insert into tb_drive (name) values ('코알라')");
        db.execSQL("insert into tb_drive (name) values ('캥거루')");
        db.execSQL("insert into tb_drive (name) values ('햄스터')");
        db.execSQL("insert into tb_drive (name) values ('땃쥐')");
        db.execSQL("insert into tb_drive (name) values ('악어')");
        db.execSQL("insert into tb_drive (name) values ('북극곰')");
        db.execSQL("insert into tb_drive (name) values ('말')");
        db.execSQL("insert into tb_drive (name) values ('호랑이')");
        db.execSQL("insert into tb_drive (name) values ('사슴')");
        db.execSQL("insert into tb_drive (name) values ('하마')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion == DATABASE_VERSION){
            db.execSQL("drop table tb_drive");
            onCreate(db);
        }

    }
}
