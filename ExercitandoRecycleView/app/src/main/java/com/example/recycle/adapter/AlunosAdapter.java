package com.example.recycle.adapter;


import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle.model.Aluno;

import java.util.List;

public class AlunosAdapter extends RecyclerView.Adapter <AlunosAdapter.ViewHolder> {

    private List<Aluno> listaAlunos;

    public AlunosAdapter (List<Aluno> listaAlunos) {this.listaAlunos = listaAlunos};

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
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
