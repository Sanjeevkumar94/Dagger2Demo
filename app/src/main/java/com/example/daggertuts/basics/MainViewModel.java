package com.example.daggertuts.basics;

import com.example.daggertuts.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    private NetworkClient mClient;

    @Inject
    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}
