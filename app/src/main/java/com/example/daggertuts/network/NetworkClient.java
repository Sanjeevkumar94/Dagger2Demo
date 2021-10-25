package com.example.daggertuts.network;

import android.util.Log;

import javax.inject.Inject;

public class NetworkClient {
    private NetworkConnection mConnection;

    @Inject
    public NetworkClient(NetworkConnection connection) {
        Log.d("myTag","NetworkClientCalled");
        this.mConnection = connection;
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}
