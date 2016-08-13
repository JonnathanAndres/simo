package com.jari.example.navigationdrawer.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class Convocatoria {
    @SerializedName("id")
    private int id;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("agno")
    private int agno;
    @SerializedName("codigo")
    private String codigo;
    @SerializedName("access")
    private Access_Convocatoria access;

    public Convocatoria(int id, String nombre, int agno, String codigo, Access_Convocatoria access) {
        this.id = id;
        this.nombre = nombre;
        this.agno = agno;
        this.codigo = codigo;
        this.access = access;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Access_Convocatoria getAccess() {
        return access;
    }

    public void setAccess(Access_Convocatoria access) {
        this.access = access;
    }
}
