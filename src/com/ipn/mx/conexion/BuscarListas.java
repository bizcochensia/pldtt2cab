/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author bdfe_
 */
public class BuscarListas {
     static PreparedStatement st;
     
public ResultSet mostrarDatos(){
       ConexionListas cn = new ConexionListas ();
       Connection reg=cn.conectar();
        Statement st;
        ResultSet rs = null;
        try{
            st=reg.createStatement();
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
}
