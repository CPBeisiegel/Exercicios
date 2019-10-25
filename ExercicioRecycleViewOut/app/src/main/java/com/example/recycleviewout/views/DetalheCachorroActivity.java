package com.example.recycleviewout.views;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recycleviewout.model.Cachorro;
import com.example.recycleviewout.R;

import static com.example.recycleviewout.views.MainActivity.CACHORRO;

public class DetalheCachorroActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textViewNome;
    private TextView textDetalhe;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalheactivity);

        initViews();

        if(getIntent() != null && getIntent().getExtras() != null){

            Cachorro cachorro = getIntent().getExtras().getParcelable(CACHORRO);

            Drawable drawable = getResources().getDrawable(cachorro.getImagem());
            imageView.setImageDrawable(drawable);
            textViewNome.setText(cachorro.getNome());

        }


    }

    private void initViews() {
       imageView = findViewById(R.id.imageViewF);
       textViewNome = findViewById(R.id.textDetalhe);
    }


}


