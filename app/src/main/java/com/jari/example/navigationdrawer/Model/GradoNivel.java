package com.jari.example.navigationdrawer.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class GradoNivel {
    @SerializedName("grado")
    private String grado;
    @SerializedName("nivelNombre")
    private String nivelNombre;
    @SerializedName("access")
    private Access_GradoNivel access;

    public GradoNivel(String grado, String nivelNombre, Access_GradoNivel access) {
        this.grado = grado;
        this.nivelNombre = nivelNombre;
        this.access = access;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getNivelNombre() {
        return nivelNombre;
    }

    public void setNivelNombre(String nivelNombre) {
        this.nivelNombre = nivelNombre;
    }

    public Access_GradoNivel getAccess() {
        return access;
    }

    public void setAccess(Access_GradoNivel access) {
        this.access = access;
    }
}
