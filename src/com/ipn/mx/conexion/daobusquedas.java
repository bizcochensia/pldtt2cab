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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clemente
 */
public class daobusquedas {
    private static final String busquedausuario= "SELECT * FROM empleado";
    private static final String busquedacliente="Select c.nombre,c.apellido_Pat,c.apellido_Mat,c.numero_Telefono,c.ingreso_Promedio,c.calle,c.numero,c.codigo_postal,p.nombre_Pais,e.nombre as entidad,l.nombre as localidad,ac.actividad,tc.descripcion from cliente c inner join pais p on c.pais_Origen=p.id_Pais inner join entidad_federativa e on e.id_Entidad=c.entidad inner join localidad l on l.id_Localidad=c.localidad inner join actividades ac on c.actividad_Principal=ac.id_actividad inner join tcliente tc on tc.id_tipo=c.tipo where l.id_localidad=c.localidad;";
    static PreparedStatement prState;
    ResultSet result;
    
    public ResultSet SeleccionaUsuarios() throws ClassNotFoundException, SQLException{
        Conexion con = new Conexion();
        Connection reg=con.conectar();
        try{
            prState = reg.prepareStatement(busquedausuario);
            result=prState.executeQuery();
        } catch (SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
        }
        return result;
    }
    
        public ResultSet SeleccionaCliente() throws ClassNotFoundException, SQLException{
        Conexion con = new Conexion();
        Connection reg=con.conectar();
        try{
            prState = reg.prepareStatement(busquedacliente);
            result=prState.executeQuery();
        } catch (SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
        }
        return result;
    }
    
}
