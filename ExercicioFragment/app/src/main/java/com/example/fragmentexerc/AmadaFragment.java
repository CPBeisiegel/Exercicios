package com.example.fragmentexerc;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class AmadaFragment extends Fragment {

    private Button btnCuriosidade;

    public AmadaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ciclo_exec, container, false);

         btnCuriosidade = view.findViewById(R.id.btnCuriosidade);

        btnCuriosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "A praia mais bela",Snackbar.LENGTH_LONG).show();
            }
        });

        return view;
    }

}
