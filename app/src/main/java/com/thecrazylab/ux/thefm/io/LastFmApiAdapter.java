package com.thecrazylab.ux.thefm.io;


import retrofit.RestAdapter;

/**
 * Created by federica on 04/02/16.
 */
public class LastFmApiAdapter {

    private static LastFmApiService API_SERVICE;

    public static LastFmApiService getApiService (){

        if(API_SERVICE == null){
            RestAdapter adapter = new RestAdapter.Builder()
                    .setEndpoint(ApiConstants.URL_BASE)
                    .setLogLevel(RestAdapter.LogLevel.BASIC)
                    .build();
            API_SERVICE = adapter.create(LastFmApiService.class);
        }

        return API_SERVICE;
    }
}
