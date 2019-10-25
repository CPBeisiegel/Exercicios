package com.example.recycleviewout.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.recycleviewout.model.Cachorro;
import com.example.recycleviewout.adapter.CachorroAdapter;
import com.example.recycleviewout.R;
import com.example.recycleviewout.interfaces.RecycleViewOnClick;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecycleViewOnClick {

    private RecyclerView recyclerViewCachorro;
    private CachorroAdapter adapter;
    private List<Cachorro> cachorroList = new ArrayList<>();
    public static final String CACHORRO = "cachorro";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCachorro = findViewById(R.id.recyclerViewAnimais);

        adapter = new CachorroAdapter(listaDeCachorros(),this);

        recyclerViewCachorro.setAdapter(adapter);

        recyclerViewCachorro.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Cachorro> listaDeCachorros(){
        List<Cachorro> cachorros = new ArrayList<>();

        cachorros.add(new Cachorro("Rocky",R.drawable.cupcake));
        cachorros.add(new Cachorro("Blue",R.drawable.cupcake));
        cachorros.add(new Cachorro("Anger",R.drawable.cupcake));


        return cachorros;
    }

    @Override
    public void onClick(Cachorro cachorro) {
        Intent intent = new Intent (MainActivity.this,DetalheCachorroActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(CACHORRO , cachorro);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}



