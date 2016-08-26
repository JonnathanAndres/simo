package com.jari.example.navigationdrawer.models.opecvisible.generales.convocatoria;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 13/08/2016.
 */
public class EmpleoPorConvocatoria implements Parcelable {
    @SerializedName("id")
    private int id;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("valor")
    private int valor;
    @SerializedName("desagregados")
    private List<Desagregado> desagregados;

    public EmpleoPorConvocatoria(int id, String descripcion, int valor, List<Desagregado> desagregados) {
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

    public List<Desagregado> getDesagregados() {
        return desagregados;
    }

    public void setDesagregados(List<Desagregado> desagregados) {
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
        dest.writeList(this.desagregados);
    }

    protected EmpleoPorConvocatoria(Parcel in) {
        this.id = in.readInt();
        this.descripcion = in.readString();
        this.valor = in.readInt();
        this.desagregados = new ArrayList<Desagregado>();
        in.readList(this.desagregados, Desagregado.class.getClassLoader());
    }

    public static final Creator<EmpleoPorConvocatoria> CREATOR = new Creator<EmpleoPorConvocatoria>() {
        @Override
        public EmpleoPorConvocatoria createFromParcel(Parcel source) {
            return new EmpleoPorConvocatoria(source);
        }

        @Override
        public EmpleoPorConvocatoria[] newArray(int size) {
            return new EmpleoPorConvocatoria[size];
        }
    };
}
