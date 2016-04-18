/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.mx.ipn.clases.Empleado;
import com.mx.ipn.clases.MiPanel;
import java.awt.BorderLayout;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Clemente
 */
public class VistaVendedor extends javax.swing.JFrame {
        
    /**
     * Creates new form VistaVendedor
     */
    public VistaVendedor() {
        initComponents();
        /////////
         MiPanel p = new MiPanel(); 
      this.add( p , BorderLayout.CENTER); 
       p.repaint(); 
         setLayout(null);
        setLocationRelativeTo(null);        // Centering on screen...
       setSize(900,700);                  // Setting dimensions...
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

        jMenu3 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ClienteMoral = new javax.swing.JButton();
        ClienteFisico = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        VerCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Operación = new javax.swing.JButton();
        Operación1 = new javax.swing.JButton();
        ConoceCliente = new javax.swing.JButton();
        VerOperacion = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Vendedor");
        setMinimumSize(new java.awt.Dimension(900, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/BotonSalir.png"))); // NOI18N
        jButton7.setText("Cerrar Sesión");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Menu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Selecciona la opción deseada:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 400));

        ClienteMoral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonClienteMoral.png"))); // NOI18N
        ClienteMoral.setText("Registrar Cliente Moral");
        ClienteMoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteMoralActionPerformed(evt);
            }
        });

        ClienteFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/BotonClienteFisico.png"))); // NOI18N
        ClienteFisico.setText("Registrar Cliente Fisico");
        ClienteFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteFisicoActionPerformed(evt);
            }
        });

        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/BotonModificarCliente copia.png"))); // NOI18N
        Modificar.setText("Modificar Cliente");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        VerCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonVer.png"))); // NOI18N
        VerCliente.setText("Visualizar Cliente");
        VerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClienteMoral, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(ClienteFisico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ClienteMoral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VerCliente)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));

        Operación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonRegistrar.png"))); // NOI18N
        Operación.setText("Registrar Operación");
        Operación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperaciónActionPerformed(evt);
            }
        });

        Operación1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonDocumento.png"))); // NOI18N
        Operación1.setText("Registrar Documento");
        Operación1.setToolTipText("");
        Operación1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operación1ActionPerformed(evt);
            }
        });

        ConoceCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/BotonConoceCliente.png"))); // NOI18N
        ConoceCliente.setText("Conoce a tu Cliente");
        ConoceCliente.setToolTipText("");
        ConoceCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConoceClienteActionPerformed(evt);
            }
        });

        VerOperacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonVer.png"))); // NOI18N
        VerOperacion.setText("Visualizar Operación");
        VerOperacion.setToolTipText("");
        VerOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerOperacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Operación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Operación1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addComponent(ConoceCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Operación)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Operación1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConoceCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VerOperacion)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 132, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(312, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteFisicoActionPerformed
        try {
            // TODO add your handling code here:
            VistaRegistroClientes vrcf=new VistaRegistroClientes();
            vrcf.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ClienteFisicoActionPerformed

    private void VerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerClienteActionPerformed
        try {
            // TODO add your handling code here:
            VistaVisualizarCliente vvc=new VistaVisualizarCliente();
            vvc.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_VerClienteActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try {
            // TODO add your handling code here:
            Interfaz in= new Interfaz();
            in.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            // TODO add your handling code here:
            Login lo=new Login();
            lo.setVisible(true);
            this.dispose();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ClienteMoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteMoralActionPerformed
        try {
            // TODO add your handling code here:
            VistaRegistroClienteMoral vrcm= new VistaRegistroClienteMoral();
            vrcm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ClienteMoralActionPerformed

    private void OperaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperaciónActionPerformed
        try {
            // TODO add your handling code here:
            VistaOperaciones op=new VistaOperaciones();
            op.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_OperaciónActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
         {
             System.exit(0);
         }
    }//GEN-LAST:event_formWindowClosing

    private void Operación1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operación1ActionPerformed
        try {
            // TODO add your handling code here:
            VistasDocumentacion vd = new VistasDocumentacion();
            vd.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Operación1ActionPerformed

    private void ConoceClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConoceClienteActionPerformed
        ConocerC cc = null;
        try {
            cc = new ConocerC();
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        cc.setVisible(true);
    }//GEN-LAST:event_ConoceClienteActionPerformed

    private void VerOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerOperacionActionPerformed
        // TODO add your handling code here:
        VistaVerOperacionesV vv;
        try {
            vv = new VistaVerOperacionesV();
            vv.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_VerOperacionActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClienteFisico;
    private javax.swing.JButton ClienteMoral;
    private javax.swing.JButton ConoceCliente;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Operación;
    private javax.swing.JButton Operación1;
    private javax.swing.JButton VerCliente;
    private javax.swing.JButton VerOperacion;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
