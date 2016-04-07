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
public class ClienteDao {
    static PreparedStatement st;
    private static final String Insert = "INSERT INTO CLIENTE (nombre, apellido_Pat, apellido_Mat,fecha_nac,tipo , RFC, calle,numero"
            + ",pais_Origen,pais_residencia,entidad,localidad,codigo_postal,numero_Telefono,riesgo,actividad_Principal,ingreso_Promedio) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    
    
    
    public void RegistroCliente(String nombre,String apellidopat,String apellidomat,String fechaNa,int tipo,String RFC,String calle,
            String numero,int pais,int paisRe,int entidad,int localidad,String CP,String telefono,double riesgo,int actividad,double ingreso){
    Conexion cn = new Conexion ();
    Connection reg=cn.conectar();
       
        try{
           
           st = reg.prepareStatement(Insert);
           st.setString (1, nombre);
           st.setString (2, apellidopat);
           st.setString (3, apellidomat);
           st.setString (4, fechaNa);
           st.setInt (5, tipo);
           st.setString (6, RFC);
           st.setString (7, calle);
           st.setString (8, numero);
           st.setInt (9, pais);
           st.setInt (10, paisRe);
           st.setInt (11, entidad);
           st.setInt (12, localidad);
           st.setString (13, CP);
           st.setString (14, telefono);
           st.setDouble (15, riesgo);
           st.setInt (16, actividad);
           st.setDouble(17, ingreso);
           st.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "El registro fue exitoso!");
           }
        catch(Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Cliente registrado previamente");
                    
        }
    }
    
    
    public void ActualizarCliente(int id,String nombre, String apellido_Pat, String apellido_Mat,int tipo,String rfc, String calle, String numero,int pais,int entidad, String codigo_postal, String numero_Telefono, String actividad,Double ingreso) throws ClassNotFoundException, SQLException{
       String update = "UPDATE cliente SET nombre='"+nombre+"',apellido_Pat='"+apellido_Pat+"' , apellido_Mat='"+apellido_Mat+"',tipo="+tipo+",RFC='"+rfc+"',calle='"+calle+"', numero='"+numero+"',pais_Origen="+pais+",entidad="+entidad+", codigo_postal='"+codigo_postal+"',numero_Telefono='"+numero_Telefono+"',actividad_Principal='"+actividad+"',ingreso_Promedio="+ingreso+" where id_cliente ="+id;
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
    public void EliminarCliente(int id) throws SQLException{
       String delete = "DELETE FROM CLIENTE WHERE id_cliente = "+id; 
       String op = "Select id_Operacion  FROM operaciones WHERE id_cliente = "+id; 
       String aop; 
       Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
        try {  
            st = reg.prepareStatement(delete);
            st.executeUpdate();
           
        } catch (SQLException ex) {
             System.out.println(ex);
             JOptionPane.showMessageDialog(null, "El cliente tiene Operaciones asociadas, No se puede Eliminar");
       
            
           
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
    
    public ResultSet calificar(String a){
    String aux="Select tc.descripcion,ac.actividad,ac.riesgo,e.nombre,p.nombre_Pais,p.riesgo from cliente c inner join actividades ac on c.actividad_Principal=ac.id_actividad inner join entidad_federativa e on e.id_Entidad=c.entidad inner join pais p on c.pais_Origen=p.id_Pais inner join tcliente tc on tc.id_tipo=c.tipo where c.RFC='"+a+"' ";    
    Conexion cn = new Conexion ();
    Connection reg=cn.conectar();
    Statement st;
    ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery(aux);
            System.out.println("la cadena es:"+aux);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
    
    }
