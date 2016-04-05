/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.conexion;

import static com.ipn.mx.conexion.ClienteDao.st;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Clemente
 */
public class OperacionDAO {
    static PreparedStatement st;
    private static final String Insert = "INSERT INTO OPERACIONES (numeroContrato,monto,fecha,riesgo,descripcion,Cliente_id,Empleado_id,Inmobiliaria_id,tipo_id,moneda_id,monetario_id ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    
    public void RegistroOperacion(String contrato,double monto,String fecha,double riesgo,String descripcion,int cliente_id,int Empleado_id,int inmobiliaria_id,int tipo_id,int moneda_id,int monetario_id){
    Conexion cn = new Conexion ();
    Connection reg=cn.conectar();
       
        try{   
           st = reg.prepareStatement(Insert);
           st.setString (1, contrato);
           st.setDouble (2, monto);
           st.setString (3, fecha);
           st.setDouble (4, riesgo);
           st.setString (5, descripcion);
           st.setInt (6,cliente_id);
           st.setInt (7, Empleado_id);
           st.setInt (8, inmobiliaria_id);
           st.setInt (9, tipo_id);
           st.setInt (10, moneda_id);
           st.setInt (11, monetario_id);
           st.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "El registro fue exitoso!");
           }
        catch(Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Ocurrio el siguiente error:\n"+ex);
                    
        }
    }
    
        public ResultSet DatosReportes(){
        Conexion cn = new Conexion ();
       Connection reg=cn.conectar();
        Statement st;
        ResultSet rs = null;
        try{
            st=reg.createStatement();
            rs = st.executeQuery("select i.clave,i.calle,i.numero,i.codigoPostal,tp.clave as clavetipoOp,"
                    + "m.clave as monetarioclave,op.numeroContrato, op.monto, mo.clave as claveMoneda,op.fecha as fechaOperacion,"
                    + "p.nombre_Pais as paisOrigen,tipoc.descripcion,c.nombre,c.apellido_Pat,c.apellido_Mat,c.RFC,c.fecha_nac,"
                    + "c.calle,c.numero,l.clave as localidad,c.numero_Telefono,act.folio,op.descripcion from operaciones op inner "
                    + "join inmobiliaria i on i.id_inmobiliaria=op.Inmobiliaria_id inner join tipo_operacion tp"
                    + " on op.tipo_id=tp.id_tipoOp inner join monetario m on op.monetario_id=m.id_clavemonetario inner join moneda mo"
                    + " on op.moneda_id=mo.id_moneda inner join cliente c on op.Cliente_id=c.id_cliente inner join tcliente tipoc on"
                    + " c.tipo=tipoc.id_tipo inner join pais p on c.pais_Origen=p.id_Pais join actividades act on "
                    + "c.actividad_Principal=act.id_actividad inner join localidad l on c.localidad=l.id_Localidad;");
        } catch (Exception ex){
            System.out.println(ex);
        }
        return rs;
    }
    
    
    
}
