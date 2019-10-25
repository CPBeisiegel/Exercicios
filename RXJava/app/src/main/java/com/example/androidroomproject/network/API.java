package com.example.androidroomproject.network;

import com.example.androidroomproject.model.Esporte;

import io.reactivex.Observable;
import retrofit2.http.GET;

interface API {

    @GET("/all.sports.php")
    Observable<Esporte> getAllSports();
}
