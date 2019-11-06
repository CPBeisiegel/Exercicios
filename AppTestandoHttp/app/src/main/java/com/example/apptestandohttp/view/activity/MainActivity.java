package com.example.apptestandohttp.view.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptestandohttp.R;
import com.example.apptestandohttp.model.Result;
import com.example.apptestandohttp.view.adapter.RecyclerViewAdapter;
import com.example.apptestandohttp.viewmodel.FilmeViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private List<Result> listaResults = new ArrayList<>();
    private FilmeViewModel viewModel;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        viewModel.getAllFilmes("bde8033d3274c91b292a5293c6349052");

        viewModel.getListaFilme().observe(this, results -> {
            adapter.atualizarLista(results);
        });

        viewModel.getLoading().observe(this, loading -> {
            if(loading){
                progressBar.setVisibility(View.VISIBLE);
            } else{
                progressBar.setVisibility(View.GONE);
            }
        });

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerViewFilmes);
        progressBar = findViewById(R.id.progress_bar);
        adapter = new RecyclerViewAdapter(listaResults);
        viewModel = ViewModelProviders.of(this).get(FilmeViewModel.class);

    }
}
