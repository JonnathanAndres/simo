package com.jari.example.navigationdrawer.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class Alternativa {
    @SerializedName("estudio")
    private String estudio;
    @SerializedName("experiencia")
    private String experiencia;
    @SerializedName("access")
    private Access_Alternativa access;

    public Alternativa(String estudio, String experiencia, Access_Alternativa access) {
        this.estudio = estudio;
        this.experiencia = experiencia;
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

    public Access_Alternativa getAccess() {
        return access;
    }

    public void setAccess(Access_Alternativa access) {
        this.access = access;
    }
}
