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
public class Localidad {
    public int idlocalidad;
    public int idEntidadFed;
    public String nombre;
    
    //constructores

    public Localidad(int idlocalidad, int idEntidadFed, String nombre) {
        this.idlocalidad = idlocalidad;
        this.idEntidadFed = idEntidadFed;
        this.nombre = nombre;
    }

    public Localidad() {
    }
    
    //setters an getters

    public int getIdlocalidad() {
        return idlocalidad;
    }

    public void setIdlocalidad(int idlocalidad) {
        this.idlocalidad = idlocalidad;
    }

    public int getIdEntidadFed() {
        return idEntidadFed;
    }

    public void setIdEntidadFed(int idEntidadFed) {
        this.idEntidadFed = idEntidadFed;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //modificados

    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
