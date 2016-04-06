/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mx.ipn.clases;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


/**
 *
 * @author bdfernandez
 */
public class MiPanel extends javax.swing.JPanel {
    public MiPanel(){ 
        this.setSize(900,700); 
    } 
    @Override 
public void paint(Graphics g){ 
Dimension tamanio = getSize(); 
ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/com/ipn/mx/imagenes/fondo.png")); 
g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null); 
setOpaque(false); 
super.paintComponent(g); 
} 

}
