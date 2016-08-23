package com.jari.example.navigationdrawer.services;

import com.jari.example.navigationdrawer.models.Departamento;
import com.jari.example.navigationdrawer.models.ResultadoOfertaPublica;
import com.jari.example.navigationdrawer.models.opecvisible.generales.convocatoria.EmpleoPorConvocatoria;
import com.jari.example.navigationdrawer.models.opecvisible.generales.departamento.EmpleoPorDepartamento;
import com.jari.example.navigationdrawer.models.opecvisible.generales.rango.EmpleoPorRango;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


//http://www.androidhive.info/2016/05/android-working-with-retrofit-http-library/
public interface ApiInterface {
    @GET("departamento")
    Call<List<Departamento>> getDepartamentos();
    @GET("ofertaPublica/")
    Call<List<Object>> getOfertaPublica(@Query("search_palabraClave")String palabraClave);
    @GET("ofertaPublica/")
    Call<List<ResultadoOfertaPublica>> getOfertaPublica(@Query("search_palabraClave")String palabraClave, @Query("size")int numeroRegistros);

    @GET("convocatorias")
    Call<List<EmpleoPorConvocatoria>> getEmpleosPorConvocatorias();
    @GET("rangos")
    Call<List<EmpleoPorRango>> getEmpleosPorRangos();
    @GET("departamento")
    Call<List<EmpleoPorDepartamento>> getEmpleosPorDepartamentos();


//    @GET("movie/top_rated")
//    Call<Departamento> getDepartamentos( @Query("departamento") String apiKey);

//    @GET("movie/{id}")
//    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
