package com.example.projetoaudiopaginacao.repository;

import com.example.projetoaudiopaginacao.model.Artista;

import io.reactivex.Observable;

import static com.example.projetoaudiopaginacao.data.remote.RetrofitService.getApiService;

public class AlbumRepository {

    public Observable<Artista> getAlbum(String artista){
        return getApiService().getAllAlbuns(artista);
    }
}
