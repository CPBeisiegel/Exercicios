package com.example.json.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.json.R;
import com.example.json.model.Noticia;

import java.util.List;

public class NoticiasRecyclerViewAdapter extends RecyclerView.Adapter<NoticiasRecyclerViewAdapter.ViewHolder> {

    private List<Noticia> listaNoticia;


    public NoticiasRecyclerViewAdapter(List<Noticia> listaNoticia) {
        this.listaNoticia = listaNoticia;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listaNoticia.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewtitulo;
        private TextView textViewDescricao;
        private TextView textViewData;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewtitulo = itemView.findViewById(R.id.textViewTitle);
            textViewDescricao = itemView.findViewById(R.id.textViewDescricao);
            textViewData = itemView.findViewById(R.id.textViewData);


        }


        public void
    }
}
