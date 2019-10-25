package com.example.comunicacaofragments.views;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.comunicacaofragments.R;
import com.example.comunicacaofragments.interfaces.Comunicador;
import com.example.comunicacaofragments.model.SistemaOperacional;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {

    private Comunicador comunicador;
    private Button btnAndroid;
    private Button btnIos;



    public PrimeiroFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            comunicador = (Comunicador) context;
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_primeiro, container, false);

        initViews(view);

        btnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SistemaOperacional android = new SistemaOperacional(R.drawable.cupcake, "Android Cupcake 1.5 lançado em 2000");

                comunicador.receber(android);
            }
        });

        btnIos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             SistemaOperacional ios = new SistemaOperacional(R.drawable.ios, "IOS 7 lançado publicamente em setembro de 2013");

             comunicador.receber(ios);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void initViews(View view){
        btnAndroid = view.findViewById(R.id.btnAndroid);
        btnIos = view.findViewById(R.id.btnIos);
    }

}
