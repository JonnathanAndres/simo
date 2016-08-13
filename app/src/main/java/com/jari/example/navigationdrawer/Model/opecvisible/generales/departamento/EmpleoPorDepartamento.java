package com.jari.example.navigationdrawer.Model.opecvisible.generales.departamento;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 13/08/2016.
 */
public class EmpleoPorDepartamento {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private Object desagregados;

    public EmpleoPorDepartamento(int id, String descripcion, int valor, Object desagregados) {
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

    public Object getDesagregados() {
        return desagregados;
    }

    public void setDesagregados(Object desagregados) {
        this.desagregados = desagregados;
    }
}
