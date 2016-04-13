/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.ipn.mx.conexion.ClienteDao;
import com.ipn.mx.conexion.Conexion;
import com.ipn.mx.conexion.OperacionDAO;
import com.mx.ipn.clases.Cliente;
import com.mx.ipn.clases.Empleado;
import com.mx.ipn.clases.MiPanel;
import com.mx.ipn.clases.Moneda;
import com.mx.ipn.clases.Monetario;
import com.mx.ipn.clases.TipoOperacion;
import com.mx.ipn.clases.Validaciones;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Clemente
 */
public class VistaOperaciones extends javax.swing.JFrame {
   
    
   double APais=0;
   double AA=0;
   double AR=0;
   double ATP=0;
   double PEP=0;
   int riesgoPais=0;
   int riesgoActividad=0;
   int riesgoresidencia=0;
   String tipoPersona="";
   ClienteDao cd=new ClienteDao();
   Validaciones val=new Validaciones();
   
    Date f=new Date();
    String aux=f.toString();
    String dia;
    String año;
    String mes;
    String fecha;
    int auxmes;
    Cliente c=new Cliente();
    Monetario mone=new Monetario();
    TipoOperacion tp=new TipoOperacion();
    Moneda moneda=new Moneda();
    
    public Empleado vendedorid= new Empleado(Login.vendedor);

    Conexion con=new Conexion();
    Connection reg=con.conectar();
    Connection reg2=con.conectar();
    private String numcontrato;
    private double monto;
    private String descripcion;
    
    /**
     * Creates new form VistaOperaciones
     */
    public VistaOperaciones() throws SQLException {
        initComponents();
        cargarClientes();
        cargarmoneda();
        cargarmonetario();
        cargartipoOperacion();
        
        nombre.setEditable(false);
        ap.setEditable(false);
        am.setEditable(false);
        act.setEditable(false);
        ing.setEditable(false);
        
         ///
            
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

        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        contrato = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        operacion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        combooperacion = new javax.swing.JComboBox();
        combomoneda = new javax.swing.JComboBox();
        combomonetario = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combocliente = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        ap = new javax.swing.JTextField();
        am = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        act = new javax.swing.JTextField();
        ing = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jButton4.setText("jButton4");

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setOpaque(false);

        jLabel11.setText("Número de contrato");

        jLabel12.setText("Monto de la operación");

        jLabel13.setText("Detalles de la operación");

        des.setColumns(20);
        des.setRows(5);
        jScrollPane1.setViewportView(des);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(contrato)
                        .addComponent(operacion, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Detalles de la operacion", jPanel2);

        jPanel3.setOpaque(false);

        jLabel14.setText("Tipo de Operacion");

        jLabel15.setText("Moneda Empleada");

        jLabel16.setText("Monetario");

        combooperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione.." }));

        combomoneda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        combomoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomonedaActionPerformed(evt);
            }
        });

        combomonetario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combooperacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combomoneda, 0, 193, Short.MAX_VALUE)
                    .addComponent(combomonetario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(505, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(combooperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(combomoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(combomonetario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Detalles Monetarios", jPanel3);

        jPanel1.setOpaque(false);

        jLabel1.setText("Cliente");

        combocliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        combocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboclienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente asociado a la operación");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel4.setOpaque(false);

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido Paterno");

        jLabel6.setText("Apellido Materno");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(nombre))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(ap))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(am, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));
        jPanel6.setOpaque(false);

        jLabel9.setText("Actividad ");

        jLabel10.setText("Ingreso");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(act)
                    .addComponent(ing, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(combocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(183, 183, 183))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Selección Cliente", jPanel1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Registro de Operación");

        jButton2.setBackground(new java.awt.Color(0, 153, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrar");
        jButton2.setActionCommand("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 153, 51));
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboclienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(combocliente.getSelectedIndex()!=0){
            try {
                c=(Cliente) combocliente.getSelectedItem();
                String a=c.getRfc();
                int b=c.getIdCLiente();
                String aux="Select c.nombre,c.apellido_Pat,c.apellido_Mat,c.ingreso_Promedio,ac.actividad from cliente c inner join actividades ac on c.actividad_Principal=ac.id_actividad  where c.RFC='"+a+"' ";
                String aux2="Select tc.descripcion,ac.actividad,ac.riesgo,e.nombre,p.nombre_Pais,p.riesgo as Pais,e.id_pais from cliente c inner join actividades ac on c.actividad_Principal=ac.id_actividad inner join entidad_federativa e on e.id_Entidad=c.entidad inner join pais p on c.pais_Origen=p.id_Pais inner join tcliente tc on tc.id_tipo=c.tipo where c.id_cliente='"+b+"' ";
                Statement st;
                Statement st2;
                st2= reg2.createStatement();
                st = reg.createStatement();
                ResultSet rs2=st2.executeQuery(aux2);
                ResultSet rs=st.executeQuery(aux);
                while(rs.next()){
                nombre.setText(rs.getString("nombre"));
                ap.setText(rs.getString("apellido_Pat"));
                am.setText(rs.getString("apellido_Mat"));
                act.setText(rs.getString("actividad"));
                ing.setText(rs.getString("ingreso_Promedio"));
                }
                while(rs2.next()){     
                riesgoPais=rs.getInt("Pais");
                riesgoActividad=rs.getInt("riesgo");
                riesgoresidencia=rs.getInt("id_pais");
                tipoPersona=rs.getString("descripcion");
                }
                
                if(tipoPersona.equals("fisica")){
                ATP=0.40;
                 }
                else{ATP=0.60;}
                
                if(riesgoActividad==0){
                AA=0.30;
                }
                else{AA=0.70;}
                
                if(riesgoPais==0){
                APais=0.30;
            }
            else{APais=0.70;}
                
                
                 if(riesgoresidencia==1){
                 AR=0.30;
                }else{
                AR=0.70;
                }
 
             Double RTC=ATP*.20+AA*.25+AR*15+APais*.15+PEP*25;
             cd.ActualizarRiesgo(RTC, b);
                 
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(VistaOperaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        numcontrato=contrato.getText();
        monto=  Double.parseDouble( operacion.getText());
        descripcion=des.getText();
        boolean mo=val.Ingreso(operacion.getText());
        boolean con=val.alfanumericos(numcontrato);
       
        moneda= (Moneda) combomoneda.getSelectedItem();
        tp= (TipoOperacion) combooperacion.getSelectedItem();
        mone= (Monetario) combomonetario.getSelectedItem();
        
        dia=aux.substring(8,10);
        auxmes=f.getMonth();
        auxmes=auxmes+1;
        mes= Integer.toString(auxmes);
        año=aux.substring(24, 28);
        fecha=año+"-"+mes+"-"+dia;
        
        if(contrato.getText().equals("") || operacion.getText().equals("") || des.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Todos los campos en detalle de la operacion son requeridos");
        }
        else{
        if(combooperacion.getSelectedIndex()==0 || combomoneda.getSelectedIndex()==0 || combomonetario.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(null, "Los combobox deben tener una eleccion al igual que el cliente asociado.");
        }
        else{
            if(mo && con){
                        try {
                OperacionDAO op = new OperacionDAO();
                op.RegistroOperacion(numcontrato, monto, fecha, 20, descripcion, c.getIdCLiente(), vendedorid.getIdEmpleado(), 1, tp.getId_tipoOp(), moneda.getId_moneda(), mone.getId_clavemonetario());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Se necesitan estar todos los campos llenos para completar el registro");
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "");
            }
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combomonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combomonedaActionPerformed

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
            combocliente.addItem(act);
     }        } catch (SQLException ex) {
            Logger.getLogger(VistaRegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void cargarmoneda(){
        try {
            Statement st;
            
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("Select * from moneda");
            while(rs.next()){
            Moneda m=new Moneda();
            m.setId_moneda(rs.getInt(1));
            m.setClave(rs.getString(2));
            m.setMoneda(rs.getString(3));
            m.setPais_moneda(rs.getString(4));
            combomoneda.addItem(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarmonetario(){
            try {
            Statement st;
            
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("Select * from monetario");
            while(rs.next()){
            Monetario mo=new Monetario();
            mo.setId_clavemonetario(rs.getInt(1));
            mo.setClave(rs.getInt(2));
            mo.setInstrumento_monetario(rs.getString(3));
            mo.setDescripcion(rs.getString(4));
            combomonetario.addItem(mo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargartipoOperacion(){
            try {
            Statement st;
            
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("Select * from tipo_operacion");
            while(rs.next()){
            TipoOperacion t=new TipoOperacion();
            t.setId_tipoOp(rs.getInt(1));
            t.setClave(rs.getInt(2));
            t.setTipo_Operacion(rs.getString(3));
            t.setDescripcion(rs.getString(4));
            combooperacion.addItem(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaOperaciones.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(VistaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VistaOperaciones().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaOperaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField act;
    private javax.swing.JTextField am;
    private javax.swing.JTextField ap;
    private javax.swing.JComboBox combocliente;
    private javax.swing.JComboBox combomoneda;
    private javax.swing.JComboBox combomonetario;
    private javax.swing.JComboBox combooperacion;
    private javax.swing.JTextField contrato;
    private javax.swing.JTextArea des;
    private javax.swing.JTextField ing;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField operacion;
    // End of variables declaration//GEN-END:variables
}
