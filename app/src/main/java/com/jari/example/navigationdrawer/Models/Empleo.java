package com.jari.example.navigationdrawer.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by admin on 12/08/2016.
 */
public class Empleo {
    @SerializedName("id")
    private int id;
    @SerializedName("asignacionSalarial")
    private long asignacionSalarial;
    @SerializedName("codigoEmpleo")
    private String codigoEmpleo;
    @SerializedName("sinCodigo")
    private boolean sinCodigo;
    @SerializedName("denominacion")
    private Denominacion denominacion;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("gradoNivel")
    private GradoNivel gradoNivel;
    @SerializedName("grupo")
    private Object grupo;
    @SerializedName("convocatoria")
    private Convocatoria convocatoria;
    @SerializedName("funciones")
    private List<Funcion> funciones;
    @SerializedName("requisitosMinimos")
    private List<RequisitoMinimo> requisitosMinimos;
    @SerializedName("vacantes")
    private List<Object> vacantes;
    @SerializedName("area")
    private Object area;
    @SerializedName("access")
    private Object access;

    public Empleo(int id, long asignacionSalarial, String codigoEmpleo, boolean sinCodigo, Denominacion denominacion, String descripcion, GradoNivel gradoNivel, Object grupo, Convocatoria convocatoria, List<Funcion> funciones, List<RequisitoMinimo> requisitosMinimos, List<Object> vacantes, Object area, Object access) {
        this.id = id;
        this.asignacionSalarial = asignacionSalarial;
        this.codigoEmpleo = codigoEmpleo;
        this.sinCodigo = sinCodigo;
        this.denominacion = denominacion;
        this.descripcion = descripcion;
        this.gradoNivel = gradoNivel;
        this.grupo = grupo;
        this.convocatoria = convocatoria;
        this.funciones = funciones;
        this.requisitosMinimos = requisitosMinimos;
        this.vacantes = vacantes;
        this.area = area;
        this.access = access;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAsignacionSalarial() {
        return asignacionSalarial;
    }

    public void setAsignacionSalarial(long asignacionSalarial) {
        this.asignacionSalarial = asignacionSalarial;
    }

    public String getCodigoEmpleo() {
        return codigoEmpleo;
    }

    public void setCodigoEmpleo(String codigoEmpleo) {
        this.codigoEmpleo = codigoEmpleo;
    }

    public boolean isSinCodigo() {
        return sinCodigo;
    }

    public void setSinCodigo(boolean sinCodigo) {
        this.sinCodigo = sinCodigo;
    }

    public Denominacion getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(Denominacion denominacion) {
        this.denominacion = denominacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GradoNivel getGradoNivel() {
        return gradoNivel;
    }

    public void setGradoNivel(GradoNivel gradoNivel) {
        this.gradoNivel = gradoNivel;
    }

    public Object getGrupo() {
        return grupo;
    }

    public void setGrupo(Object grupo) {
        this.grupo = grupo;
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public List<RequisitoMinimo> getRequisitosMinimos() {
        return requisitosMinimos;
    }

    public void setRequisitosMinimos(List<RequisitoMinimo> requisitosMinimos) {
        this.requisitosMinimos = requisitosMinimos;
    }

    public List<Object> getVacantes() {
        return vacantes;
    }

    public void setVacantes(List<Object> vacantes) {
        this.vacantes = vacantes;
    }

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public Object getAccess() {
        return access;
    }

    public void setAccess(Object access) {
        this.access = access;
    }
}
