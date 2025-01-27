
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswing2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author FP
 */
public class Ventana {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    
    JRadioButton opcion1 = new JRadioButton();
    JRadioButton opcion2 = new JRadioButton();
    JRadioButton opcion3 = new JRadioButton();
    ButtonGroup grupo = new ButtonGroup();
    
    JCheckBox check1 = new JCheckBox();
    JCheckBox check2 = new JCheckBox();
    
    JComboBox<String> combo;
    
    public Ventana(){
        frame.setVisible(true);        
        frame.setTitle("Java Swing2");   //Para añadir un titulo a la ventana
        frame.setBounds(200, 200, 500, 500);    //Para elegir el tamaño de la ventana
        frame.setResizable(false);   //Para permitir (o no) que se cambie el tamaño de ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //Cierra el programa darle a la X (por defecto)
        
        panel.setSize(frame.getWidth(), frame.getHeight());
        panel.setBackground(Color.LIGHT_GRAY);  
        panel.setLayout(null);
        frame.add(panel);
        
        IniciarComponentes();
        panel.updateUI();
    }
    
    public void IniciarComponentes(){
        Radio();
        Check();
        ComboBox();
        BotonElegir();
    }
    
    public void Radio(){
        opcion1.setBounds(50, 50, 100, 30);
        opcion1.setText("Opcion 1");
        opcion2.setBounds(50, 80, 100, 30);
        opcion2.setText("Opcion 2");
        opcion3.setBounds(50, 110, 100, 30);
        opcion3.setText("Opcion 3");
        
        grupo.add(opcion1);
        grupo.add(opcion2);
        grupo.add(opcion3);
        
        
        
        panel.add(opcion1);
        panel.add(opcion2);
        panel.add(opcion3);
    }
    
    public void Check(){
        check1.setBounds(50, 150, 100, 30);
        check1.setText("Check 1");
        check1.setBackground(Color.white);
        check2.setBounds(50, 190, 100, 30);
        check2.setText("Check 2");
        check2.setBackground(Color.white);
        
        panel.add(check1);
        panel.add(check2);
    }
    
    public void ComboBox(){
        String[] paises = {"Elige un Pais", "España", "Portugal", "Francia", "Andorra", "Marruecos", "Sahara"};
        combo = new JComboBox<>(paises);
        combo.setBounds(50, 230, 100, 30);       
        
        panel.add(combo);
    }
    
    public void BotonElegir(){
        JButton boton = new JButton("Mostrar");  //Al poner un string construyo el boton con el nombre.
        boton.setBounds(50, 270, 100, 40);
        boton.setBackground(Color.yellow);
        
        JTextArea area = new JTextArea();
        area.setBounds(170, 50, 230, 260);
        area.setEditable(false);    //Para que no se pueda escribir en el area de texto. 
        
        ActionListener seleccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (opcion1.isSelected()) {
                    area.append("Ha seleccionado la opcion 1\n");
                    JOptionPane.showMessageDialog(frame, "Error 404");  //Objeto tipo option pane para mensajes emergentes
                    /*
                    Sobre JOptionPane
                    
                    Sirve para mostrar mensajes y que no continue el programa hasta que se acepte.
                    
                    Hay que elegir un componente para centrarlo. 
                    
                    */
                }
                if (opcion2.isSelected()) {
                    area.append("Ha seleccionado la opcion 2\n");
                    VentanaEmergente ventanaEmergente = new VentanaEmergente();
                }
                if (opcion3.isSelected()) {
                    area.append("Ha seleccionado la opcion 3\n");
                }
                if (check1.isSelected()) {
                    area.append("Ha seleccionado el check 1\n");
                }
                if (check2.isSelected()) {
                    area.append("Ha seleccionado el check 2\n");
                }
                
                if (!combo.getSelectedItem().equals("Elige un Pais")) {
                    area.append((String)combo.getSelectedItem()+"\n");
                    
                    if (combo.getSelectedItem().equals("España")) {
                        VentanaDos ventana2 = new VentanaDos();
                    }
                    
                }
                              
            }
        };
        
        boton.addActionListener(seleccion);
        panel.add(area);
        panel.add(boton);
    }
    
    
    
}
