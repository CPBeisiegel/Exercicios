package com.example.exerciciobundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class HomeActivity extends AppCompatActivity {

    private TextView textNome1;
    private TextView textTelefone;
    private Button btnVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textNome1 = findViewById(R.id.textNome1);
        textTelefone = findViewById(R.id.textTelefone);
        btnVoltar = findViewById(R.id.btnVoltar);

        Intent intent = getIntent();

        if(getIntent() != null && intent.getExtras() != null){

            Bundle bundle = intent.getExtras();

            String nome = bundle.getString("NOME");
            String telefone = bundle.getString("TELEFONE");

            textNome1.setText(nome);
            textTelefone.setText(telefone);
        }else{
            Snackbar.make(textNome1,"Não a dados",Snackbar.LENGTH_LONG).show();
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });
    }
}
