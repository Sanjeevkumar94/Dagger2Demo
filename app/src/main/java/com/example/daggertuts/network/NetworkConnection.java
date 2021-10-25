package com.example.daggertuts.network;

import android.util.Log;

import com.example.daggertuts.BuildConfig;
import com.example.daggertuts.basics.Constants;

import javax.inject.Inject;

public class NetworkConnection {

    private String mEndpoint;

    @Inject
    public NetworkConnection(){
        Log.d("myTag","NetworkConnectionCalled");

        if(BuildConfig.DEBUG){
            this.mEndpoint= Constants.DEBUG_ENDPOINT;
        }else {
            this.mEndpoint=Constants.PROD_ENDPOINT;
        }

    }
    public String doReq() {
        return this.mEndpoint;
    }
}
