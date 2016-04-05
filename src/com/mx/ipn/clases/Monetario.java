/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ipn.clases;

/**
 *
 * @author Clemente
 */
public class Monetario {
    private int id_clavemonetario;
    private int clave;
    private String instrumento_monetario;
    private String descripcion;

    public int getId_clavemonetario() {
        return id_clavemonetario;
    }

    public void setId_clavemonetario(int id_clavemonetario) {
        this.id_clavemonetario = id_clavemonetario;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getInstrumento_monetario() {
        return instrumento_monetario;
    }

    public void setInstrumento_monetario(String instrumento_monetario) {
        this.instrumento_monetario = instrumento_monetario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return instrumento_monetario;
    }
    
    
    
}
