package com.jari.example.navigationdrawer.models.opecvisible.generales.rango;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 13/08/2016.
 */
public class EmpleoPorRango implements Parcelable {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private Object desagregados;

    public Object getDesagregados() {
        return desagregados;
    }

    public void setDesagregados(Object desagregados) {
        this.desagregados = desagregados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.descripcion);
        dest.writeInt(this.valor);
        //dest.writeParcelable(this.desagregados, flags);
    }

    public EmpleoPorRango() {
    }

    protected EmpleoPorRango(Parcel in) {
        this.id = in.readInt();
        this.descripcion = in.readString();
        this.valor = in.readInt();
        //this.desagregados = in.readParcelable(Object.class.getClassLoader());
    }

    public static final Creator<EmpleoPorRango> CREATOR = new Creator<EmpleoPorRango>() {
        @Override
        public EmpleoPorRango createFromParcel(Parcel source) {
            return new EmpleoPorRango(source);
        }

        @Override
        public EmpleoPorRango[] newArray(int size) {
            return new EmpleoPorRango[size];
        }
    };
}
