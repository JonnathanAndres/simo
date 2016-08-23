package com.jari.example.navigationdrawer.services;

import com.jari.example.navigationdrawer.models.opecvisible.generales.convocatoria.EmpleoPorConvocatoria;
import com.jari.example.navigationdrawer.models.opecvisible.generales.departamento.EmpleoPorDepartamento;
import com.jari.example.navigationdrawer.models.opecvisible.generales.rango.EmpleoPorRango;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


//http://www.androidhive.info/2016/05/android-working-with-retrofit-http-library/
public interface ApiInterfaceEmpleos {

    @GET("convocatorias")
    Call<List<EmpleoPorConvocatoria>> getEmpleosPorConvocatorias();
    @GET("rangos")
    Call<List<EmpleoPorRango>> getEmpleosPorRangos();
    @GET("departamento")
    Call<List<EmpleoPorDepartamento>> getEmpleosPorDepartamentos();

}
