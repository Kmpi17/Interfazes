/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswing2;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author FP
 */
public class VentanaDos {
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel mensaje = new JLabel("Nivel desbloqueado");
    
    public VentanaDos(){
        frame.setVisible(true);        
        frame.setTitle("Java Swing2");   //Para añadir un titulo a la ventana
        frame.setBounds(200, 200, 300, 300);    //Para elegir el tamaño de la ventana
        frame.setResizable(false);   //Para permitir (o no) que se cambie el tamaño de ventana
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);           //Cierra el programa darle a la X (por defecto)
        
        panel.setSize(frame.getWidth(), frame.getHeight());
        panel.setBackground(Color.yellow);  
        panel.setLayout(null);
        
        mensaje.setBounds(100, 100, 200, 50);
        mensaje.setBackground(Color.red);
        mensaje.setOpaque(true);
        
        panel.add(mensaje);
        frame.add(panel);
        
    }
    
}
