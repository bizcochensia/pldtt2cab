/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.ipn.mx.conexion.ClienteDao;
import com.ipn.mx.conexion.Conexion;

import com.ipn.mx.conexion.ConexionListas;

import com.ipn.mx.conexion.MontoFrecuenciaDAO;

import com.ipn.mx.conexion.MontoFrecuenciaDAO;
import com.mx.ipn.clases.Cliente;
import com.mx.ipn.clases.Operacion;

import com.mx.ipn.clases.Empleado;

import com.mx.ipn.clases.Empleado;

import com.mx.ipn.clases.MiPanel;
import com.mx.ipn.clases.Operacion;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Clemente
 */
public class VistaCalificacionCliente extends javax.swing.JFrame {

    int riesgoresidencia;
    ResultSet t;
    Conexion con=new Conexion();
    Connection reg=con.conectar();
    String descripcionalarma="";
    String fechadeteccion="";
    int alarmaid=0;
    int valid=0;

    


    Cliente c=new Cliente();
    Operacion op = new Operacion();
    int id[] = new int[50]; 

    public Cliente clienteid= new Cliente(VistaVerOperaciones.idCliente);
    public Operacion Operacionid= new Operacion(VistaVerOperaciones.idOperacion);
    

    
    /**
     * Creates new form VistaCalificacionCliente
     */
    public VistaCalificacionCliente() throws SQLException {
        initComponents();
        cargarClientes();
        ///
      
       Calendar c2 = new GregorianCalendar();
       
         MiPanel p = new MiPanel(); 
      this.add( p , BorderLayout.CENTER); 
       p.repaint(); 
         setLayout(null);
        setLocationRelativeTo(null);        // Centering on screen...
       setSize(900, 700);                  // Setting dimensions...
        setTitle("SisPLD");
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tipoPersona = new javax.swing.JTextField();
        Actividad = new javax.swing.JTextField();
        Residencia = new javax.swing.JTextField();
        Nacionalidad = new javax.swing.JTextField();
        muestratipo = new javax.swing.JTextField();
        muestraActividad = new javax.swing.JTextField();
        muestraResidencia = new javax.swing.JTextField();
        muestraNacionalidad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fechaC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionC = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        listasN = new javax.swing.JTextField();
        pep = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Muestrafecha = new javax.swing.JLabel();
        MuestraMonto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calificacion Cliente");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente a  Evaluar"));
        jPanel2.setOpaque(false);

        jLabel8.setText("Nombre:");

        comboCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...." }));
        comboCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboClienteMouseClicked(evt);
            }
        });
        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ver Riesgo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 153, 51));
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(comboCliente, 0, 276, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Calificación Cliente");

        jLabel11.setText("Selecciona el cliente para mostrar sus operaciones asociadas:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Riesgo"));
        jPanel1.setOpaque(false);

        jLabel1.setText("Variable");

        jLabel2.setText("Datos");

        jLabel3.setText("Riesgo");

        jLabel4.setText("Tipo de Persona:");

        jLabel5.setText("Actividad Economica:");

        jLabel6.setText("Residencia:");

        jLabel7.setText("Nacionalidad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nacionalidad)
                            .addComponent(Residencia)
                            .addComponent(Actividad)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(muestraActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(muestratipo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(muestraResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(muestraNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(156, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(184, 184, 184))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muestratipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muestraActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Residencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muestraResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muestraNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Origen y Actividad", jPanel1);

        jPanel4.setOpaque(false);

        jLabel10.setText("Persepción del empleado");

        jLabel15.setText("Resultados:");

        jLabel16.setText("Fecha:");

        descripcionC.setColumns(20);
        descripcionC.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        descripcionC.setRows(5);
        descripcionC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        descripcionC.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane1.setViewportView(descripcionC);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addComponent(fechaC))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jTabbedPane2.addTab("Conoce Cliente", jPanel4);

        jPanel3.setOpaque(false);

        jLabel12.setText("Coincidencias en listas negras");

        jLabel13.setText("Persona Politicamente Expuesta (PPE)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listasN, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(pep))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(listasN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Listas Negras y (PPE)", jPanel3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Muestrafecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MuestraMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Muestrafecha, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(MuestraMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Monto y Frecuencia", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClienteActionPerformed

    private void comboClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClienteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            Cliente c=(Cliente) comboCliente.getSelectedItem();
            String a=c.getRfc();
            int idC = c.getIdCLiente();
            int idOP;
            String aux="Select tc.descripcion,ac.actividad,ac.riesgo,e.nombre,p.nombre_Pais,p.riesgo as Pais,e.id_pais from cliente c inner join actividades ac on c.actividad_Principal=ac.id_actividad inner join entidad_federativa e on e.id_Entidad=c.entidad inner join pais p on c.pais_Origen=p.id_Pais inner join tcliente tc on tc.id_tipo=c.tipo where c.RFC='"+a+"' ";    

            /*   int a=clienteid.getIdCLiente();
            String aux="Select tc.descripcion,ac.actividad,ac.riesgo,e.nombre,p.nombre_Pais,p.riesgo as Pais,e.id_pais from cliente c inner join actividades ac on c.actividad_Principal=ac.id_actividad inner join entidad_federativa e on e.id_Entidad=c.entidad inner join pais p on c.pais_Origen=p.id_Pais inner join tcliente tc on tc.id_tipo=c.tipo where c.id_cliente="+a;    */
            Statement st;
            st = reg.createStatement();
            ResultSet rs=st.executeQuery(aux);
            System.out.println(a);
            //Obtiene el ID del cliente para asociarlo con la operacion;
            idOP=Operacion(idC);
            //Conoce a Tu Cliente 
            ConoceCliente(idOP);
            ListasNegras(idOP);
            
             while (rs.next()){
           
            tipoPersona.setText(rs.getString("descripcion"));
            Actividad.setText(rs.getString("actividad"));
            Residencia.setText(rs.getString("nombre"));
            Nacionalidad.setText(rs.getString("nombre_Pais"));
            int riesgoPais=rs.getInt("Pais");
            int riesgoActividad=rs.getInt("riesgo");
            riesgoresidencia=rs.getInt("id_pais");
            
            if(rs.getString("descripcion").equals("fisica")){
            muestratipo.setText("Bajo");
            }
            else{muestraActividad.setText("Alto");}
            
            if(riesgoActividad==0){
            muestraActividad.setText("Bajo");
            }
            else{muestraActividad.setText("Alto");}
            
            if(riesgoPais==0){
                muestraNacionalidad.setText("Bajo");
            }
            else{muestraNacionalidad.setText("Alto");}
            }
            
            if(riesgoresidencia==1){
                 muestraResidencia.setText("Bajo");
            }else{
                muestraResidencia.setText("Alto");
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(VistaCalificacionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        MontoFrecuenciaDAO MFD=new MontoFrecuenciaDAO();
        t=MFD.obtenalarmas(Operacionid.getIdOperacion());
        try {
            while(t.next()){
                descripcionalarma=t.getString("Descripcion");
                fechadeteccion=t.getString("fechadeteccion");
                alarmaid=t.getInt("Alarma_id");
            }
            
            if(alarmaid!=3){
            Muestrafecha.setText("La operacion no es considerada sospechosa por monto");  
            }
            else{
            Muestrafecha.setText("La operacion fue detectada en:"+fechadeteccion);
            MuestraMonto.setText("Es considerada sospechosa ya que sobrepasa por un monto de: "+descripcionalarma+"  el estandar");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VistaCalificacionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void cargarClientes() throws SQLException {
     Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("Select * from cliente");
            while(rs.next()){
                Cliente act=new Cliente();
                act.setIdCLiente(rs.getInt(1));
                act.setNombre(rs.getString(2));
                act.setApellPat(rs.getString(3));
                act.setApellMat(rs.getString(4));
                act.setFecha_nac(rs.getString(5));
                act.setTipo(rs.getInt(6));
                act.setRfc(rs.getString(7));
                act.setCalle(rs.getString(8));
                act.setNumero(rs.getString(9));
                act.setPaisOrigen(rs.getInt(10));
                act.setPaisResidencia(rs.getInt(11));
                act.setEntidad(rs.getInt(12));
                act.setLocalidad(rs.getInt(13));
                act.setCodigoPostal(rs.getString(14));
                act.setNumTel(rs.getString(15));
                act.setRiesgo(rs.getDouble(16));
                act.setActividad(rs.getString(17));
                act.setIngreso(rs.getDouble(18));
            comboCliente.addItem(act);
     }
        } catch (SQLException ex) {
            Logger.getLogger(VistaRegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    public int Operacion(int a){
       
        int i = 0;
        try {
            String aux = "Select * from operaciones where Cliente_id='" + a + "'";
            Statement st;
            st = reg.createStatement();
            ResultSet rs = st.executeQuery(aux);
            System.out.println(a);
            
            while (rs.next()) {
                //System.out.println(rs.getString("id_Operacion"));
                i= Integer.parseInt(rs.getString("id_Operacion"));
               
            }
        } catch (SQLException | NumberFormatException sQLException) {
        }
        return i;
    }
     private void ConoceCliente(int idOP) {
        //To change body of generated methods, choose Tools | Templates.
        int alarma;
        try {
            
            String aux = "Select * from intermedia_operacion_alarma where Operacion_id='" + idOP+ "'";
            Statement st;
            st = reg.createStatement();
            ResultSet rs = st.executeQuery(aux);
            System.out.println(id[1]);
            while (rs.next()) {
                System.out.println(rs.getString("Operacion_id"));
                System.out.println(rs.getString("Alarma_id"));
                alarma =Integer.parseInt(rs.getString("Alarma_id"));
                if(alarma == 7){
                fechaC.setText(rs.getString("fechadeteccion"));
                descripcionC.setText(rs.getString("Descripcion"));
                }else{
                    fechaC.setText("Sin Alarma");
                    descripcionC.setText("Sin Alarma ");
                }
                
                
            }
        } catch (SQLException sQLException) {
        } catch (NumberFormatException numberFormatException) {
        }
    }
        private void ListasNegras(int idOP) {
     int alarma;
        try {
            
            String aux = "Select * from intermedia_operacion_alarma where Operacion_id='" + idOP+ "'";
            Statement st;
            st = reg.createStatement();
            ResultSet rs = st.executeQuery(aux);
            System.out.println(id[1]);
            while (rs.next()) {
                System.out.println(rs.getString("Operacion_id"));
                System.out.println(rs.getString("Alarma_id"));
                alarma =Integer.parseInt(rs.getString("Alarma_id"));
                if(alarma == 6){
                        listasN.setText(rs.getString("Descripcion"));
                         pep.setText("Sin Coincidencia");
                    
                }else{
                    
                        listasN.setText("Sin Coincidencia");
                        pep.setText("Sin Coincidencia");
                }
                
                
            }
        } catch (SQLException sQLException) {
        } catch (NumberFormatException numberFormatException) {
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaCalificacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalificacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalificacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalificacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VistaCalificacionCliente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaCalificacionCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Actividad;
    private javax.swing.JLabel MuestraMonto;
    private javax.swing.JLabel Muestrafecha;
    private javax.swing.JTextField Nacionalidad;
    private javax.swing.JTextField Residencia;
    private javax.swing.JComboBox comboCliente;
    private javax.swing.JTextArea descripcionC;
    private javax.swing.JTextField fechaC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField listasN;
    private javax.swing.JTextField muestraActividad;
    private javax.swing.JTextField muestraNacionalidad;
    private javax.swing.JTextField muestraResidencia;
    private javax.swing.JTextField muestratipo;
    private javax.swing.JTextField pep;
    private javax.swing.JTextField tipoPersona;
    // End of variables declaration//GEN-END:variables



   
}
