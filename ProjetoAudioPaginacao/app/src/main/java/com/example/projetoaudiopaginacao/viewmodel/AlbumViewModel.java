package com.example.projetoaudiopaginacao.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.projetoaudiopaginacao.model.Album;
import com.example.projetoaudiopaginacao.repository.AlbumRepository;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class AlbumViewModel extends AndroidViewModel {

    private MutableLiveData<List<Album>> listaAlbum = new MutableLiveData<>();
    private MutableLiveData<Boolean> loading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private AlbumRepository repository = new AlbumRepository();


    public LiveData<List<Album>> getListaAlbum(){
        return this.listaAlbum;
    }

    public LiveData<Boolean> getLoading() {
        return this.loading;
    }

    public AlbumViewModel(@NonNull Application application) {
        super(application);
    }

    public void getAlbuns(String artista){
        disposable.add(
                repository.getAlbum(artista)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(disposable1 -> {
                    loading.setValue(true);
                })
                .doOnTerminate(() -> {
                    loading.setValue(false);
                })
                .subscribe(artista1 -> {
                    listaAlbum.setValue(artista1.getAlbum());
                }, throwable -> {
                    Log.i("LOG","Error" + throwable.getMessage());
                })


        );
    }
}
