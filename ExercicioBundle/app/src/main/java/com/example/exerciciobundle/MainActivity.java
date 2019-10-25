package com.example.exerciciobundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout textNome;
    private TextInputLayout textTelefone2;
    private FloatingActionButton btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNome = findViewById(R.id.textNome);
        textTelefone2 = findViewById(R.id.textTelefone2);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = textNome.getEditText().getText().toString();
                String telefone = textTelefone2.getEditText().getText().toString();

                if(!nome.isEmpty() && !telefone.isEmpty()){
                    //Mando para a outra activity os dados

                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                    Bundle bundle = new Bundle();
                    bundle.putString("NOME", nome);
                    bundle.putString("TELEFONE", telefone);
                    intent.putExtras(bundle);

                    startActivity(intent);

                } else{
                    textNome.setError("Preencha o campo nome");
                    textTelefone2.setError("Preencha o campo telefone");
                }
            }
        });
    }


}
