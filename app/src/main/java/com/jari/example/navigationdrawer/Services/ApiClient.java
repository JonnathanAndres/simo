package com.jari.example.navigationdrawer.Services;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "http://simo.cnsc.gov.co/empleos/opecvisible/generales/";
    public static final String BASE_URL_EMPLEOS = "http://simo.cnsc.gov.co/empleos/";
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

    public static Retrofit getClientOfertaPublica() {
        final OkHttpClient okHttpClient = //new OkHttpClient();
        new OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)
                .build();
//        okHttpClient.setReadTimeout(20, TimeUnit.SECONDS);
//        okHttpClient.setConnectTimeout(20, TimeUnit.SECONDS);
        if (retrofitEmpleos==null) {
            retrofitEmpleos = new Retrofit.Builder()
                    .baseUrl(BASE_URL_EMPLEOS)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofitEmpleos;
    }

}
