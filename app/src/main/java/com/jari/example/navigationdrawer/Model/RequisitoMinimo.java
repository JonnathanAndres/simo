package com.jari.example.navigationdrawer.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by admin on 12/08/2016.
 */
public class RequisitoMinimo {
    @SerializedName("estudio")
    private String estudio;
    @SerializedName("experiencia")
    private String experiencia;
    @SerializedName("alternativas")
    private List<Alternativa> alternativas;
    @SerializedName("equivalencias")
    private List<Object> equivalencias;
    @SerializedName("access")
    private Object access;

    public RequisitoMinimo(String estudio, String experiencia, List<Alternativa> alternativas, List<Object> equivalencias, Object access) {
        this.estudio = estudio;
        this.experiencia = experiencia;
        this.alternativas = alternativas;
        this.equivalencias = equivalencias;
        this.access = access;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }

    public List<Object> getEquivalencias() {
        return equivalencias;
    }

    public void setEquivalencias(List<Object> equivalencias) {
        this.equivalencias = equivalencias;
    }

    public Object getAccess() {
        return access;
    }

    public void setAccess(Object access) {
        this.access = access;
    }
}
