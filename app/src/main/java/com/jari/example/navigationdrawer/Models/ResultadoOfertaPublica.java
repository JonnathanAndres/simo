package com.jari.example.navigationdrawer.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class ResultadoOfertaPublica {
    @SerializedName("id")
    private int id;
    @SerializedName("empleo")
    private Empleo empleo;
    @SerializedName("estadoInscripcion")
    private Object estadoInscripcion;
    @SerializedName("favorito")
    private boolean favorito;
    @SerializedName("inscripcionId")
    private Object inscripcionId;
    @SerializedName("access")
    private Object access;

    public ResultadoOfertaPublica(int id, Empleo empleo, Object estadoInscripcion, boolean favorito, Object inscripcionId, Object access) {
        this.id = id;
        this.empleo = empleo;
        this.estadoInscripcion = estadoInscripcion;
        this.favorito = favorito;
        this.inscripcionId = inscripcionId;
        this.access = access;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleo getEmpleo() {
        return empleo;
    }

    public void setEmpleo(Empleo empleo) {
        this.empleo = empleo;
    }

    public Object getEstadoInscripcion() {
        return estadoInscripcion;
    }

    public void setEstadoInscripcion(Object estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public Object getInscripcionId() {
        return inscripcionId;
    }

    public void setInscripcionId(Object inscripcionId) {
        this.inscripcionId = inscripcionId;
    }

    public Object getAccess() {
        return access;
    }

    public void setAccess(Object access) {
        this.access = access;
    }
}
