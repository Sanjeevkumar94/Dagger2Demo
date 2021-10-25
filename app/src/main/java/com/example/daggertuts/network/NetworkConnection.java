package com.example.daggertuts.network;

import com.example.daggertuts.BuildConfig;
import com.example.daggertuts.basics.Constants;

import javax.inject.Inject;

public class NetworkConnection {

    private String mEndpoint;

    @Inject
    public NetworkConnection(){

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
