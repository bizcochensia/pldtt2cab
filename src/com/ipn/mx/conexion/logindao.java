/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clemente
 */
public class logindao {
    private static final String login="SELECT * FROM empleado WHERE usuario=? && contrasena=?";
    static PreparedStatement prState;
    ResultSet result;
    
    public String aceso(String usuario,String contrasena){
        String tipo=""; 
        try {
             Conexion con=new Conexion();
             Connection reg=con.conectar();
             prState = reg.prepareStatement(login);
             prState.setString(1,usuario);
             prState.setString(2,contrasena);
             result=prState.executeQuery();
             while(result.next()){
             tipo=result.getString("tipo_empleado");
             }
        } catch (SQLException ex) {
            Logger.getLogger(logindao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipo;
    }
    
    public String obtennombre(String usuario,String contrasena){
    String nombre="";
    try {
             Conexion con=new Conexion();
             Connection reg=con.conectar();
             prState = reg.prepareStatement(login);
             prState.setString(1,usuario);
             prState.setString(2,contrasena);
             result=prState.executeQuery();
             while(result.next()){
             nombre=result.getString("nombre");
             }
        } catch (SQLException ex) {
            Logger.getLogger(logindao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
    }
    
    
    public int obtenid(String usuario,String contrasena){
    int id=0;
    try {
             Conexion con=new Conexion();
             Connection reg=con.conectar();
             prState = reg.prepareStatement(login);
             prState.setString(1,usuario);
             prState.setString(2,contrasena);
             result=prState.executeQuery();
             while(result.next()){
             id=result.getInt("id_Empleado");
             }
        } catch (SQLException ex) {
            Logger.getLogger(logindao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    
}
