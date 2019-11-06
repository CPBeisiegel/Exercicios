package br.com.digitalhouse.projetofilmeretrofit.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.projetofilmeretrofit.R;
import br.com.digitalhouse.projetofilmeretrofit.model.Filme;
import br.com.digitalhouse.projetofilmeretrofit.view.adapter.RecyclerViewFilmeAdapter;
import br.com.digitalhouse.projetofilmeretrofit.view.interfaces.OnClick;
import br.com.digitalhouse.projetofilmeretrofit.viewmodel.FilmeViewModel;

public class MainActivity extends AppCompatActivity implements OnClick {
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private RecyclerViewFilmeAdapter adapter;
    private List<Filme> listaFilmes = new ArrayList<>();
    private FilmeViewModel viewModel;
    private int pagina = 1;
    private void static final String API_KEY = "bde8033d3274c91b292a5293c6349052";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        viewModel.getAllFilmes("bde8033d3274c91b292a5293c6349052",1);

        viewModel.getListaFilme().observe(this, resultaLista -> {
            adapter.atualizaLista(resultaLista);
        });

        viewModel.getLoading().observe(this, loading -> {
            if (loading){
                progressBar.setVisibility(View.VISIBLE);
            }else{
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    private void initViews(){
        recyclerView = findViewById(R.id.recyclerViewFilmes);
        progressBar = findViewById(R.id.progress_bar);
        adapter = new RecyclerViewFilmeAdapter(listaFilmes, this);
        viewModel = ViewModelProviders.of(this).get(FilmeViewModel.class);
    }

    @Override
    public void click(Filme filme) {
        Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("Filme", filme);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void setScrollView(){

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();

                int totalItemCount = layoutManager.getItemCount();
                int lastVisible = layoutManager.findLastCompletelyVisibleItemPosition();
                boolean ultimoItem = lastVisible + 5 >= totalItemCount;

                if(totalItemCount > 0 && ultimoItem){
                    pagina++;
                    viewModel.getAllFilmes(API_KEY, pagina);
                }


            }
    }};
}
