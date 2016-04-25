/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ipn.clases;

/**
 *
 * @author bdfe_
 */
public class Alarma {

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public int getIdAlarma() {
        return idAlarma;
    }

    public void setIdAlarma(int idAlarma) {
        this.idAlarma = idAlarma;
    }

    public String getFechadeteccion() {
        return fechadeteccion;
    }

    public void setFechadeteccion(String fechadeteccion) {
        this.fechadeteccion = fechadeteccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    private int idOperacion;
    private int idAlarma;
    private String fechadeteccion;
    private String descripcion;
    
}
