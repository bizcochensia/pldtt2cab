/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.mx.ipn.clases.MiPanel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Clemente
 */
public class VistaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form VistaAdministrador
     */
    public VistaAdministrador() {
        
        initComponents();
        ///
       
         MiPanel p = new MiPanel(); 
      this.add( p , BorderLayout.CENTER); 
       p.repaint(); 
         setLayout(null);
        setLocationRelativeTo(null);        // Centering on screen...
                         // Setting dimensions...
        setTitle("SisPLD");
        
        //setResizable(false);
        //botones
      

  
        
                                             
 
 
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
        jMenuItem1 = new javax.swing.JMenuItem();
        cerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ModificarEmpleado = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ClienteMoral = new javax.swing.JButton();
        ClienteFisico = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        VerCliente = new javax.swing.JButton();
        Operación2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Operación = new javax.swing.JButton();
        Operación1 = new javax.swing.JButton();
        ConoceCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrador");
        setMinimumSize(new java.awt.Dimension(900, 700));
        setSize(new java.awt.Dimension(2147483647, 2147483647));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/BotonSalir.png"))); // NOI18N
        cerrar.setText("Cerrar Sesión");
        cerrar.setBorder(null);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cerrar.setMinimumSize(new java.awt.Dimension(150, 50));
        cerrar.setPreferredSize(new java.awt.Dimension(150, 50));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Selecciona la opción deseada:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Menu");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));
        jPanel1.setOpaque(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/BotonClienteFisico.png"))); // NOI18N
        jButton1.setText("Registrar Empleado");
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonInmobiliria.png"))); // NOI18N
        jButton3.setText("Ingresar Inmobiliaria");
        jButton3.setBorder(null);
        jButton3.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonVer.png"))); // NOI18N
        jButton2.setText("Ver Empleado");
        jButton2.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ModificarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/BotonModificarCliente copia.png"))); // NOI18N
        ModificarEmpleado.setText("Modificar Empleado");
        ModificarEmpleado.setMaximumSize(new java.awt.Dimension(150, 50));
        ModificarEmpleado.setMinimumSize(new java.awt.Dimension(150, 50));
        ModificarEmpleado.setPreferredSize(new java.awt.Dimension(150, 50));
        ModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEmpleadoActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/BotonConoceCliente.png"))); // NOI18N
        jButton4.setText("Conoce a tu Empleado");
        jButton4.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModificarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ModificarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Bienvenid@ Administrador");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));

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

        Operación2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonDocumento.png"))); // NOI18N
        Operación2.setText("Estudio Socioeconómico");
        Operación2.setToolTipText("");
        Operación2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operación2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Operación2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(ClienteFisico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClienteMoral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ClienteFisico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ClienteMoral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VerCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Operación2)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 400));

        Operación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonRegistrar.png"))); // NOI18N
        Operación.setText("Registrar Operación Compra-Venta");
        Operación.setToolTipText("");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Operación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Operación1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConoceCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Operación)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Operación1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConoceCliente)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Oficial de Cumplimiento"));
        jPanel4.setOpaque(false);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonVer.png"))); // NOI18N
        jButton5.setText("Ver operacion");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Internas Preocupantes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 802, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(210, 210, 210))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VistaRegistraEmpleado reg=new VistaRegistraEmpleado();
        reg.setVisible(true);
        /*JInternalFrame f = createFrame("Registro Empleados", reg);
        f.setLocation(10,10);
        f.moveToFront();
        myDesktop.add(f); */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            VistaVisualizarUsuarios us= new VistaVisualizarUsuarios();
            us.setVisible(true);
            /*
            JInternalFrame f = createFrame("Visualizar Empleados", us);
            f.setLocation(10,10);
            f.moveToFront();
            myDesktop.add(f);*/
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        VistaIngresaInmobiliaria in= new VistaIngresaInmobiliaria();
        in.setVisible(true);
        /*JInternalFrame f = createFrame("Ingresar inmobiliaria", in);
        f.setLocation(10,10);
        f.moveToFront();
        myDesktop.add(f);*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        
        Login log;
        try {
            log = new Login();
            log.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
         {
             System.exit(0);
         }
    }//GEN-LAST:event_formWindowClosing

    private void ModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEmpleadoActionPerformed
        try {
            // TODO add your handling code here:
            VistaModificarEmpleado vme = new VistaModificarEmpleado();
            vme.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarEmpleadoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ConocerEmpleado vme = new ConocerEmpleado();
            vme.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ClienteMoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteMoralActionPerformed
        try {
            // TODO add your handling code here:
            VistaRegistroClienteMoral vrcm= new VistaRegistroClienteMoral();
            vrcm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ClienteMoralActionPerformed

    private void ClienteFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteFisicoActionPerformed
        VistaRegistroClientes vrcf = null;
        try {
            vrcf = new VistaRegistroClientes();
        } catch (Exception ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        vrcf.setVisible(true);

    }//GEN-LAST:event_ClienteFisicoActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try {
            // TODO add your handling code here:
            Interfaz in= new Interfaz();
            in.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ModificarActionPerformed

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

    private void Operación2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operación2ActionPerformed
        // TODO add your handling code here:
        VistaEstudioSocioeconomico ve;
        try {
            ve = new VistaEstudioSocioeconomico();
            ve.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Operación2ActionPerformed

    private void OperaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperaciónActionPerformed
        try {
            // TODO add your handling code here:
            VistaOperaciones op=new VistaOperaciones();
            op.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_OperaciónActionPerformed

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            // TODO add your handling code here:
            VistaVerOperaciones vvo= new VistaVerOperaciones();
            vvo.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaOficial.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // TODO add your handling code here:
            VistaInternasPreocupantes VIP= new VistaInternasPreocupantes();
            VIP.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VistaOficial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    /* private static JInternalFrame createFrame(String t, JFrame frame) {
    JInternalFrame f = new JInternalFrame(t);
    f.toFront();
    f.setResizable(false);
    f.setClosable(true);
    f.setMaximizable(false);
    f.setIconifiable(false);
    f.setOpaque(false);
    f.setSize(frame.getSize());
    f.setVisible(true);
    
    for (int i=0;i<=frame.getComponentCount()-1;i++)
    {
    Component comp = (Component)frame.getComponent(i);
    f.getContentPane().add(comp);
    }
    return f;
    } */
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //UIManager.setLookAndFeel((new UpperEssentialLookAndFeel("C:\\Users\\Clemente\\Documents\\NetBeansProjects\\PLD\\Prueba.theme")));
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClienteFisico;
    private javax.swing.JButton ClienteMoral;
    private javax.swing.JButton ConoceCliente;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton ModificarEmpleado;
    private javax.swing.JButton Operación;
    private javax.swing.JButton Operación1;
    private javax.swing.JButton Operación2;
    private javax.swing.JButton VerCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
