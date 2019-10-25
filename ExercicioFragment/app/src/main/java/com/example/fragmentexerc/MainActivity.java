package com.example.fragmentexerc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button praiaAmada;
    private Button praiaJusta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           initView();

     praiaAmada.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             recarregaFragment(new AmadaFragment());
         }
     });

     praiaJusta.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             recarregaFragment(new JustaFragment());
         }
     });


    }

    public void initView(){
        praiaAmada = findViewById(R.id.praiaAmada);
        praiaJusta = findViewById(R.id.praiaJusta);
    }

    public void recarregaFragment(Fragment fragment){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();

    }


}
