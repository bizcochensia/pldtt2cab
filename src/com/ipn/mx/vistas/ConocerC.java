/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.ipn.mx.conexion.Conexion;
import com.ipn.mx.conexion.ConocerDao;
import com.mx.ipn.clases.AESDemo;
import com.mx.ipn.clases.Cliente;
import com.mx.ipn.clases.MiPanel;
import java.awt.BorderLayout;
import static java.lang.Math.exp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author bdfe_
 */
public class ConocerC extends javax.swing.JFrame {
   AESDemo d = new AESDemo();
    Conexion con=new Conexion();
    Connection reg=con.conectar();
    int valid=0;
    int respuesta;
    Cliente c=new Cliente();
    int eva[] = new int[50];
    int i=0, b=0;
    String des = "";
    int op [] =new int [50];
    
    /**
     * Creates new form ConocerC
     */
    public ConocerC() throws SQLException {
        
   
        JPasswordField pwd = new JPasswordField(10);
         respuesta = JOptionPane.showConfirmDialog(null, pwd,"Ingrese Contraseña",JOptionPane.OK_CANCEL_OPTION);
   
               if(respuesta==JOptionPane.CANCEL_OPTION){
            this.setVisible(false);
        }
        else{
                   
              if("".equals(new String(pwd.getPassword()))){
            JOptionPane.showMessageDialog(null,"Se necesita contraseña para continuar");
            JOptionPane.showConfirmDialog(null, pwd,"Ingrese Contraseña",JOptionPane.OK_CANCEL_OPTION);
            }
            else{
        d.addKey(new String(pwd.getPassword()));
        initComponents();
                   MiPanel p = new MiPanel();
        this.add( p , BorderLayout.CENTER);
        p.repaint();
        setLayout(null);
        setLocationRelativeTo(null);        // Centering on screen...
        setSize(900, 700);               // Setting dimensions...
        setTitle("SisPLD");
        setResizable(false);
        
            }
        
        }
               
        
     cargarClientes();
        
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Si = new javax.swing.JRadioButton();
        No = new javax.swing.JRadioButton();
        Si1 = new javax.swing.JRadioButton();
        No1 = new javax.swing.JRadioButton();
        No2 = new javax.swing.JRadioButton();
        Si2 = new javax.swing.JRadioButton();
        No3 = new javax.swing.JRadioButton();
        Si3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrip = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Cancelar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel12.setText("Llene el siguiente Formulario deacuerdo a su percepción:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Conoce a tu Cliente");

        jPanel1.setOpaque(false);

        jLabel4.setText("3) ¿El cliente contesto de forma fehaciente? ");

        jLabel5.setText("4) ¿El cliente proporcionó la información completa sobre el origen de sus recursos?");

        buttonGroup1.add(Si);
        Si.setText("Si");
        Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiActionPerformed(evt);
            }
        });

        buttonGroup1.add(No);
        No.setSelected(true);
        No.setText("No");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });

        buttonGroup2.add(Si1);
        Si1.setText("Si");
        Si1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Si1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(No1);
        No1.setSelected(true);
        No1.setText("No");
        No1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(No2);
        No2.setSelected(true);
        No2.setText("No");
        No2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(Si2);
        Si2.setText("Si");
        Si2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Si2ActionPerformed(evt);
            }
        });

        buttonGroup4.add(No3);
        No3.setSelected(true);
        No3.setText("No");
        No3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No3ActionPerformed(evt);
            }
        });

        buttonGroup4.add(Si3);
        Si3.setText("Si");
        Si3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Si3ActionPerformed(evt);
            }
        });

        jLabel2.setText("1) ¿Ell cliente proporcionó la información personal requerida? ");

        jLabel3.setText("2)¿El cliente aceptó las condiciones contractuales?");

        descrip.setColumns(20);
        descrip.setRows(5);
        jScrollPane1.setViewportView(descrip);

        jLabel10.setText("Observaciones:");

        Aceptar.setBackground(new java.awt.Color(0, 153, 51));
        Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Cancelar.setForeground(new java.awt.Color(0, 153, 51));
        Cancelar.setText("Regresar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Cancelar1.setForeground(new java.awt.Color(0, 153, 51));
        Cancelar1.setText("Nueva Evaluacion");
        Cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Si3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(No3)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Si)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(No)
                                .addGap(137, 137, 137))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Si1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(No1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Si2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(No2)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cancelar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Aceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cancelar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Si)
                        .addComponent(No)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Si1)
                    .addComponent(No1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Si2)
                    .addComponent(No2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Si3)
                    .addComponent(No3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Cancelar)
                    .addComponent(Cancelar1))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente a  Evaluar"));
        jPanel2.setOpaque(false);

        jLabel13.setText("Nombre:");

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
        jButton1.setText("Seleccionar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(comboCliente, 0, 276, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        ConocerDao ac = new ConocerDao();
        
       java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
        String des=descrip.getText();
        //texto=texto.replaceAll(" ", "");
        if(Si.isSelected()&Si1.isSelected()&Si2.isSelected()&No3.isSelected()){
            des = "";
            this.dispose();
        }else{
           if(No.isSelected()){
                des = des +"El cliente no proporcionó la información personal requerida"+", ";
           }
           if(No1.isSelected()){
               des = des + "El cliente no acepto las condiciones contractuales"+", ";
           }
           if(No2.isSelected()){
               des = des + "El cliente no contesto de forma fehaciente"+", ";
           }
           
           if(No3.isSelected()){
               des = des +"El cliente no proporcionó la información completa sobre el origen de sus recursos"+", ";
           }
           
           System.out.println(des );
            for (int j=0;j<i;j++){
                try { 
                    ValidaOp(eva[j]);
                   if(valid == 0)
                        ac.RegistroDescripcion(eva[j], 7, sqlDate, des+descrip.getText(),1);
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConocerC.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConocerC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null, "La Alarma se ha enviado");
            
     
            
        }

        

     
            
    }//GEN-LAST:event_AceptarActionPerformed

    private void Si3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Si3ActionPerformed
        // TODO add your handling code here:
         
     
    }//GEN-LAST:event_Si3ActionPerformed

    private void No3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No3ActionPerformed
       
    }//GEN-LAST:event_No3ActionPerformed

    private void Si2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Si2ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_Si2ActionPerformed

    private void No2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No2ActionPerformed
        
    }//GEN-LAST:event_No2ActionPerformed

    private void No1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No1ActionPerformed
        // TODO add your handling code here:
      ;
    }//GEN-LAST:event_No1ActionPerformed

    private void Si1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Si1ActionPerformed
      
         // TODO add your handling code here:
    }//GEN-LAST:event_Si1ActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_NoActionPerformed

    private void SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SiActionPerformed

    private void comboClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClienteMouseClicked

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Cliente c=(Cliente) comboCliente.getSelectedItem();
            int a=c.getIdCLiente();
            System.out.println(a+"RFC <==== conocer");
            String aux="Select * from operaciones where Cliente_id='"+a+"'";
            Statement st;
            st = reg.createStatement();
            ResultSet rs=st.executeQuery(aux);
            //System.out.println(a);
            i=0;
              try {
                while (rs.next()) {
                    System.out.println(rs.getString("id_Operacion") );
                    eva[i] = Integer.parseInt(rs.getString("id_Operacion"));
                    i++;
                }
            } catch (SQLException | NumberFormatException sQLException) {
                System.out.println(sQLException);
            }
           
         
                    
               
            
             
           jButton1.setEnabled(false);

        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(VistaCalificacionCliente.class.getName()).log(Level.SEVERE, null, ex);
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar1ActionPerformed
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        comboCliente.setSelectedItem(0);
    }//GEN-LAST:event_Cancelar1ActionPerformed
public void cargarClientes() throws SQLException {
     
    Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("Select * from cliente");
            while(rs.next()){
                Cliente act=new Cliente();
                act.setIdCLiente(rs.getInt(1));
                act.setNombre(d.decrypt(rs.getString(2)));
                act.setApellPat(d.decrypt(rs.getString(3)));
                act.setApellMat(d.decrypt(rs.getString(4)));
                act.setFecha_nac(rs.getString(5));
                act.setTipo(rs.getInt(6));
                act.setRfc(d.decrypt(rs.getString(7)));
                act.setCalle(d.decrypt(rs.getString(8)));
                act.setNumero(d.decrypt(rs.getString(9)));
                act.setPaisOrigen(rs.getInt(10));
                act.setPaisResidencia(rs.getInt(11));
                act.setEntidad(rs.getInt(12));
                act.setLocalidad(rs.getInt(13));
                act.setCodigoPostal(d.decrypt(rs.getString(14)));
                act.setNumTel(d.decrypt(rs.getString(15)));
                act.setRiesgo(rs.getInt(16));
                act.setActividad(rs.getString(17));
                act.setIngreso(rs.getDouble(18));
            comboCliente.addItem(act);
     }
        } catch (SQLException ex) {
            Logger.getLogger(VistaRegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ConocerC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConocerC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConocerC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConocerC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ConocerC().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ConocerC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Cancelar1;
    private javax.swing.JRadioButton No;
    private javax.swing.JRadioButton No1;
    private javax.swing.JRadioButton No2;
    private javax.swing.JRadioButton No3;
    private javax.swing.JRadioButton Si;
    private javax.swing.JRadioButton Si1;
    private javax.swing.JRadioButton Si2;
    private javax.swing.JRadioButton Si3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JComboBox comboCliente;
    private javax.swing.JTextArea descrip;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void ValidaOp(int op) {
    ResultSet res;
    PreparedStatement pstm;
        try{
            pstm = reg.prepareStatement("SELECT * FROM intermedia_operacion_alarma WHERE Operacion_id = '" + op+ "' and Alarma_id= 7 " );
            res = pstm.executeQuery();
            if(res.next()){
                valid= 1;
                 
} else
            valid = 0;
            res.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
 
    }
}
