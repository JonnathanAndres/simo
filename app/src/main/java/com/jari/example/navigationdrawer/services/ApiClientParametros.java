package com.jari.example.navigationdrawer.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientParametros {

    public static final String BASE_URL = "http://simo.cnsc.gov.co/";
    private static Retrofit retrofit = null;
    private static Retrofit retrofitEmpleos = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
