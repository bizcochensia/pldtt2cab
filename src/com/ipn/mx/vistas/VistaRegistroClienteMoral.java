/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.ipn.mx.conexion.ClienteDao;
import com.ipn.mx.conexion.Conexion;
import com.mx.ipn.clases.Actividades;
import com.mx.ipn.clases.EntidadFederativa;
import com.mx.ipn.clases.Localidad;
import com.mx.ipn.clases.MiPanel;
import com.mx.ipn.clases.Pais;
import com.mx.ipn.clases.Validaciones;
import java.awt.BorderLayout;
import java.sql.Connection;
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
public class VistaRegistroClienteMoral extends javax.swing.JFrame {

    Conexion con=new Conexion();
    Connection reg=con.conectar();
    String dia;
    String año;
    String aux;
    int mes;
    
    /**
     * Creates new form VistaRegistroClienteMoral
     */
    public VistaRegistroClienteMoral() throws SQLException {
        initComponents();
        cargarpais();
        cargaractividades();
          ///
        Calendar c2 = new GregorianCalendar();
        calendario.setCalendar(c2);
       
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        combopais = new javax.swing.JComboBox();
        comboEntidadFede = new javax.swing.JComboBox();
        Combolocalidad = new javax.swing.JComboBox();
        calle = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        cp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RFC = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        comboactividad = new javax.swing.JComboBox();
        ingreso = new javax.swing.JTextField();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));
        jPanel2.setOpaque(false);

        jLabel4.setText("*Pais Origen:");

        jLabel5.setText("*Entidad federativa:");

        jLabel6.setText("*Localidad:");

        jLabel10.setText("*Calle:");

        jLabel11.setText("*Numero:");

        jLabel12.setText("*Codigo postal:");

        combopais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...." }));

        comboEntidadFede.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...." }));
        comboEntidadFede.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEntidadFedeItemStateChanged(evt);
            }
        });
        comboEntidadFede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboEntidadFedeMouseClicked(evt);
            }
        });

        Combolocalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...." }));
        Combolocalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CombolocalidadMouseClicked(evt);
            }
        });
        Combolocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombolocalidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Combolocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combopais, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEntidadFede, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(combopais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboEntidadFede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Combolocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setText("*Nombre(s):");

        jLabel13.setText("*RFC:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Económicos"));
        jPanel3.setOpaque(false);

        jLabel7.setText("*Telefono:");

        jLabel8.setText("*Actividad principal:");

        jLabel9.setText("*Ingreso promedio:");

        comboactividad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        comboactividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboactividadActionPerformed(evt);
            }
        });

        jLabel15.setText("*Fecha Nacimiento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(comboactividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(calendario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Registro Persona Moral");

        jLabel17.setText("Los campos marcados con (*) son obligatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(39, 39, 39)
                                .addComponent(jButton1))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEntidadFedeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEntidadFedeItemStateChanged

    }//GEN-LAST:event_comboEntidadFedeItemStateChanged

    private void comboEntidadFedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboEntidadFedeMouseClicked
        try {
            comboEntidadFede.removeAllItems();
            Pais pa= new Pais();
            pa=(Pais) combopais.getSelectedItem();

            String consulta="Select * from entidad_federativa where id_pais="+pa.getIdPais();
            Statement st2=reg.createStatement();
            ResultSet rs2=st2.executeQuery(consulta);
            while(rs2.next()){
                EntidadFederativa ef= new EntidadFederativa();
                ef.setIdEntidadFederativa(rs2.getInt(1));
                ef.setIdPais(pa.getIdPais());
                ef.setNombre(rs2.getString(2));
                comboEntidadFede.addItem(ef);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaRegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboEntidadFedeMouseClicked

    private void CombolocalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CombolocalidadMouseClicked
        // TODO add your handling code here:
        try {
            Combolocalidad.removeAllItems();
            EntidadFederativa fe= new EntidadFederativa();
            fe=(EntidadFederativa) comboEntidadFede.getSelectedItem();

            String consulta="Select * from localidad where EF_id="+fe.getIdEntidadFederativa();
            Statement st2=reg.createStatement();
            ResultSet rs2=st2.executeQuery(consulta);
            while(rs2.next()){
                Localidad lo=new Localidad();
                lo.setIdEntidadFed(fe.getIdEntidadFederativa());
                lo.setIdlocalidad(rs2.getInt(1));
                lo.setNombre(rs2.getString(3));
                Combolocalidad.addItem(lo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VistaRegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Elige una entidad Federativa");
        }
    }//GEN-LAST:event_CombolocalidadMouseClicked

    private void CombolocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombolocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombolocalidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Validaciones v=new Validaciones();
        boolean n=v.sololetras(nombre.getText());
        boolean rfc=v.RFCfisica(RFC.getText());
        boolean ca=v.sololetras(calle.getText());
        boolean cop=v.codigopostal(cp.getText());
        boolean num=v.numerocalle(numero.getText());
        boolean tel=v.numerosTelefonico(telefono.getText());
        boolean ing=v.sololetras(ingreso.getText());
        boolean fec=v.sololetras(nombre.getText());
        
        
        aux=calendario.getDate().toString();
        aux=calendario.getDate().toString();
        dia=aux.substring(8,10);
        año=aux.substring(24, 28);
        mes=calendario.getDate().getMonth();
        int a= (Integer) mes;
        a=a+1;
        String insert= año+"-"+a+"-"+dia;

        if(nombre.getText().equals("") || RFC.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Los campos en la seccion de nombre son obligatorios");
        }
        else{
            if(calle.getText().equals("") || numero.getText().equals("") || cp.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los campos en la sección de dirección son obligatorios");
            }
            else{
                if(numero.getText().equals("") || ingreso.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Los campos en la sección de otros datos son obligatorios");
                }
                else{
                    if( n  ){
                        if( ca && num && cop){
                            if(tel){
                                if(ing){
                                    if(rfc){
                                        ClienteDao cliente=new ClienteDao();
                                        Actividades act= new Actividades();
                                        act=(Actividades) comboactividad.getSelectedItem();
                                        Pais p=new Pais();
                                        p=(Pais) combopais.getSelectedItem();
                                        EntidadFederativa f=new EntidadFederativa();
                                        f=(EntidadFederativa) comboEntidadFede.getSelectedItem();
                                        Localidad lo=new Localidad();
                                        lo=(Localidad) Combolocalidad.getSelectedItem();
                                        double aux= Double.parseDouble(ingreso.getText());
                                        cliente.RegistroCliente(nombre.getText(),"", "",insert,2, RFC.getText(),
                                            calle.getText(), numero.getText(),0,p.getIdPais(),f.getIdEntidadFederativa(),lo.getIdlocalidad()
                                            , cp.getText(),telefono.getText(),0,act.getId_actividad(),aux);
                                        JOptionPane.showMessageDialog(null, "El registro fue exitoso!");
                                         if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realizar otro registro?",
                                            "Registro nuevo", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
                                     {
                                         this.dispose();
                                     }else{
                                             this.dispose();
                                             VistaRegistroClienteMoral vrcm;
                                            try {
                                                vrcm = new VistaRegistroClienteMoral();
                                                vrcm.setVisible(true);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(VistaRegistroClienteMoral.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                                
                                         }
                                        
                                    }
                                    else{JOptionPane.showMessageDialog(null, "La estructura del RFC no es valida");}
                                }
                                else{JOptionPane.showMessageDialog(null, "El campo ingresos requiere de solo numeros con dos decimales");}
                            }
                            else{JOptionPane.showMessageDialog(null, "El campo Telefono  solo acepta numeros y necesita 8 digitos");}
                        }
                        else{JOptionPane.showMessageDialog(null, "Texto invalido en los campos de direccion");}
                    }
                    else{JOptionPane.showMessageDialog(null, "Los campos en la seccion de nombre solo reciben letras");}
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboactividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboactividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboactividadActionPerformed

    public void cargarpais() throws SQLException {
     Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("Select * from pais");
            while(rs.next()){
                Pais p=new Pais();
                p.setIdPais(rs.getInt(1));
                p.setNombrePais(rs.getString(2));
            combopais.addItem(p);
     }
        } catch (SQLException ex) {
            Logger.getLogger(VistaRegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    
    
    
    
    public void cargaractividades() throws SQLException {
     Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("Select * from actividades");
            while(rs.next()){
                Actividades act=new Actividades();
                act.setId_actividad(rs.getInt(1));
                act.setFolio(rs.getInt(2));
                act.setActividad(rs.getString(3));
                act.setRiesgo(rs.getInt(4));
            comboactividad.addItem(act);
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
            java.util.logging.Logger.getLogger(VistaRegistroClienteMoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroClienteMoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroClienteMoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroClienteMoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VistaRegistroClienteMoral().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaRegistroClienteMoral.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combolocalidad;
    private javax.swing.JTextField RFC;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JTextField calle;
    private javax.swing.JComboBox comboEntidadFede;
    private javax.swing.JComboBox comboactividad;
    private javax.swing.JComboBox combopais;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField ingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
