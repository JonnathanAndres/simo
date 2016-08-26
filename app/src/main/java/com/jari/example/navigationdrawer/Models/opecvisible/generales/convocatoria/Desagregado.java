package com.jari.example.navigationdrawer.models.opecvisible.generales.convocatoria;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Desagregado implements Parcelable {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private Object desagregados;

    public Desagregado(Object desagregados, String descripcion, int id, int valor) {
        this.desagregados = desagregados;
        this.descripcion = descripcion;
        this.id = id;
        this.valor = valor;
    }

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

    protected Desagregado(Parcel in) {
        this.id = in.readInt();
        this.descripcion = in.readString();
        this.valor = in.readInt();
        //this.desagregados = in.readParcelable(Object.class.getClassLoader());
    }

    public static final Creator<Desagregado> CREATOR = new Creator<Desagregado>() {
        @Override
        public Desagregado createFromParcel(Parcel source) {
            return new Desagregado(source);
        }

        @Override
        public Desagregado[] newArray(int size) {
            return new Desagregado[size];
        }
    };
}
