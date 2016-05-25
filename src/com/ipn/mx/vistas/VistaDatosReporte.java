/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.ipn.mx.conexion.OperacionDAO;
import com.ipn.mx.conexion.ReporteDAO;
import com.mx.ipn.clases.AESDemo;
import com.mx.ipn.clases.MiPanel;
import com.mx.ipn.clases.Operacion;
import com.mx.ipn.clases.Validaciones;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Clemente
 */
public class VistaDatosReporte extends javax.swing.JFrame {

//public Operacion ope= new Operacion(VistaVerOperaciones.operacion);
    ReporteDAO nrep=new ReporteDAO();
    AESDemo daes = new AESDemo();
    ArrayList<Operacion> listareportes = new ArrayList <Operacion>(VistaCalificacionCliente.listaOpReportes); //pasa el array list de la vista 
    ArrayList<String[]> list2 = new ArrayList<String[]>();
    int respuesta;
    int numContrato=0;
    int i=0;
    int auxfor=0;
    int auxalarmas=0;
    //int idCliente=VistaVerOperaciones.idCliente;
    int idCliente=0;
    //int alarmas=VistaVerOperaciones.numalarmas;
    int alarmas=0;
    //int idOperacion=VistaVerOperaciones.idOperacion;
    ResultSet t;
    
    String []encabezados= {"TIPO DE REPORTE","PERIODO DEL REPORTE","FOLIO","ORGANISMO SUPERVISOR","CLAVE DEL SUJETO OBLIGADO","LOCALIDAD",
         "CODIGO POSTAL DE LA SUCURSAL","TIPO DE OPERACION","INSTRUMENTO ETARIO","NUMERO DE CUENTA,CONTRATO U OPERACION","MONTO","MONEDA",
         "FECHA DE LA OPERACION","FECHA DE DETECCION","NACIONALIDAD","TIPO DE PERSONA","RAZON SOCIAL O DENOMINACION","NOMBRE",
         "APELLIDO PATERNO","APELLIDO MATERNO","RFC","CURP","FECHA NACIMIENTO O CONSTITUCION","DOMICILIO"
         ,"COLONIA","CIUDAD O POBLACION","TELEFONO","ACTIVIDAD ECONOMICA","CONSECUTIVO DE PERSONAS Y/O PERSONAS RELAIONADAS",
         "NUMERO DE CUENTA,CONTRATO,OPERACION,POLIZA O NUMERO DE SEGURIDAD SOCIAL","CLAVE DEL SUJETO OBLIGADO",
         "NOMBRE DEL TITULAR DE LA CUENTA","APELLIDO PATERNO","APELLIDO MATERNO","DESCRIPCION DE LA OPERACION",
         "RAZONES POR LAS QUE LA OPERACION SE CONSIDERA INUSUAL"};
     ResultSet rs;
     ResultSet aux2;
     String tipoReporte="";     String fechaop="";              String domicilio="";            String razones="";
     String periodo="";         String fechadet="";             String colonia="";              String monto="";
     String folio="";           String nacionalidad="";         String ciudad="";               String numcuenta2="";
     String organosup="";       String tipopersona="";          String telefono="";
     String clave="";           String Razonsocial="";          String actividad="";
     String localidad="";       String nombre="";               String consecutivo="";
     String CPINM="";           String ApPat="";                String clave2="";
     String tipoOp="";          String ApMat="";                String nombre2="";
     String Instrumento="";     String RFC="";                  String appat2="";
     String numCuenta="";       String CURP="";                 String apmat2="";
     String moneda="";          String fechanac="";             String descripcion="";
    
    
    
    
    
    
    
    /**
     * Creates new form VistaDatosReporte
     */
    public VistaDatosReporte() {
        initComponents();
        
        daes.addKey(Login.contraseña);
         MiPanel p = new MiPanel(); 
      this.add( p , BorderLayout.CENTER); 
       p.repaint(); 
         setLayout(null);
        setLocationRelativeTo(null);        // Centering on screen...
       // Setting dimensions...
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        recibenombre = new javax.swing.JTextField();
        recibeperiodo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generar Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del Archivo:");

        jLabel2.setText("Periodo Informe AAAAMM:");

        recibenombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibenombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(recibeperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(recibenombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(recibenombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(recibeperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    String nombrearchivo=recibenombre.getText();
        periodo=recibeperiodo.getText();
        Validaciones val=new Validaciones();
        boolean n=val.sololetras(nombrearchivo);
        boolean p=val.periodo(periodo);
        
        if(n && p){
            try {  
                //C:\Users\Clemente\Desktop\ESCOM\lavadodinero\nuevacarpetatt2\pldtt2cab
            String rutaArchivo = "\\Users\\Clemente\\Desktop\\ESCOM\\lavadodinero\\nuevacarpetatt2\\pldtt2cab"+"\\"+nombrearchivo+".xls";
            System.out.println(rutaArchivo);
            OperacionDAO d=new OperacionDAO();
                
                for(int z=0;z<listareportes.size();z++){
                    System.out.println("el valor de z es"+z);
            Operacion ope=listareportes.get(z); //puse esta en vez de la primera linea comentada
            String a=Integer.toString(ope.getIdOperacion());
                    System.out.println("el valor de a es"+a);
            rs=d.DatosReportes(a);
            
             while(rs.next()){
                 alarmas=rs.getInt("numalarmas");
                idCliente=rs.getInt("id_Cliente");
                clave=rs.getString("clave");
                CPINM=rs.getString("codigoPostal");
                tipoOp=rs.getString("clavetipoOp");
                localidad=rs.getString("EntidadFede");
                Instrumento=rs.getString("monetarioclave");
                numCuenta=daes.decrypt(rs.getString("numeroContrato"));
                monto=rs.getString("monto");
                moneda=rs.getString("claveMoneda");
                fechaop=rs.getString("fechaOperacion");
                nacionalidad=rs.getString("paisOrigen");
                tipopersona=rs.getString("id_tipo");
                Razonsocial=rs.getString("nombre");
                nombre=daes.decrypt(rs.getString("nombre"));
                ApPat=daes.decrypt(rs.getString("apellido_Pat"));
                ApMat=daes.decrypt(rs.getString("apellido_Mat"));
                RFC=daes.decrypt(rs.getString("RFC"));
                fechanac=rs.getString("fecha_nac");
                domicilio=rs.getString("calle");
                ciudad=rs.getString("clave");
                telefono=daes.decrypt(rs.getString("numero_Telefono"));
                actividad=rs.getString("folio");
                descripcion=daes.decrypt(rs.getString("detalleop"));                
            }
            
             if(alarmas==1){tipoReporte="1";
             
             t=nrep.obtencantidadContratos(idCliente);
             while(t.next())
             { numContrato=t.getInt("cantidadContratos"); }
             
             String[] ContratosCliente = new String[numContrato]; 
             
             t=nrep.obtenContratos(idCliente);
             while(t.next()){
             ContratosCliente[i]=t.getString("numeroContrato");
             i++;
             }
             
             for(int j=0;j<ContratosCliente.length;j++){
                 t=nrep.AlarmasporContrato(ContratosCliente[j]);
                 while(t.next())
                 {
                 auxalarmas=t.getInt("numeroalarmas");
                 }
                 if(auxalarmas==1){
                 consecutivo=consecutivo+ContratosCliente[j];
                 }
             }
             }
             
             
             else{tipoReporte="2";}
             
             if(nacionalidad.equals("1")){}
             else{nacionalidad="2";}
             
             if(tipopersona.equals("1")){
             Razonsocial="";
             }
             else{
             nombre="";
             }
            
             nrep.insertaReporte(ope.getIdOperacion(),rutaArchivo); //cambiar por rutaArchivo
             
             String b=Integer.toString(ope.getIdOperacion());
             aux2=nrep.VerReportes(b);
             
             while(aux2.next()){
             folio=aux2.getString("folio");
             }
             
            ResultSet t=nrep.VerAlarmas(ope.getIdOperacion()); //modifique el parametro
            while(t.next()){
            razones=razones+t.getString("Descripcion");
            }
            
            String []datos= {tipoReporte,periodo,folio,organosup,clave,localidad,CPINM,tipoOp,Instrumento,numCuenta,monto,moneda,fechaop,fechadet,
                     nacionalidad,tipopersona,Razonsocial,nombre,ApPat,ApMat,RFC,CURP,fechanac,domicilio,colonia,ciudad,telefono,actividad,
                    consecutivo,numcuenta2,clave2,nombre2,appat2,apmat2,descripcion,razones};
            
            list2.add(datos);
                 } 
            //}cierra el try
            
            try {
                File archivoXLS = new File(rutaArchivo);
                /*String []datos= {tipoReporte,periodo,folio,organosup,clave,localidad,CPINM,tipoOp,Instrumento,numCuenta,monto,moneda,fechaop,fechadet,
                     nacionalidad,tipopersona,Razonsocial,nombre,ApPat,ApMat,RFC,CURP,fechanac,domicilio,colonia,ciudad,telefono,actividad,
                    consecutivo,numcuenta2,clave2,nombre2,appat2,apmat2,descripcion,razones};*/
                
                if(archivoXLS.exists()) archivoXLS.delete();
                
                archivoXLS.createNewFile();
                
                
                Workbook libro = new HSSFWorkbook();
                
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                
                
                Sheet hoja = libro.createSheet("Reporte");
                
                
                for(int f=0;f<list2.size()+1;f++){
                    /* crear las filas*/
                    
                    
                    
                    Row fila = hoja.createRow(f);
                    if(auxfor<=list2.size()-1){auxfor++;}
                    for(int c=0;c<encabezados.length;c++){
                        /*Creamos la celda a partir de la fila actual*/
                        Cell celda = fila.createCell(c);
                        
                        /*Si la fila es la número 0, estableceremos los encabezados*/
                        if(f==0){
                            celda.setCellValue(encabezados[c]);
                        }else{
                            /*Si no es la primera fila establecemos un valor*/
                            String []datos2=list2.get(f-1);
                            celda.setCellValue(datos2[c]);
                            System.out.println("tiene en :"+encabezados[c]+"el dato de:"+datos2[c]+"\n");
                        }
                    }
                }
                
                /*Escribimos en el libro*/
                libro.write(archivo);
                /*Cerramos el flujo de datos*/
                archivo.close();
                JOptionPane.showMessageDialog(null,"Archivo creado");
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(VistaDatosReporte.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error intentelo nuevamente");
            }
            
            
        } catch (SQLException ex) {
             Logger.getLogger(VistaDatosReporte.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"Ocurrio un error intentelo nuevamente");
         }
        }
        else{
            JOptionPane.showMessageDialog(null,"Valores en los campos invalidos"+"\n"+"El nombre solo acpeta letras y una longitud de 15\n"+"El periodo debe tener el formato de AAAAMM ");
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void recibenombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibenombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recibenombreActionPerformed

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
            java.util.logging.Logger.getLogger(VistaDatosReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDatosReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDatosReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDatosReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDatosReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField recibenombre;
    private javax.swing.JTextField recibeperiodo;
    // End of variables declaration//GEN-END:variables
}
