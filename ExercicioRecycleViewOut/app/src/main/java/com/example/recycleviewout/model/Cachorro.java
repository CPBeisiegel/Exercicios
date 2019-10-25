package com.example.recycleviewout.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Cachorro implements Parcelable {

    private String nome;

    private int imagem;

    public Cachorro(String nome, int imagem){
        this.nome = nome;
        this.imagem = imagem;
    }

    protected Cachorro(Parcel in) {
        nome = in.readString();
        imagem = in.readInt();
    }

    public static final Creator<Cachorro> CREATOR = new Creator<Cachorro>() {
        @Override
        public Cachorro createFromParcel(Parcel in) {
            return new Cachorro(in);
        }

        @Override
        public Cachorro[] newArray(int size) {
            return new Cachorro[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nome);
        parcel.writeInt(imagem);
    }
}


