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
public class Operacion {
    private int idOperacion;
    private String contrato;
    private double monto;
    private String fecha;
    private double riesgo;
    private String descripcion;
    private int clienteid;
    private int empleadoid;
    private int inmobiliariaid;
    private int tipoid;
    private int monedaid;
    private int monetarioid;

    public Operacion() {
    }

    public Operacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    
    
    
    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(double riesgo) {
        this.riesgo = riesgo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public int getEmpleadoid() {
        return empleadoid;
    }

    public void setEmpleadoid(int empleadoid) {
        this.empleadoid = empleadoid;
    }

    public int getInmobiliariaid() {
        return inmobiliariaid;
    }

    public void setInmobiliariaid(int inmobiliariaid) {
        this.inmobiliariaid = inmobiliariaid;
    }

    public int getTipoid() {
        return tipoid;
    }

    public void setTipoid(int tipoid) {
        this.tipoid = tipoid;
    }

    public int getMonedaid() {
        return monedaid;
    }

    public void setMonedaid(int monedaid) {
        this.monedaid = monedaid;
    }

    public int getMonetarioid() {
        return monetarioid;
    }

    public void setMonetarioid(int monetarioid) {
        this.monetarioid = monetarioid;
    }
    
    
     @Override
    public String toString() {
        return  String.valueOf(idOperacion); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
