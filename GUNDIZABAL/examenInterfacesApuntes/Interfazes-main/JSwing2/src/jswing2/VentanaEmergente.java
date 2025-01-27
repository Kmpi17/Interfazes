/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswing2;

import java.awt.Color;
import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author FP
 */
public class VentanaEmergente {
    JDialog ventanaEmergente = new JDialog();   //Ventana emergente
    JPanel panel = new JPanel();
    JLabel mensaje = new JLabel();
    
    public VentanaEmergente(){
        ventanaEmergente.setVisible(true);        
        ventanaEmergente.setTitle("Java Swing2");   //Para añadir un titulo a la ventana
        ventanaEmergente.setBounds(200, 200, 300, 300);    //Para elegir el tamaño de la ventana
        ventanaEmergente.setResizable(false);   //Para permitir (o no) que se cambie el tamaño de ventana
        ventanaEmergente.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
         
        /*
        Ventana emergente:
        
        No es una aplicacion, no se puede minimizar y es una extension de otra aplicacion.
        
        Al darle a cerrar unicamente se cierra la ventana emergente. 
        
        Por todo lo demas, es igual que una ventana normal. Se puede configurar igual incluir otros componentes      
        
        */
        
        panel.setSize(ventanaEmergente.getWidth(), ventanaEmergente.getHeight());
        panel.setBackground(Color.green);  
        panel.setLayout(null);
        
        mensaje.setBounds(100, 100, 200, 50);
        mensaje.setText("Soy una ventana Emergente");
        mensaje.setBackground(Color.blue);
        mensaje.setOpaque(true);
        
        panel.add(mensaje);
        ventanaEmergente.add(panel);
        
    }
    
    
}
