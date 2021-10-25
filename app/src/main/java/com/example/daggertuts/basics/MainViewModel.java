package com.example.daggertuts.basics;

import android.util.Log;

import com.example.daggertuts.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    @Inject
     NetworkClient mClient;

    @Inject
    public MainViewModel() {
        Log.d("myTag","MainViewModelCalled");
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}
