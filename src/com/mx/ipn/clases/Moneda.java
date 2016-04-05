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
public class Moneda {
  private int id_moneda;
  private String clave;
  private String moneda;
  private String pais_moneda;

    public int getId_moneda() {
        return id_moneda;
    }

    public void setId_moneda(int id_moneda) {
        this.id_moneda = id_moneda;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPais_moneda() {
        return pais_moneda;
    }

    public void setPais_moneda(String pais_moneda) {
        this.pais_moneda = pais_moneda;
    }
    
  //

    @Override
    public String toString() {
        return  moneda;
    }
    
    
  
}
