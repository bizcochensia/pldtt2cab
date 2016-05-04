/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ipn.clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Clemente
 */
public class Validaciones {
    
      public boolean numerosTelefonico(String cadena){
      boolean respuesta= false;
      Pattern pat= Pattern.compile("[0-9]{8,8}");
      Matcher mat=pat.matcher(cadena);
      if(mat.find()){
      respuesta=true;
      }
      return respuesta;
      }

      public boolean Ingreso(String cadena){
      boolean respuesta= false;
      Pattern pat= Pattern.compile("[0-9]{1,}(\\.[0-9]*)");
      Matcher mat=pat.matcher(cadena);
      if(mat.find()){
      respuesta=true;
      }
      return respuesta;
      }
      
      
      public boolean RFCfisica(String cadena){
      boolean respuesta= false;
      Pattern pat= Pattern.compile("[A-Z]{4,4}[0-9]{6,6}[A-Z0-9]{3,3}");
      Matcher mat=pat.matcher(cadena);
      if(mat.find()){
      respuesta=true;
      }
      return respuesta;
      }
      
      public boolean sololetras(String cadena){
      boolean respuesta= false;
      Pattern pat= Pattern.compile("[A-Z]{1,1}[a-z]{1,14}"); 
      Matcher mat=pat.matcher(cadena);
      if(mat.find()){
      respuesta=true;
      }
      return respuesta;
      }
      
      public boolean alfanumericos(String cadena){
      boolean respuesta= false;
      Pattern pat= Pattern.compile("[a-zA-Z0-9]{1,15}");
      Matcher mat=pat.matcher(cadena);
      if(mat.find()){
      respuesta=true;
      }
      return respuesta;
      }
      
      
      public boolean contraseña(String cadena){
      boolean respuesta= false;
      Pattern pat= Pattern.compile("");
      Matcher mat=pat.matcher(cadena);
      if(mat.find()){
      respuesta=true;
      }
      return respuesta;
      }
      
      public boolean codigopostal(String cadena){
      boolean respuesta= false;
      Pattern pat= Pattern.compile("[0-9]{5,5}");
      Matcher mat=pat.matcher(cadena);
      if(mat.find()){
      respuesta=true;
      }
      return respuesta;
      }
      
      public boolean numerocalle(String cadena){
      boolean respuesta= false;
      Pattern pat= Pattern.compile("[0-9]{1,5}");
      Matcher mat=pat.matcher(cadena);
      if(mat.find()){
      respuesta=true;
      }
      return respuesta;
      }
      
      
      public boolean periodo(String cadena){
      boolean respuesta= false;
      Pattern pat= Pattern.compile("[0-9]{6,6}");
      Matcher mat=pat.matcher(cadena);
      if(mat.find()){
      respuesta=true;
      }
      return respuesta;
      }
      
}
