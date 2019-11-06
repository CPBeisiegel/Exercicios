package com.example.padraoarquiteturavalormvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.padraoarquiteturavalormvvm.R;
import com.example.padraoarquiteturavalormvvm.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private TextView textViewValor;
    private Button btnValor;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewValor = findViewById(R.id.textViewValor);
        btnValor = findViewById(R.id.button);

        // Inicializandon o ViewModel

        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        btnValor.setOnClickListener(v -> {

            viewModel.somaValor(5);

            viewModel.retornaValor().observe(this,valorRetornado ->{
                textViewValor.setText(valorRetornado.toString());
            });

        } );

    }

}
