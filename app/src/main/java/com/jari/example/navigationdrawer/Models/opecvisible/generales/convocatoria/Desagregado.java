package com.jari.example.navigationdrawer.models.opecvisible.generales.convocatoria;

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

    public Desagregado(Object desagregados, String descripcion, int id, int valor) {
        this.desagregados = desagregados;
        this.descripcion = descripcion;
        this.id = id;
        this.valor = valor;
    }

    public Object getDesagregados() {
        return desagregados;
    }

    public void setDesagregados(Object desagregados) {
        this.desagregados = desagregados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
