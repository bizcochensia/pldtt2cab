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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Clemente
 */
public class ReporteDAO{
    static PreparedStatement st;
    private static final String Insert = "INSERT INTO reporte (Operaciones_id,ruta) values (?,?)";
    static PreparedStatement prState;
    ResultSet result;
    
    public void insertaReporte(int idoperacion,String ruta){
     Conexion cn = new Conexion ();
     Connection reg=cn.conectar();
                try{
           
           st = reg.prepareStatement(Insert);
           st.setInt (1, idoperacion);
           st.setString (2, ruta);
           st.executeUpdate();
          
           }
        catch(Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Reporte registrado previamente");    
        }
    
    }
    
    
  public ResultSet VerReportes(String a){
        Conexion con = new Conexion();
        Connection reg=con.conectar();
        String consulta="Select LPAD(id_reporte,6,'0') as folio from reporte where Operaciones_id='"+a+"'";
        try{
            prState = reg.prepareStatement(consulta);
            result=prState.executeQuery();
        } catch (SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
        }
        return result;
  }  
    
}
