/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mx.ipn.clases;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


/**
 *
 * @author bdfernandez
 */
public class MiPanel extends javax.swing.JPanel {
    public MiPanel(){ 
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize()); 
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
