/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author FP
 */
public class Ventana {
    JFrame ventana=new JFrame();
    JPanel panel = new  JPanel();
    JButton botonAleatorio=new JButton();
    JButton botonGuardar=new JButton();
    JButton botonStart=new JButton();
    JLabel titulo= new JLabel();
    Juego juego= new Juego();
public Ventana(){
    
    ventana.setVisible(true);
    ventana.setResizable(false);
    ventana.setSize(500, 500);
    
    

    botonStart();
    Panel();
}

public void Panel(){
    panel.setBackground(Color.green);
    ventana.add(panel);
    
}

public void botonStart(){
    
}

}


