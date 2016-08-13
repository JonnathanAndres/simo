package com.jari.example.navigationdrawer.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016.
 */
public class OfertaPublica {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String empleo;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private String desagregados;
}
