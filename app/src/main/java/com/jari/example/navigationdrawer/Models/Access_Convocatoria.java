package com.jari.example.navigationdrawer.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class Access_Convocatoria {
    @SerializedName("view")
    private boolean view;
    @SerializedName("edit")
    private boolean edit;
    @SerializedName("crearEmpleo")
    private boolean crearEmpleo;
    @SerializedName("publicarOpec")
    private boolean publicarOpec;
    @SerializedName("create")
    private boolean create;
    @SerializedName("gestionarCargador")
    private boolean gestionarCargador;
    @SerializedName("delete")
    private boolean delete;

    public Access_Convocatoria(boolean view, boolean edit, boolean crearEmpleo, boolean publicarOpec, boolean create, boolean gestionarCargador, boolean delete) {
        this.view = view;
        this.edit = edit;
        this.crearEmpleo = crearEmpleo;
        this.publicarOpec = publicarOpec;
        this.create = create;
        this.gestionarCargador = gestionarCargador;
        this.delete = delete;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public boolean isCrearEmpleo() {
        return crearEmpleo;
    }

    public void setCrearEmpleo(boolean crearEmpleo) {
        this.crearEmpleo = crearEmpleo;
    }

    public boolean isPublicarOpec() {
        return publicarOpec;
    }

    public void setPublicarOpec(boolean publicarOpec) {
        this.publicarOpec = publicarOpec;
    }

    public boolean isCreate() {
        return create;
    }

    public void setCreate(boolean create) {
        this.create = create;
    }

    public boolean isGestionarCargador() {
        return gestionarCargador;
    }

    public void setGestionarCargador(boolean gestionarCargador) {
        this.gestionarCargador = gestionarCargador;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }
}
