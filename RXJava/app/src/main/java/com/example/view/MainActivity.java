package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.androidroomproject.R;
import com.example.androidroomproject.adapter.RecycleViewAdapter;

import com.example.androidroomproject.model.Sport;
import com.example.androidroomproject.viewmodel.EsporteViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecycleViewAdapter adapter;
    private EsporteViewModel viewModel;
    private ProgressBar loading;
    private List<Sport> sporteLiveData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        viewModel.getEsporte();
        viewModel.sporte


    }

    private void initViews(){
        recyclerView = findViewById(R.id.recycleView);
        loading = findViewById(R.id.progress_bar);
        adapter = new RecycleViewAdapter(sportList);
        viewModel = ViewModelProviders.of(this).get(EsporteViewModel.class);

    }
}
