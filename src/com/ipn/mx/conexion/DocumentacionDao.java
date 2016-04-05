package com.ipn.mx.conexion;


import java.sql.Connection;
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
public class DocumentacionDao {
    
    
    private static final String Insert = "INSERT INTO operacion_documentacion (operacion_id, documento_id, folio) VALUES (?,?,?)"; 

    
     public void RegistroDocumento (int id_operacion, int id_documento,String folio) throws ClassNotFoundException, SQLException{
       Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
       
       PreparedStatement st = null;
        
        try{
           
           st = reg.prepareStatement(Insert);
           st.setInt (1, id_operacion);
           st.setInt (2, id_documento);
           st.setString (3, folio);
           st.executeUpdate();
           JOptionPane.showMessageDialog(null, "La Documentacion  ha sido Registrada");
           }
        catch(Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "ex");    
        }
    
    }

    public ResultSet mostrarDatos(){
        Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
        Statement st;
        ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery("SELECT * FROM documentacion");
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }

   
    
    }
