package com.example.androidroomproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidroomproject.R;
import com.example.androidroomproject.model.Sport;

import java.util.List;

public class RecycleViewAdapter  extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private List<Sport> sportList;

    public RecycleViewAdapter(List<Sport> listaAlunos) {
        this.sportList = sportList;
    }

    ;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity_layout, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Sport sport = sportList.get(position);

        holder.bind(sport);

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    //método que atualiza a lista do adapter
    public void setResult(List<Sport> sports) {
        //verificar se o result já tem informação
        if (sports.size() == 0) {
            this.sportList = sports;
        } else {
            this.sportList.addAll(sports);
            notifyDataSetChanged();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textName;
        ImageView img;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.textName);
            img = itemView.findViewById(R.id.img);

        }

        public void bind(Sport sport) {
            img.setImageDrawable(img.getDrawable());
            textName.setText(textName.getText());

        }
    }
}
