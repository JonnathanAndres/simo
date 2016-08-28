package com.jari.example.navigationdrawer.models.opecvisible.generales.departamento;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 13/08/2016.
 */
public class EmpleoPorDepartamento implements Parcelable {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private Object desagregados;

    public EmpleoPorDepartamento(int id, String descripcion, int valor, Object desagregados) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
        this.desagregados = desagregados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Object getDesagregados() {
        return desagregados;
    }

    public void setDesagregados(Object desagregados) {
        this.desagregados = desagregados;
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

    protected EmpleoPorDepartamento(Parcel in) {
        this.id = in.readInt();
        this.descripcion = in.readString();
        this.valor = in.readInt();
        //this.desagregados = in.readParcelable(Object.class.getClassLoader());
    }

    public static final Parcelable.Creator<EmpleoPorDepartamento> CREATOR = new Parcelable.Creator<EmpleoPorDepartamento>() {
        @Override
        public EmpleoPorDepartamento createFromParcel(Parcel source) {
            return new EmpleoPorDepartamento(source);
        }

        @Override
        public EmpleoPorDepartamento[] newArray(int size) {
            return new EmpleoPorDepartamento[size];
        }
    };
}
