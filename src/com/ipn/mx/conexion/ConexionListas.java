/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Clemente
 */
public class ConexionListas {
    Connection con=null;
    public Connection conectar(){
    try{
        //104.197.27.176   NdtSa7Pp
       Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://104.197.27.176/listasnegras","root","NdtSa7Pp");
       //con=DriverManager.getConnection("jdbc:mysql://localhost/listasnegras","root","admin");
       System.out.println("conexion a listas establecida");
    } catch(ClassNotFoundException | SQLException e){
        System.out.println("error de conexion");
    }
        return con;
    }


    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

