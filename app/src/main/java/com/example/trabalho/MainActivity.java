package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(view -> {
            findViewById(R.id.txtLogin);
            TextView tLogin = findViewById(R.id.txtLogin);
            TextView tSenha = findViewById(R.id.txtSenha);
            String login = tLogin.getText().toString();
            String senha = tSenha.getText().toString();
            if(login.equals("João")&&senha.equals("54321")) {
                alert("login realizado com sucesso");
                Intent intent = new Intent(MainActivity.this, Tela2.class);
                startActivity(intent);
            }
            else {
                alert("Usuário ou/e Senha invalido(s)");
            }
        });
    }
    private void alert(String s) {
        Toast.makeText(this,s, Toast.LENGTH_LONG).show();
    }
}