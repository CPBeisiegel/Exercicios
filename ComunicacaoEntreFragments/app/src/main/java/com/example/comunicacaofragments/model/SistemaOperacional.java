package com.example.comunicacaofragments.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

public class SistemaOperacional implements Parcelable {

    private int imagem;
    private String nome;

    protected SistemaOperacional(Parcel in) {
        imagem = in.readInt();
        nome = in.readString();
    }

    public static final Creator<SistemaOperacional> CREATOR = new Creator<SistemaOperacional>() {
        @Override
        public SistemaOperacional createFromParcel(Parcel in) {
            return new SistemaOperacional(in);
        }

        @Override
        public SistemaOperacional[] newArray(int size) {
            return new SistemaOperacional[size];
        }
    };

    public int getImagem() {
        return imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setImagem(int image) {
        this.imagem = image;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SistemaOperacional(){

    }

    public SistemaOperacional(int imagem, String nomeAndroid){
        this.nome = nomeAndroid;
        this.imagem = imagem;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(imagem);
        parcel.writeString(nome);
    }
}
