package com.example.pbanda.views.fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pbanda.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FotoFragment extends Fragment {

    private static final String NOME = "nome";
    private static final String IMAGEM = "imagem";
    private TextView txtNomeAlbum;
    private ImageView imgView;

    public static Fragment novaInstancia(int imagem, String nomeAlbum){
        FotoFragment fotoFragment = new FotoFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(IMAGEM, imagem);
        bundle.putString(NOME, nomeAlbum);

        fotoFragment.setArguments(bundle);

        return fotoFragment;
    }


    public FotoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foto, container, false);


        initViews(view);

        if(getArguments() != null){

            int imagemRecebida = getArguments().getInt(IMAGEM);
            String nomeRecebido = getArguments().getString(NOME);

            Drawable drawable = getResources().getDrawable(imagemRecebida);

            imgView.setImageDrawable(drawable);
            txtNomeAlbum.setText(nomeRecebido);

        }


        return view;
    }

    private void initViews(View view) {

        txtNomeAlbum = view.findViewById(R.id.textView);
        imgView = view.findViewById(R.id.imageView);

    }

}
