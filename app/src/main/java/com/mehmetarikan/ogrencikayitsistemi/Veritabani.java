package com.mehmetarikan.ogrencikayitsistemi;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Veritabani extends SQLiteOpenHelper{

    private static final String DATABASE_NAME="ogrenci_veritabani";
    private static final String TABLE_NAME="ogrenci_tablosu";
    private static final int DATABASE_VERSION=1;

    private static final String AD="ad_soyad";
    private static final String MAIL="mail";
    private static final String ADRES="adres";
    private static final String ID="_id";



    public Veritabani(Context context) {


        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        String tablo_olustur="CREATE TABLE "+TABLE_NAME+
                " ("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                AD+" TEXT, "+
                MAIL+" TEXT, "+
                ADRES+" TEXT);";

        db.execSQL(tablo_olustur);

    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }

    public long KayitEkle(Ogrenci ogrenci) {

        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put(AD,ogrenci.getAdSoyad());
        cv.put(MAIL,ogrenci.getMail());
        cv.put(ADRES, ogrenci.getAdres());

        long id=db.insert(TABLE_NAME,null,cv);

        db.close();
        return id;

    }
    }

