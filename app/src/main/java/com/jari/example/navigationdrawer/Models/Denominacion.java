package com.jari.example.navigationdrawer.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class Denominacion {
    @SerializedName("id")
    private int id;
    @SerializedName("nombre")
    private String nombre;

    public Denominacion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
