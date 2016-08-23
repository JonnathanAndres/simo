package com.jari.example.navigationdrawer.models.opecvisible.generales.rango;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 13/08/2016.
 */
public class EmpleoPorRango {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private Object desagregados;
}
