package com.jari.example.navigationdrawer.Model.opecvisible.generales.convocatoria;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by admin on 13/08/2016.
 */
public class EmpleoPorConvocatoria {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private List<Desagregado> desagregados;

    public EmpleoPorConvocatoria(int id, String descripcion, int valor, List<Desagregado> desagregados) {
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

    public List<Desagregado> getDesagregados() {
        return desagregados;
    }

    public void setDesagregados(List<Desagregado> desagregados) {
        this.desagregados = desagregados;
    }
}
