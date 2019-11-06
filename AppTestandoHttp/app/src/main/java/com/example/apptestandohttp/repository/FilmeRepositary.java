package com.example.apptestandohttp.repository;

import com.example.apptestandohttp.model.FilmeResult;

import io.reactivex.Observable;

import static com.example.apptestandohttp.data.remote.RetrofitService.getApiService;

public class FilmeRepositary {

   public Observable<FilmeResult> getFilmes(String apiKey){
        return getApiService().getAllFilmes(apiKey);
    }
}
