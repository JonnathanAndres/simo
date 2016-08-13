package com.jari.example.navigationdrawer.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class Vacante {
    @SerializedName("cantidad")
    private int cantidad;
    @SerializedName("municipio")
    private Municipio municipio;
    @SerializedName("dependencia")
    private Dependencia dependencia;

    public Vacante(int cantidad, Municipio municipio, Dependencia dependencia) {
        this.cantidad = cantidad;
        this.municipio = municipio;
        this.dependencia = dependencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }
}
