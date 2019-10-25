package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("cicloDeVida","método onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("cicloDeVida","método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("cicloDeVida","método onResumo");
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

