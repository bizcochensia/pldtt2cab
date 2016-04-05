/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.conexion;

import static com.ipn.mx.conexion.ClienteDao.st;
import static com.ipn.mx.conexion.EmpleadoDao.st;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Clemente
 */
public class InmobiliariaDAo {
    static PreparedStatement st;
    private static final String Insert="INSERT INTO inmobiliaria (nombre,clave,EntidadFede,calle,numero,codigoPostal) values (?,?,?,?,?,?)";
    
    
    public void RegistaraInmobiliaria(String nombre,String clave,int entidad,String calle,String numero,String codigo){
        
        try {
            Conexion cn = new Conexion ();
            Connection reg=cn.conectar();
            st = reg.prepareStatement(Insert);
            st.setString (1, nombre);
            st.setString (2, clave);
            st.setInt(3, entidad);
            st.setString (4, calle);
            st.setString (5,numero);
            st.setString(6, codigo);
            st.executeUpdate();
           JOptionPane.showMessageDialog(null, "El registro fue exitoso!");
        } catch (SQLException ex) {
            Logger.getLogger(InmobiliariaDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
