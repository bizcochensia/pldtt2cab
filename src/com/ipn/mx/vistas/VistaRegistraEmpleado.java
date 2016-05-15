/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.ipn.mx.conexion.ConexionListas;
import com.ipn.mx.conexion.ConocerDao;
import com.ipn.mx.conexion.EmpleadoDao;
import com.ipn.mx.conexion.MontoFrecuenciaDAO;
import com.ipn.mx.conexion.OperacionDAO;
import com.mx.ipn.clases.AESDemo;
import com.mx.ipn.clases.MiPanel;
import com.mx.ipn.clases.Validaciones;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Clemente
 */
public class VistaRegistraEmpleado extends javax.swing.JFrame {
    ConexionListas con2 = new ConexionListas();
    Connection reg2=con2.conectar();
    int tipo=-1;
    String []TipoEmpleado= {"Administrador","Oficial de Cumplimiento","Vendedor"};
    AESDemo d = new AESDemo();
    int idEmpleado=0;
    
    /**
     * Creates new form VistaRegistraEmpleado
     */
    public VistaRegistraEmpleado() {
        initComponents();
        rfcText.setToolTipText("El RFC debe ser escrito con mayusculas");
        numTelText.setToolTipText("El telefono debe tener 8 digitos");
        
        MiPanel p = new MiPanel();
        this.add( p , BorderLayout.CENTER);
        p.repaint();
        setLayout(null);
        setLocationRelativeTo(null);        // Centering on screen...
        setSize(900, 700);               // Setting dimensions...
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

        RegistrarBoton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nombreText = new javax.swing.JTextField();
        Apell_PatText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Apell_MatText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        numTelText = new javax.swing.JTextField();
        rfcText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        contraseñaText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setTitle("Registro Empleados");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 700));

        RegistrarBoton.setBackground(new java.awt.Color(0, 153, 51));
        RegistrarBoton.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarBoton.setText("Guardar");
        RegistrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBotonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setOpaque(false);

        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });

        Apell_PatText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apell_PatTextActionPerformed(evt);
            }
        });

        jLabel2.setText("* Nombre(s):");

        jLabel3.setText("* Apellido Paterno:");

        jLabel4.setText("*  Apellido Materno:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Apell_PatText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Apell_MatText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apell_PatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(Apell_MatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Otros datos"));
        jPanel2.setOpaque(false);

        rfcText.setToolTipText("");
        rfcText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcTextActionPerformed(evt);
            }
        });

        jLabel5.setText("* RFC:");

        jLabel6.setText("* Telefono:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(rfcText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numTelText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rfcText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(numTelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Accesos al sistema"));
        jPanel3.setOpaque(false);

        jLabel9.setText("* Contraseña:");

        usuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextActionPerformed(evt);
            }
        });

        jLabel8.setText("* Usuario:");

        jLabel7.setText(" * Tipo Empleado:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione....", "Administrador", "Oficial de Cumplimiento", "Vendedor" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contraseñaText, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(contraseñaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registro de Empleado");

        jLabel10.setText("Los campos marcados con (*) son obligatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(161, 161, 161))
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(RegistrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(RegistrarBoton))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rfcTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfcTextActionPerformed

    private void RegistrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBotonActionPerformed
        // TODO add your handling code here
        Validaciones v=new Validaciones();
        boolean aux= v.numerosTelefonico(numTelText.getText());
        boolean n= v.sololetras(nombreText.getText());
        boolean ap= v.sololetras(Apell_PatText.getText());
        boolean am= v.sololetras(Apell_MatText.getText());
        boolean rfc=v.RFCfisica(rfcText.getText());
        ConocerDao ac = new ConocerDao();
        
        
        if( jComboBox1.getSelectedIndex()==0 ||numTelText.getText().equals("") || rfcText.getText().equals("") || nombreText.getText().equals("") || Apell_MatText.getText().equals("") || Apell_PatText.getText().equals("") || contraseñaText.getText().equals("") || usuarioText.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
        }
        else{
            if(aux){
            if(n && ap && am){
                if(rfc){
             EmpleadoDao empleado=new EmpleadoDao();
            try {
                
                int tipo=jComboBox1.getSelectedIndex();
                idEmpleado=empleado.RegistroUsuarios(nombreText.getText(), Apell_PatText.getText(), Apell_MatText.getText(), rfcText.getText(), numTelText.getText(), usuarioText.getText(), contraseñaText.getText(),tipo );
                
                listasNegras(rfcText.getText());
                PEP(rfcText.getText());
                        JOptionPane.showMessageDialog(null, "El registro fue exitoso!");
        nombreText.setText("");
       Apell_PatText.setText("");
       rfcText.setText("");
       numTelText.setText("");
       Apell_MatText.setText("");
       usuarioText.setText("");
       contraseñaText.setText("");
       if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realizar otro registro?",
                "Registro nuevo", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
         {
             this.dispose();
         }
                
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(VistaRegistraEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                if(ex.equals("")){//pruebas para empleados registrados anteriormente
                }
            }

                } 
                else{
            JOptionPane.showMessageDialog(null, "El RFC no tiene la estructura indicada ");
                 }
            }
            else{
            JOptionPane.showMessageDialog(null, "Los campos que conforman el nombre solo aceptan letras");
                 }
        }
        else {
            JOptionPane.showMessageDialog(null, "El campo Telefono  solo acepta numeros y necesita 8 digitos");
        }
        }
       
    }//GEN-LAST:event_RegistrarBotonActionPerformed

    private void Apell_PatTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apell_PatTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Apell_PatTextActionPerformed

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int tipo=jComboBox1.getSelectedIndex();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

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
            java.util.logging.Logger.getLogger(VistaRegistraEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistraEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistraEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistraEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRegistraEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apell_MatText;
    private javax.swing.JTextField Apell_PatText;
    private javax.swing.JButton RegistrarBoton;
    private javax.swing.JTextField contraseñaText;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextField numTelText;
    private javax.swing.JTextField rfcText;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables

    private void listasNegras(String text) {
       try {
           
            String aux="Select * from listas_negras where rfc='"+text+"' and pep_listas = 0";
            Statement st;
            st = reg2.createStatement();
            ResultSet rs=st.executeQuery(aux);
              while (rs.next()){
                  System.out.println(rs.getString("estatus")+","+rs.getString("dependencia")+","+rs.getString("puesto"));
                  try {
                            OperacionDAO op = new OperacionDAO();
                            MontoFrecuenciaDAO MFD= new MontoFrecuenciaDAO();
                            
                           // op.RegistroOperacion(d.encrypt("0"), "0", "0", RTC , d.encrypt(descripcion), c.getIdCLiente(), vendedorid.getIdEmpleado(), 1, tp.getId_tipoOp(), moneda.getId_moneda(), mone.getId_clavemonetario(),anticipo);                
                        } catch (Exception e) {
                        } 
                  asignacionlistas("El empleado se encuentra en Listas Negras",2);
                   
                  JOptionPane.showMessageDialog(rootPane, "estatus:"+rs.getString("estatus")+", en la dependencia: "+rs.getString("dependencia")+", puesto:"+rs.getString("puesto"), "Persona Encontrada en Listas negras ", JOptionPane.WARNING_MESSAGE);
                     }
            } catch (SQLException ex) {
            System.out.println(ex+ "-no existe");
            Logger.getLogger(VistaCalificacionCliente.class.getName()).log(Level.SEVERE, null, ex);
            
        }  
    }

    private void PEP(String text) {
   
             try {
           
            String aux="Select * from listas_negras where rfc='"+text+"' and pep_listas = 1";
            Statement st;
            st = reg2.createStatement();
            ResultSet rs=st.executeQuery(aux);
              while (rs.next()){
                  System.out.println(rs.getString("estatus")+","+rs.getString("dependencia")+","+rs.getString("puesto"));
                 asignacionlistas("El empleado se considera PPE",6);
                JOptionPane.showMessageDialog(rootPane, "estatus:"+rs.getString("estatus")+", en la dependencia: "+rs.getString("dependencia")+", puesto:"+rs.getString("puesto"), "Persona Encontrada en Listas negras ", JOptionPane.WARNING_MESSAGE);

              }
                   } catch (SQLException ex) {
            System.out.println(ex+ "-no existe");
            Logger.getLogger(VistaCalificacionCliente.class.getName()).log(Level.SEVERE, null, ex);
            
        
    }
             
}

    private void asignacionlistas(String string, int alarma) {
       ConocerDao ac = new ConocerDao();
       java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
        try {
            ac.RegistroDescripcionListas(alarma, sqlDate,string,0,idEmpleado);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VistaRegistraEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
    }

   
}

