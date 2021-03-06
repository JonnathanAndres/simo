package com.jari.example.navigationdrawer.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 12/08/2016. OK
 */
public class Access_RequisitoMinimo {
    @SerializedName("view")
    private boolean view;
    @SerializedName("edit")
    private boolean edit;
    @SerializedName("delete")
    private boolean delete;

    public Access_RequisitoMinimo(boolean view, boolean edit, boolean delete) {
        this.view = view;
        this.edit = edit;
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

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }
}
