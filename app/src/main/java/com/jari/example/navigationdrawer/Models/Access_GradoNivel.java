package com.jari.example.navigationdrawer.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class Access_GradoNivel {
    @SerializedName("view")
    private boolean view;
    @SerializedName("edit")
    private boolean edit;
    @SerializedName("create")
    private boolean create;
    @SerializedName("delete")
    private boolean delete;

    public Access_GradoNivel(boolean view, boolean edit, boolean create, boolean delete) {
        this.view = view;
        this.edit = edit;
        this.create = create;
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

    public boolean isCreate() {
        return create;
    }

    public void setCreate(boolean create) {
        this.create = create;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }
}
