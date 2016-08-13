package com.jari.example.navigationdrawer.Services;

import com.jari.example.navigationdrawer.Model.Departamento;
import com.jari.example.navigationdrawer.Model.ResultadoOfertaPublica;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


//http://www.androidhive.info/2016/05/android-working-with-retrofit-http-library/
public interface ApiInterface {
    @GET("departamento")
    Call<List<Departamento>> getDepartamentos();
    @GET("ofertaPublica/")
    Call<List<Object>> getOfertaPublica(@Query("search_palabraClave")String palabraClave);
    @GET("ofertaPublica/")
    Call<List<ResultadoOfertaPublica>> getOfertaPublica(@Query("search_palabraClave")String palabraClave, @Query("size")int numeroRegistros);


//    @GET("movie/top_rated")
//    Call<Departamento> getDepartamentos( @Query("departamento") String apiKey);

//    @GET("movie/{id}")
//    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
