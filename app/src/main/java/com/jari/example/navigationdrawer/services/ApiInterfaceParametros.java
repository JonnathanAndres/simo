package com.jari.example.navigationdrawer.services;

import com.jari.example.navigationdrawer.models.parametros.Nivel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jonnathan on 11/09/2016.
 */
public interface ApiInterfaceParametros {
    //http://simo.cnsc.gov.co/niveles/list/
    @GET("/niveles/list/")
    Call<List<Nivel>> getNiveles();
}
