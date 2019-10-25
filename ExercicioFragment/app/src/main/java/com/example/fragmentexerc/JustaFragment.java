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
public class JustaFragment extends Fragment {

    private Button btnCuriosidade2;

    public JustaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_ciclo_exerc2, container, false);

        btnCuriosidade2 = view.findViewById(R.id.btnCuriosidade2);
        btnCuriosidade2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "O acesso a praia da justa é pela rodovia km 28", Snackbar.LENGTH_LONG).show();
            }
        });

        return view;
    }

}
