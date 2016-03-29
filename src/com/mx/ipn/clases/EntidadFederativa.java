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
public class EntidadFederativa {
    public int idEntidadFederativa;
    public String nombre;
    public int idPais;

    //constructores
    
    public EntidadFederativa(int idEntidadFederativa, String nombre, int idPais) {
        this.idEntidadFederativa = idEntidadFederativa;
        this.nombre = nombre;
        this.idPais = idPais;
    }

    public EntidadFederativa() {
    }
    
    
    
    //getters and setters

    public int getIdEntidadFederativa() {
        return idEntidadFederativa;
    }

    public void setIdEntidadFederativa(int idEntidadFederativa) {
        this.idEntidadFederativa = idEntidadFederativa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
