package com.jari.example.navigationdrawer.models.parametros;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jonnathan on 11/09/2016.
 */
public class Nivel implements Parcelable {
    private String id;
    private String nombre;

    public Nivel() {
    }

    public Nivel(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.nombre);
    }

    protected Nivel(Parcel in) {
        this.id = in.readString();
        this.nombre = in.readString();
    }

    public static final Creator<Nivel> CREATOR = new Creator<Nivel>() {
        @Override
        public Nivel createFromParcel(Parcel source) {
            return new Nivel(source);
        }

        @Override
        public Nivel[] newArray(int size) {
            return new Nivel[size];
        }
    };
}
