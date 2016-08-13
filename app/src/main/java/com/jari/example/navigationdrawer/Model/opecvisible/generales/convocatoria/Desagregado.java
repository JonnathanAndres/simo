package com.jari.example.navigationdrawer.Model.opecvisible.generales.convocatoria;

import com.google.gson.annotations.SerializedName;

public class Desagregado {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private Object desagregados;
}
