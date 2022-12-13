package com.example.kotlin_lectures;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Dbhelper extends SQLiteOpenHelper {
    private static final String DATABASE="roshandb";
    private static final int VERSION=1;

    public Dbhelper(@Nullable Context context) {
        super(context, DATABASE, null,VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String Create_table_query=null;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
return;
    }
}
