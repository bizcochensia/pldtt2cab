/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.ipn.mx.conexion.Conexion;
import com.ipn.mx.conexion.OperacionDAO;
import com.mx.ipn.clases.AESDemo;
import com.mx.ipn.clases.MiPanel;
import com.mx.ipn.clases.Operacion;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Clemente
 */
public class VistaVerOperacionesV extends javax.swing.JFrame {
    Conexion con=new Conexion();
    Connection reg=con.conectar();
    int posicion=0;
    ArrayList <Operacion> lista= new ArrayList<Operacion>();
    public Operacion op=new Operacion();
    public static int operacion;
    int parametro=0;
    String nombre="";
    public static int idOperacion=0;
    public static int idCliente=0;
    public static int numalarmas=0;
    int respuesta;
    AESDemo d = new AESDemo ();
    
    /**
     * Creates new form VistaVerOperaciones
     */
    public VistaVerOperacionesV() throws SQLException {
        d.addKey(Login.contraseña);
        initComponents();
                   MiPanel p = new MiPanel();
        this.add( p , BorderLayout.CENTER);
        p.repaint();
        setLayout(null);
        setLocationRelativeTo(null);        // Centering on screen...
        setSize(900, 700);               // Setting dimensions...
        setTitle("SisPLD");
        setResizable(false);
   
        cargardatos();
        mostrardatos(posicion);
        muestradescripcion.setLineWrap(true);
        
        muestracliente.setEditable(false);
        muestracontrato.setEditable(false);
        muestradescripcion.setEditable(false);
        muestraempleado.setEditable(false);
        muestrafecha.setEditable(false);
        muestrainmobiliaria.setEditable(false);
        muestramoneda.setEditable(false);
        muestramonetario.setEditable(false);
        muestramonto.setEditable(false);
        muestratipoOperacion.setEditable(false);
       
         ///
        
        
    }

        public void cargardatos() {
             Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("Select * from operaciones o inner join intermedia_operacion_alarma ioa where o.id_Operacion=ioa.Operacion_id order by fecha " );
            while(rs.next()){
                Operacion op=new Operacion();
                op.setIdOperacion(rs.getInt(1));
                op.setContrato(d.decrypt(rs.getString(2)));
                op.setMonto(rs.getDouble(3));
                op.setFecha(rs.getString(4));
                op.setRiesgo(rs.getDouble(5));
                op.setDescripcion(d.decrypt(rs.getString(6)));
                op.setClienteid(rs.getInt(7));
                op.setEmpleadoid(rs.getInt(8));
                op.setInmobiliariaid(rs.getInt(9));
                op.setTipoid(rs.getInt(10));
                op.setMonedaid(rs.getInt(11));
                op.setMonetarioid(rs.getInt(12));
                lista.add(op);
                
                
     }
        } catch (SQLException ex) {
            Logger.getLogger(VistaRegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
        
    public void mostrardatos(int posicion) throws SQLException{
        op=lista.get(posicion);
        String a=Integer.toString(op.getIdOperacion());
        String e="Select count(*) as numeroalarmas,op.id_Operacion, op.numeroContrato,op.monto,op.fecha,op.descripcion,tiop.tipo_operacion,mo.instrumento_monetario,m.clave,c.id_cliente,c.nombre,e.nombre as empleado,i.nombre as inmobiliaria from operaciones op inner join monetario mo on op.monetario_id=mo.id_clavemonetario inner join moneda m on op.moneda_id=m.id_moneda inner join cliente c on op.Cliente_id=c.id_cliente inner join empleado e on op.Empleado_id=e.id_Empleado inner join inmobiliaria i on op.Inmobiliaria_id=i.id_inmobiliaria inner join tipo_operacion tiop on op.tipo_id=tiop.id_tipoOp inner join  intermedia_operacion_alarma ioa on ioa.Operacion_id=op.id_Operacion where op.id_Operacion='"+a+"'    ";    
        String nom="Select count(*) as numeroalarmas,op.id_Operacion, op.numeroContrato,op.monto,op.fecha,op.descripcion,tiop.tipo_operacion,mo.instrumento_monetario,m.clave,c.id_cliente,c.nombre,e.nombre as empleado,i.nombre as inmobiliaria from operaciones op inner join monetario mo on op.monetario_id=mo.id_clavemonetario inner join moneda m on op.moneda_id=m.id_moneda inner join cliente c on op.Cliente_id=c.id_cliente inner join empleado e on op.Empleado_id=e.id_Empleado inner join inmobiliaria i on op.Inmobiliaria_id=i.id_inmobiliaria inner join tipo_operacion tiop on op.tipo_id=tiop.id_tipoOp inner join  intermedia_operacion_alarma ioa on ioa.Operacion_id=op.id_Operacion where op.id_Operacion='"+a+"' and c.nombre='"+nombre+"'    ";
       
        Statement st;
        st = reg.createStatement();
        
        if(parametro==0){
        ResultSet rs=st.executeQuery(e);
        while(rs.next()){
        operacion=rs.getInt("id_Operacion");
        muestracontrato.setText(d.decrypt(rs.getString("numeroContrato")));
        muestramonto.setText(rs.getString("monto"));
        muestradescripcion.setText(d.decrypt(rs.getString("descripcion")));
        muestrafecha.setText(rs.getString("fecha"));
        muestracliente.setText(d.decrypt(rs.getString("nombre")));
        muestraempleado.setText(rs.getString("empleado"));
        muestrainmobiliaria.setText(rs.getString("inmobiliaria"));
        muestramoneda.setText(rs.getString("clave"));
        muestramonetario.setText(rs.getString("instrumento_monetario"));
        muestratipoOperacion.setText(rs.getString("tipo_operacion")); 
        numeroalarma.setText(rs.getString("numeroalarmas"));
        numalarmas=rs.getInt("numeroalarmas");
        idOperacion=rs.getInt("id_Operacion");
        idCliente=rs.getInt("id_cliente");
        }
        }
        else if(parametro==1){
                ResultSet s=st.executeQuery(nom);
        while(s.next()){
        operacion=s.getInt("id_Operacion");
        muestracontrato.setText(s.getString("numeroContrato"));
        muestramonto.setText(s.getString("monto"));
        muestradescripcion.setText(s.getString("descripcion"));
        muestrafecha.setText(s.getString("fecha"));
        muestracliente.setText(s.getString("nombre"));
        muestraempleado.setText(s.getString("empleado"));
        muestrainmobiliaria.setText(s.getString("inmobiliaria"));
        muestramoneda.setText(s.getString("clave"));
        muestramonetario.setText(s.getString("instrumento_monetario"));
        muestratipoOperacion.setText(s.getString("tipo_operacion"));
        idOperacion=s.getInt("id_Operacion");
        idCliente=s.getInt("id_cliente");
        }
        }
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        muestratipoOperacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        muestrafecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        muestracliente = new javax.swing.JTextField();
        muestraempleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        muestrainmobiliaria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        muestramoneda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        muestramonetario = new javax.swing.JTextField();
        muestracontrato = new javax.swing.JTextField();
        muestramonto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        filtro = new javax.swing.JComboBox();
        recibepara = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numeroalarma = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        muestradescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("Cliente asociado");

        jLabel5.setText("Empleado asociado");

        jLabel10.setText("Fecha");

        jLabel6.setText("Inmobiliaria asociada");

        jLabel7.setText("Moneda utilizada");

        jLabel8.setText("Tipo de pago");

        jLabel9.setText("Tipo Operación");

        jLabel1.setText("Numero de Contrato");

        muestrainmobiliaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muestrainmobiliariaActionPerformed(evt);
            }
        });

        jLabel2.setText("Monto");

        jLabel3.setText("Descripción del bien");

        muestramonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muestramontoActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonflechaderecha.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/botonflechaizquierda.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 153, 51));
        jButton5.setText("Regresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Visualizar Operaciones ");

        jLabel13.setText("Filtrar por:");

        filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Nombre", "Fecha" }));
        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });

        recibepara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibeparaActionPerformed(evt);
            }
        });

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel14.setText("Selecciona la flecha para ver la operación siguiente");

        jLabel12.setText("Numero de alarmas");

        muestradescripcion.setColumns(20);
        muestradescripcion.setRows(5);
        jScrollPane1.setViewportView(muestradescripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(recibepara, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton6))
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(muestramonto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(muestracontrato, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(muestraempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(muestracliente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(muestrainmobiliaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(muestramoneda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(muestramonetario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(numeroalarma, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(muestrafecha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(muestratipoOperacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recibepara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(muestracontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(muestramonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(muestracliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(muestraempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(muestrainmobiliaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(muestramoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(numeroalarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(muestramonetario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(muestratipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(muestrafecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void muestrainmobiliariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muestrainmobiliariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muestrainmobiliariaActionPerformed

    private void muestramontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muestramontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muestramontoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(posicion>=lista.size()-1){
            JOptionPane.showMessageDialog(null,"No hay mas operaciones para mostrar");
        }
        else{
            System.out.println("la posicion  es de:"+posicion+"    ");
            posicion++;
            System.out.println("la posicion despues es de:"+posicion+"\n");
            try {
                mostrardatos(posicion);
            } catch (SQLException ex) {
                Logger.getLogger(VistaVerOperacionesV.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            if(posicion==0){
                JOptionPane.showMessageDialog(null,"No hay mas operaciones para mostrar");
            }
            else{
                posicion--;
            }
            mostrardatos(posicion);
        } catch (SQLException ex) {
            Logger.getLogger(VistaVerOperacionesV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        parametro=filtro.getSelectedIndex();
        if(parametro==1){
           nombre=recibepara.getText();
            try {
                posicion=0;
                mostrardatos(posicion);
            } catch (SQLException ex) {
                Logger.getLogger(VistaVerOperacionesV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroActionPerformed

    private void recibeparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibeparaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recibeparaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVerOperacionesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVerOperacionesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVerOperacionesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVerOperacionesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VistaVerOperacionesV().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaVerOperacionesV.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox filtro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField muestracliente;
    private javax.swing.JTextField muestracontrato;
    private javax.swing.JTextArea muestradescripcion;
    private javax.swing.JTextField muestraempleado;
    private javax.swing.JTextField muestrafecha;
    private javax.swing.JTextField muestrainmobiliaria;
    private javax.swing.JTextField muestramoneda;
    private javax.swing.JTextField muestramonetario;
    private javax.swing.JTextField muestramonto;
    private javax.swing.JTextField muestratipoOperacion;
    private javax.swing.JTextField numeroalarma;
    private javax.swing.JTextField recibepara;
    // End of variables declaration//GEN-END:variables
}
