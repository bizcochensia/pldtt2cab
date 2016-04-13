package com.ipn.mx.conexion;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omarturo
 */
public class EmpleadoDao {
    static PreparedStatement st;
    private static final String Insert = "INSERT INTO EMPLEADO (nombre, apellido_Pat, apellido_MAT, RFC, numero_tel, usuario, contrasena, tipo_empleado) VALUES (?,?,?,?,?,?,?,?)"; 
    
    public void RegistroUsuarios(String nombre, String apellido_Pat, String apellido_Mat, String RFC, String numero_tel, String usuario, String contraseña, int tipo_empleado) throws ClassNotFoundException, SQLException{
       Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
       
        try{
           
           st = reg.prepareStatement(Insert);
           st.setString (1, nombre);
           st.setString (2, apellido_Mat);
           st.setString (3, apellido_Pat);
           st.setString (4, RFC);
           st.setString (5, numero_tel);
           st.setString (6,usuario);
           st.setString (7, contraseña);
           st.setInt (8, tipo_empleado);
           st.executeUpdate();
          
           }
        catch(Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Empleado registrado previamente");    
        }
    }
    public void ActualizarEmpleado(int id,String nombre, String apellido_Pat, String apellido_Mat,String rfc, String numero_Telefono, String usuario,String contraseña,int tipo_empleado) throws ClassNotFoundException, SQLException{
       String update = "UPDATE empleado SET nombre='"+nombre+"',apellido_Pat='"+apellido_Pat+"' , apellido_Mat='"+apellido_Mat+"',RFC='"+rfc+"',numero_tel='"+numero_Telefono+"',usuario='"+usuario+"',contrasena='"+contraseña+"',tipo_empleado='"+tipo_empleado+"' where id_Empleado ="+id;
       System.out.println("?"+nombre+"?"+apellido_Pat);
       Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
       
        try{
           
           st = reg.prepareStatement(update);
           st.executeUpdate();
           JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
           }
        catch(SQLException ex) {
            System.out.println(ex);
                    
        }
    }
    public void EliminarEmpleado(int id) throws SQLException{
       String delete = "DELETE FROM empleado WHERE id_Empleado = "+id; 
       String op = "Select id_Operacion  FROM operaciones WHERE id_empleado = "+id; 
       String aop; 
       Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
        try {  
            st = reg.prepareStatement(delete);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Operacion Exitosa");
           
        } catch (SQLException ex) {
             System.out.println(ex);
             JOptionPane.showMessageDialog(null, "El empleado tiene Operaciones asociadas, No se puede Eliminar");
       
            
           
        }
    }
       public ResultSet mostrarDatos(){
        Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
        Statement st;
        ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery("SELECT * FROM empleado");
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }

}
