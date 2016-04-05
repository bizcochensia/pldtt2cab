package com.mx.ipn.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bdfernandez
 */
public class Cliente {
    private int idCLiente;
    private String nombre;
    private String apellPat;
    private String apellMat;
    private String fecha_nac;
    private int tipo;
    private String rfc;
    private String calle;
    private String numero;
    private int PaisOrigen;
    private int PaisResidencia;
    private int entidad;
    private int localidad;
    private String codigoPostal;
    private String numTel;
    private double riesgo;
    private String Actividad;
    private Double Ingreso;

    public int getIdCLiente() {
        return idCLiente;
    }

    public void setIdCLiente(int idCLiente) {
        this.idCLiente = idCLiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int getPaisResidencia() {
        return PaisResidencia;
    }

    public void setPaisResidencia(int PaisResidencia) {
        this.PaisResidencia = PaisResidencia;
    }

    public double getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(double riesgo) {
        this.riesgo = riesgo;
    }

    
    
    public String getApellPat() {
        return apellPat;
    }

    public void setApellPat(String apellPat) {
        this.apellPat = apellPat;
    }

    public String getApellMat() {
        return apellMat;
    }

    public void setApellMat(String apellMat) {
        this.apellMat = apellMat;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(int PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public int getEntidad() {
        return entidad;
    }

    public void setEntidad(int entidad) {
        this.entidad = entidad;
    }

        public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }
    
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public Double getIngreso() {
        return Ingreso;
    }

    public void setIngreso(Double Ingreso) {
        this.Ingreso = Ingreso;
    }

    @Override
    public String toString() {
        String regreso= nombre + "  RFC asociado :"+rfc;
        return regreso; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
