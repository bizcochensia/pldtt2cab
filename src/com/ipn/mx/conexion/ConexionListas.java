/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.conexion;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Clemente
 */
public class ConexionListas {
    Connection con=null;
    public Connection conectar(){
    try{
         //104.197.195.129   gYnqLB4a
       Class.forName("com.mysql.jdbc.Driver");
      //con=DriverManager.getConnection("jdbc:mysql://104.197.195.129/listasnegras","root","gYnqLB4a");
      con=DriverManager.getConnection("jdbc:mysql://localhost/listasnegras","root","admin");
       System.out.println("conexion a listas establecida");
    } catch(ClassNotFoundException | SQLException e){
        System.out.println("error de conexion");
        Component rootPane = null;
        JOptionPane.showMessageDialog(rootPane, "Error en la conexion con el servidor de Listas Negras", "Error de conexion ", JOptionPane.ERROR_MESSAGE);
    }
        return con;
    }


    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

