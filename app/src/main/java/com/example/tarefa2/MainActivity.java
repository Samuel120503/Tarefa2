package com.example.tarefa2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nome =(EditText) findViewById(R.id.nome);
        EditText nick =(EditText) findViewById(R.id.nick);
        EditText senha =(EditText) findViewById(R.id.senha);
        EditText telefone =(EditText) findViewById(R.id.telefone);
        EditText texto =(EditText) findViewById(R.id.texto);
        Button b1 = (Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome.setText("");
                nick.setText("");
                senha.setText("");
                telefone.setText("");
                texto.setText("");

            }
        });

    }
}