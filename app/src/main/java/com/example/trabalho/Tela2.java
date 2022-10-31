package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity {

    private EditText nome;
    private ClienteDAO dao;
    private Cliente c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Cadastro de Fornecedores");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        nome = (EditText) findViewById(R.id.txtNome);
        dao = new ClienteDAO(this);
    }

    public void salvar(View view) {

        c.setNome((nome.getText().toString()));
        long id = dao.inserir(c);
        Toast.makeText(this, "Fornecedor Cadastrado com id:" + id, Toast.LENGTH_LONG).show();
    }
}