package com.example.androidroomproject.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.androidroomproject.model.Esporte;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.example.androidroomproject.network.RetrofitService.getApiService;


public class EsporteViewModel extends AndroidViewModel {

    private MutableLiveData<List<Esporte>> esporteLiveDate = new MutableLiveData<>();
    private MutableLiveData<Boolean> loading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();


    public EsporteViewModel(@NonNull Application application) {
        super(application);
    }

    public void getEsporte() {
        disposable.add(
                getApiService().getAllSports()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(Disposable disposable) -> {
                    loading.setValue(true);
        }}
         .doOnTerminate(() ->
    loading.setValue(false);
    }}
    .subscribe({Esporte esporte} -> )

}
