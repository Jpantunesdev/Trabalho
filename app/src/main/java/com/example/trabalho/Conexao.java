package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Conexao extends SQLiteOpenHelper{
    private static final String nome = "banco.db";
    private static final int version = 1;
    //private static final SQLiteDataBase.CursorFactory factory = null;
    public Conexao(Context context){
        super(context, nome,null , version);
    }
    //SQL
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table cliente(id Integer primary key autoincrement, "+"nome varchar(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}