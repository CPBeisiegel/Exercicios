package com.example.projetoaudiopaginacao.data.remote;

import com.example.projetoaudiopaginacao.model.Artista;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AudioAPI {

    @GET("searchalbum.php")
    Observable<Artista> getAllAlbuns(
            @Query("s") String artista
    );



}
