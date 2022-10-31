package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ClienteDAO {
    public Conexao conexao;
    public SQLiteDatabase banco;

    public ClienteDAO(Context context) {
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Cliente cliente) {
        ContentValues values = new ContentValues();
        values.put("nome", Cliente.getNome());
        return banco.insert("fornecedor", null, values);

    }
}