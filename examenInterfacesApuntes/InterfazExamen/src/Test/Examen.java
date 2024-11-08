/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Raton.VentanaEmergente;
import java.awt.Color;
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

/**
 *
 * @author usuario
 */
public class Examen {
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JRadioButton j1 = new JRadioButton();
    JRadioButton j2 = new JRadioButton();
    ButtonGroup grupo1 = new ButtonGroup();
    JButton botonComprobar = new JButton();
    JCheckBox box1 = new JCheckBox();
    JCheckBox box2 = new JCheckBox();
    JComboBox<String> combo;
    
    public Examen() {
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(300, 300, 600, 800);
        frame.setLocationRelativeTo(null);
        
        frame.add(panel);
        panel.setVisible(true);
        panel.setLayout(null);
        panel.setBounds(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight());
        panel.setBackground(Color.gray);
        
        conjuntoBotones();
        checkBox();
        botonEnviar();
        combo();
        
    }
    
    public void botonEnviar() {
        botonComprobar.setBounds(450, 550, 100, 50);
        botonComprobar.setText("Comprobar");
        botonComprobar.setVisible(true);
        
        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comprobar();
            }
            
        };
        
        botonComprobar.addActionListener(pulsar);
        panel.add(botonComprobar);
    }
    
    public void conjuntoBotones() {
        j1.setBounds(50, 50, 100, 100);
        j1.setText("Harlem");
        j2.setBounds(50, 150, 100, 100);
        j2.setText("Spartans");
        grupo1.add(j1);
        grupo1.add(j2);
        
        panel.add(j1);
        panel.add(j2);
    }
    
    public void checkBox() {
        box1.setBounds(50, 250, 100, 100);
        box1.setText("Ostia");
        box2.setBounds(50, 350, 100, 100);
        box2.setText("Joder");
        
        panel.add(box1);
        panel.add(box2);
        
    }
    
    public void combo() {
        String[] paises = {"España", "Camboya", "Guinea", "UK", "USA"};
        combo = new JComboBox<>(paises);
        combo.setBounds(100, 550, 100, 100);
        panel.add(combo);
    }
    
    public void comprobar() {
        if (j2.isSelected()) {
            j2.setForeground(Color.green);
        }
        if (j1.isSelected()) {
            j1.setForeground(Color.red);
        }
        if (box1.isSelected() || box2.isSelected()) {
            box1.setForeground(Color.blue);
            box2.setForeground(Color.blue);
            int result = JOptionPane.showConfirmDialog(frame, "HO DIOS MIO", "Confirmar Accion", JOptionPane.YES_OPTION);
            
            if (result == JOptionPane.YES_OPTION) {
                panel.setBackground(Color.blue);
            }
            if (result == JOptionPane.NO_OPTION) {
                panel.setBackground(Color.red);
            }
            if (combo.getSelectedItem().equals("España")) {
                VentanaEmergente ve1=new VentanaEmergente();
                
            }
        }
        
    }
    
}
