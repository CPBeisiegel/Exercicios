package com.example.pbanda.model;

import androidx.fragment.app.Fragment;

public class Album {

    private int imagem;
    private String nome;
    private Fragment fragment;

    public Album(int imagem,String nome, Fragment fragment) {
        this.imagem = imagem;
        this.nome = nome;
        this.fragment = fragment;
    }

    public Album(String nome, Fragment fragment){
        this.nome = nome;
        this.fragment = fragment;
    }


    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
