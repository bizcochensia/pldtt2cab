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
public class TipoOperacion {
    private int id_tipoOp;
    private int clave;
    private String tipo_Operacion;
    private String descripcion;

    public int getId_tipoOp() {
        return id_tipoOp;
    }

    public void setId_tipoOp(int id_tipoOp) {
        this.id_tipoOp = id_tipoOp;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getTipo_Operacion() {
        return tipo_Operacion;
    }

    public void setTipo_Operacion(String tipo_Operacion) {
        this.tipo_Operacion = tipo_Operacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return tipo_Operacion;
    }
    
    
    
}
