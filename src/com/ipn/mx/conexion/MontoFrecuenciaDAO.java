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

/**
 *
 * @author Clemente
 */
public class MontoFrecuenciaDAO {
    static PreparedStatement st;
    
    
        public void insertaalarma(int idoperacion,int idalarma,String fecha, String descripcion) throws ClassNotFoundException, SQLException{
       String inserta = "insert into intermedia_operacion_alarma(Operacion_id,Alarma_id,fechadeteccion,Descripcion) values(?,?,?,?) ";
       
       Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
       
        try{
           
           st = reg.prepareStatement(inserta);
           st.setInt (1, idoperacion);
           st.setInt (2, idalarma);
           st.setString (3, fecha);
           st.setString (4, descripcion);
           st.executeUpdate();
           
           }
        catch(SQLException ex) {
            System.out.println(ex);
                    
        }
    }
    
    
    
    
    public ResultSet obtenidcontrato(String a){
 
    String aux="Select id_Operacion  from operaciones  where numeroContrato='"+a+"' ";    
    Conexion cn = new Conexion ();
    Connection reg=cn.conectar();
    Statement st;
    ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery(aux);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
    
    
    
        public ResultSet obtenpoblacion(String a,String b){
 
    String aux="Select count(*) as poblacion from operaciones o inner join cliente c on c.id_cliente=o.Cliente_id where c.ingreso_Promedio between '"+a+"' and '"+b+"' ";    
    Conexion cn = new Conexion ();
    Connection reg=cn.conectar();
    Statement st;
    ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery(aux);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
        
            public ResultSet obtencontrato(String a){
    String aux="Select numeroContrato from operaciones where  numeroContrato='"+a+"' ";    
    Conexion cn = new Conexion ();
    Connection reg=cn.conectar();
    Statement st;
    ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery(aux);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
        
        public ResultSet obtenmontos(String a,String b){
    String aux="select o.monto from operaciones o inner join cliente c on c.id_cliente=o.Cliente_id where c.ingreso_Promedio between   '"+a+"' and '"+b+"' ";    
    Conexion cn = new Conexion ();
    Connection reg=cn.conectar();
    Statement st;
    ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery(aux);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
        
                public ResultSet obtenerFechas(String a,String b){
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
    
}
