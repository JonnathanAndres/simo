package com.jari.example.navigationdrawer.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016.
 */
public class Departamento {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private String desagregados;

    public Departamento(int id, String descripcion, int valor, String desagregados) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
        this.desagregados = desagregados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDesagregados() {
        return desagregados;
    }

    public void setDesagregados(String desagregados) {
        this.desagregados = desagregados;
    }
}
