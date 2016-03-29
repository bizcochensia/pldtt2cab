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
public class Actividades {
    public int id_actividad;
    public int folio;
    public String actividad;
    public int riesgo;

    //constructores

    public Actividades(int id_actividad, int folio, String actividad, int riesgo) {
        this.id_actividad = id_actividad;
        this.folio = folio;
        this.actividad = actividad;
        this.riesgo = riesgo;
    }

    public Actividades() {
    }

    
    
    
    
    //getters y setters
    
    public int getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }
    
    
    
    //toString

    @Override
    public String toString() {
        return actividad; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
