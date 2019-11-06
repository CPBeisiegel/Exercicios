package com.example.apptestandohttp.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.apptestandohttp.model.Result;
import com.example.apptestandohttp.repository.FilmeRepositary;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class FilmeViewModel extends AndroidViewModel {

    private MutableLiveData<List<Result>> listaFilme = new MutableLiveData<>();
    private MutableLiveData<Boolean> loading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private FilmeRepositary repositary = new FilmeRepositary();

    public LiveData<List<Result>> getListaFilme(){
        return this.listaFilme;
    }

    public LiveData<Boolean> getLoading(){
        return this.loading;
    }

    public void getAllFilmes(String apiKey){

        disposable.add(
                repositary.getFilmes(apiKey)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(disposable1 -> loading.setValue(true))
                .doOnTerminate(() -> loading.setValue(false))
                .subscribe(filmeResult -> {
                    listaFilme.setValue(filmeResult.getResults());
                },
                  throwable -> {
                      Log.i("LOG","erro" + throwable.getMessage());
                  }
                        )
        );

    }


    public FilmeViewModel(@NonNull Application application) {
        super(application);
    }
}
