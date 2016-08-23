package com.jari.example.navigationdrawer.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class Dependencia {
    @SerializedName("nombre")
    private String nombre;

    public Dependencia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
