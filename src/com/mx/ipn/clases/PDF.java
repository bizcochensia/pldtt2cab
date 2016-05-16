/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mx.ipn.clases;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.ZapfDingbatsList;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author bdfernandez
 */
public class PDF {
    // Creacion del documento con los margenes
    
 
    public void crearpdf(String nombre,String appat,String apmat) throws FileNotFoundException, DocumentException{
     // Creacion del documento con los margenes
   // Creacion del documento con los margenes
  Document document = new Document(PageSize.A4, 35, 30, 50, 50);
  try {

   // El archivo pdf que vamos a generar
   FileOutputStream fileOutputStream = new FileOutputStream(
     "AvisoPrivacidad.pdf");
   
   // Obtener la instancia del PdfWriter
   PdfWriter.getInstance(document, fileOutputStream);

   // Abrir el documento
   document.open();
   
   

   // Crear las fuentes para el contenido y los titulos
   Font fontContenido = FontFactory.getFont(
     FontFactory.TIMES_ROMAN.toString(), 9, Font.NORMAL,
     BaseColor.DARK_GRAY);
   Font fontTitulos = FontFactory.getFont(
     FontFactory.TIMES_BOLD, 11, Font.UNDERLINE,
     BaseColor.DARK_GRAY);
   Font nomb = FontFactory.getFont(
     FontFactory.TIMES_BOLD, 9, Font.NORMAL,
     BaseColor.DARK_GRAY);
  


   
   // Creacion del parrafo
   Paragraph paragraph = new Paragraph();
   
   // Agregar un titulo con su respectiva fuente
   paragraph.add(new Phrase("Aviso de Privacidad", fontTitulos));
    paragraph.setAlignment(Element.ALIGN_CENTER);

   // Agregar saltos de linea
   paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase(Chunk.NEWLINE));

   // Agregar contenido con su respectiva fuente
   paragraph
     .add(new Phrase(
          "Con fundamento en los artículos 15, 16 y de acuerdo a lo Previsto en la Ley Federal de Protección de Datos" 
           +"Personales, hacemos de su conocimiento que ZERCHERS, S.A. de C.V., es una empresa legalmente" 
           +"constituido de conformidad con las leyes mexicanas, con domicilio en Av. Juan de Dios Bátiz s/n, Gustavo" 
           +"A. Madero, Nueva Industrial Vallejo, 07700 Ciudad de México; y como responsable del tratamiento de sus" 
           +"datos personales, del uso que se le dé a los mismos y de su protección. Hace de su conocimiento que la" 
           +"información de nuestros clientes es tratada de forma estrictamente confidencial por lo que, al proporcionar" 
           +"sus datos personales. Estos serán utilizados única y exclusivamente para los siguientes fines: "
           +"Proveer los servicios y productos que ha solicitado; notificarle sobre nuevos servicios o productos que"
           +"tengan relación con los ya contratados o adquiridos; comunicarle sobre cambios en los mismos; evaluar la"
           +"calidad de los servicios que brindamos; mantener actualizada nuestra base de datos con sus datos"
           +"recientes y en general, para dar cumplimiento a las obligaciones que hemos contraído con usted.",fontContenido));

   paragraph.add(new Phrase(Chunk.NEWLINE));
    paragraph.add(new Phrase(
            " Para las finalidades antes mencionadas, requerimos obtener los siguientes datos personales:", fontContenido));
    paragraph.setAlignment(Element.ALIGN_JUSTIFIED);
   paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase(Chunk.NEWLINE));
   // Agregar el parrafo al documento
   document.add(paragraph);
   
   document.add(Tabla_Simple());
   paragraph = new Paragraph();
   paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase(Chunk.NEWLINE));
   
   paragraph.add(new Phrase(
            "Para prevenir el acceso no autorizado a sus datos personales y con el fin de asegurar que la información sea "+
            "utilizada para los fines establecidos en este aviso de privacidad, hemos establecido diversos procedimientos"+
            " con la finalidad de evitar el uso o divulgación no autorizados de sus datos, permitiéndonos tratarlos debidamente."
            + "  Así mismo, le informamos que sus datos personales pueden ser Transmitidos para ser tratados por personas "
            + "distintas a esta empresa.   Todos sus datos personales son tratados de acuerdo a la legislación aplicable y "
            + "vigente en el país, por ello le informamos que usted tiene en todo momento los derechos (ARCO) de acceder, "
            + "rectificar, cancelar u oponerse al tratamiento que le damos a sus datos personales; derecho que podrá "
            + "hacer valer a través del Área de Privacidad encargada de la seguridad de datos personales en el "
                    + "Teléfono 5729 6000.", fontContenido));
   paragraph.setAlignment(Element.ALIGN_JUSTIFIED);
   
   paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase(Chunk.NEWLINE));
   
   paragraph.add(new Phrase(
            " A través de estos canales usted podrá actualizar sus datos y especificar el medio por el cual desea recibir "
                    + "información, ya que en caso de no contar con esta especificación de su parte, ZERCHERS, S.A. de C.V., "
                    + "establecerá libremente el canal que considere pertinente para enviarle información.  Este aviso de"
                    + " privacidad podrá ser modificado por ZERCHERS, S.A. de C.V., dichas modificaciones serán oportunamente "
                    + "informadas a través de correo electrónico, teléfono, página web o cualquier otro medio de comunicación"
                    + " que ZERCHERS, S.A. de C.V., determine para tal efecto.", fontContenido));
   paragraph.setAlignment(Element.ALIGN_JUSTIFIED);
    paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase(Chunk.NEWLINE));
   
    paragraph.add(new Phrase(
            " ATENTAMENTE", nomb));
    paragraph.add(new Phrase(Chunk.NEWLINE));
    paragraph.add(new Phrase(
            " Dirección General TT/SisPLD", nomb));
   paragraph.add(new Phrase(Chunk.NEWLINE));
     paragraph.add(new Phrase(Chunk.NEWLINE));
     paragraph.add(new Phrase(Chunk.NEWLINE));
     paragraph.add(new Phrase(Chunk.NEWLINE));
       paragraph.add(new Phrase(
            " Consiento que mis datos personales sensibles sean tratados conforme a" +
                "los términos y condiciones del presente aviso de privacidad.", fontContenido));
  paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase("Nombre: "+nombre+" "+appat+" "+apmat, nomb));
   paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase(Chunk.NEWLINE));
paragraph.add(new Phrase("____________________________________", fontContenido));
paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase(Chunk.NEWLINE));
   paragraph.add(new Phrase(Chunk.NEWLINE));  
paragraph.add(new Phrase(
            " Última Fecha de Emisión:  Mayo 13, 2016",fontContenido));

  
   document.add(paragraph);

   // Cerrar el documento
   document.close();

   // Abrir el archivo
   File file = new File("AvisoPrivacidad.pdf");
   Desktop.getDesktop().open(file);
  } catch (Exception ex) {
   ex.printStackTrace();
  }
 }
  public PdfPTable Tabla_Simple() throws BadElementException, IOException{   
      Paragraph paragraph1 = new Paragraph();
       Font nomb = FontFactory.getFont(
     FontFactory.TIMES_BOLD, 9, Font.NORMAL,
     BaseColor.DARK_GRAY);
       Image image;

   // Obtenemos el logo de datojava
   image = Image.getInstance(getClass().getResource("/com/ipn/mx/imagenes/logo.png"));
   image.scaleAbsolute(70f, 60f);
   
         //creamos la tabla con 3 columnas
         PdfPTable mitablasimple=new PdfPTable(2);
     PdfPCell cellimage = new PdfPCell(image);

   // Propiedades de la celda
  
   cellimage.setBorderColor(BaseColor.WHITE);
   cellimage.setHorizontalAlignment(Element.ALIGN_CENTER);
      
   paragraph1.add(new Phrase("1. Nombre completo Y/O Razón Social.", nomb));
   paragraph1.add(new Phrase(Chunk.NEWLINE));
   paragraph1.add(new Phrase("2. Dirección.", nomb));
   paragraph1.add(new Phrase(Chunk.NEWLINE));
   paragraph1.add(new Phrase("3. Registro Federal de Contribuyentes Y/O CURP.", nomb));
   paragraph1.add(new Phrase(Chunk.NEWLINE));
   paragraph1.add(new Phrase("4. Teléfonos de Oficina y móviles.", nomb));
   paragraph1.add(new Phrase(Chunk.NEWLINE));
   paragraph1.add(new Phrase("5. Actividad económica e ingreso promedio.", nomb));
   paragraph1.add(new Phrase(Chunk.NEWLINE));
   paragraph1.add(new Phrase("6. Correo Electrónico. ", nomb));
   paragraph1.add(new Phrase(Chunk.NEWLINE));
    PdfPCell cell = new PdfPCell(paragraph1);

   // Propiedades de la celda
  
   cell.setBorderColor(BaseColor.WHITE);
   cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
         mitablasimple.addCell(cell);
         mitablasimple.addCell(cellimage);
          //retornamos la tabla
                 
      return mitablasimple;
     }
}
 

