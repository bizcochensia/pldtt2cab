/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Clemente
 */
public class MontoFrecuenciaDAO {
    
    
        public ResultSet obtenpoblacion(String a,String b){
    String aux="Select count(*) from operaciones where monto between '"+a+"' and '"+b+"' ";    
    Conexion cn = new Conexion ();
    Connection reg=cn.conectar();
    Statement st;
    ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery(aux);
            System.out.println("el resultado es"+aux);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
        
        public ResultSet obtenmonto(String a,String b){
    String aux="Select monto from operaciones where monto between '"+a+"' and '"+b+"' ";    
    Conexion cn = new Conexion ();
    Connection reg=cn.conectar();
    Statement st;
    ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery(aux);
            System.out.println("el resultado es"+aux);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
    
}
