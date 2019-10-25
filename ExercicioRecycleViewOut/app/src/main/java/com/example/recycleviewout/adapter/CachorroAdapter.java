package com.example.recycleviewout.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewout.R;
import com.example.recycleviewout.interfaces.RecycleViewOnClick;
import com.example.recycleviewout.model.Cachorro;

import java.util.List;

public class CachorroAdapter extends RecyclerView.Adapter <CachorroAdapter.ViewHolder> {

    private List<Cachorro> cachorros;
    private RecycleViewOnClick listener;

    public CachorroAdapter(List<Cachorro> cachorros,RecycleViewOnClick listener) {
        this.cachorros = cachorros;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycleview, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolderCachorro, int position) {

        final Cachorro cachorro = cachorros.get(position);
        viewHolderCachorro.bind(cachorro);

        viewHolderCachorro.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                listener.onClick(cachorro);
            }
        });

    }

    @Override
    public int getItemCount() {

        return cachorros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewNome;
        ImageView imageView;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewNome = itemView.findViewById(R.id.textViewNome);
            imageView = itemView.findViewById(R.id.imageView);

        }

        public void bind(Cachorro cachorro) {

            Drawable drawable = itemView.getResources().getDrawable(cachorro.getImagem());
            textViewNome.setText((cachorro.getNome()));
            imageView.setImageDrawable((drawable));


        }
    }
}



