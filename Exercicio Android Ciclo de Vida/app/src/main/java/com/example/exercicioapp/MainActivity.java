package com.example.exercicioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button = (Button) findViewById(R.id.buttonPanel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Você está logado", Toast.LENGTH_SHORT).show();

            }
        });
    }






    @Override
    protected void onStart() {
        super.onStart();
        Log.i("cicloDaVida","método onStar");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("cicloDeVida","método onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("cicloDeVida","método onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("cicloDeVida","método onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("cicloDeVida","método onDestroy");
    }



}

