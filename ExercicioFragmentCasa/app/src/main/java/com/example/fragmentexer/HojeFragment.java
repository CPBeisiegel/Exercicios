package com.example.fragmentexer;


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
public class HojeFragment extends Fragment {

    private Button btnHoje;

    public HojeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tela, container, false);
        // Inflate the layout for this fragment
        btnHoje = view.findViewById(R.id.btnHoje);
        btnHoje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "O começo de uma noite memorável tem sempre lugar em um lindo pôr do sol.", Snackbar.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
