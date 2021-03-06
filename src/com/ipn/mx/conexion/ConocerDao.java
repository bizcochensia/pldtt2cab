package com.ipn.mx.conexion;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omarturo
 */
public class ConocerDao {
    static PreparedStatement st;
    int id = 1;
    private static final String Insert = "INSERT INTO intermedia_operacion_alarma (Operacion_id, Alarma_id, fechadeteccion, Descripcion,realizaOp) VALUES (?,?,?,?,?)";
    private static final String Insert2 = "INSERT INTO intermedia_operacion_alarma (Alarma_id, fechadeteccion, Descripcion,realizaOp,Empleado_id) VALUES (?,?,?,?,?)";


    
   
    public void EliminarDescripcion(int id) throws SQLException{
       String delete = "DELETE FROM CLIENTE WHERE  = "+id; 
       String op = "Select id_Operacion  FROM operaciones WHERE Operacion_id = "+id; 
       String aop; 
       Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
        try {  
            st = reg.prepareStatement(delete);
            st.executeUpdate();
           JOptionPane.showMessageDialog(null, "Eliminado");
        } catch (SQLException ex) {
             System.out.println(ex);
             JOptionPane.showMessageDialog(null, "No se puede Eliminar");
       
            
           
        }
    }
    
    public ResultSet mostrarDatos(){
        Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
        Statement st;
        ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery("SELECT * FROM cliente");
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
   
    
    public void RegistroDescripcion (int id_operacion, int id_alarma, java.sql.Date fechadeteccion, String Descripcion,int realizaOp) throws ClassNotFoundException, SQLException{
       Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
       
        try{
           
           st = reg.prepareStatement(Insert);
           st.setInt (1, id_operacion);
           st.setInt (2, id_alarma);
           st.setDate (3, fechadeteccion);
           st.setString (4, Descripcion);
           st.setInt (5, realizaOp);
            st.executeUpdate();
           
           }
        catch(Exception ex) {
            System.out.println(ex);
                    
        }
    }
   
        public void RegistroDescripcionListas (int id_alarma, java.sql.Date fechadeteccion, String Descripcion,int realizaOp,int empleado) throws ClassNotFoundException, SQLException{
       Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
       
        try{
           
           st = reg.prepareStatement(Insert2);
           st.setInt (1, id_alarma);
           st.setDate (2, fechadeteccion);
           st.setString (3, Descripcion);
           st.setInt (4, realizaOp);
           st.setInt(5, empleado);
            st.executeUpdate();
           
           }
        catch(Exception ex) {
            System.out.println(ex);
                    
        }
        
    }
     
        
    
    
    
    
    }
