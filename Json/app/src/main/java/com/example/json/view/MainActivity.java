package com.example.json.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.json.R;
import com.example.json.model.Noticia;
import com.example.json.view.adapter.NoticiasRecyclerViewAdapter;
import com.example.json.viewmodel.NoticiaViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private NoticiaViewModel viewModel;
    private NoticiasRecyclerViewAdapter adapter;
    private List<Noticia> noticias = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        viewModel.buscaNoticias();

        viewModel.retornaNoticias().observe(this,noticiasRetornada ->{
            adapter.update()
        });


    }

    private void initViews(){
        recyclerView = findViewById();
        progressBar = findViewById();
        viewModel = ViewModelProviders.of();

    }
}
