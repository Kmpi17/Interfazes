/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author usuario
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JRadioButton opcion1 = new JRadioButton();
    JRadioButton opcion2 = new JRadioButton();
    ButtonGroup grupo1 = new ButtonGroup();
    JButton botonEnviar = new JButton();
    JCheckBox check1 = new JCheckBox();
    JCheckBox check2 = new JCheckBox();
    JComboBox<String> combo;

    public Ventana() {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(600, 600, 600, 800);
        frame.add(panel);
        panel.setBounds(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight());
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setBackground(Color.red);

        radioButton();
        texto();
        boton();
        checkBox();
        comboBox();
    }

    public void texto() {
        label.setBounds(50, 50, 200, 200);
        label.setBackground(Color.gray);
        label.setFocusable(true);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setOpaque(true);
        label.setText("A");
        label.addMouseListener(raton);
        panel.add(label);
    }

    public void radioButton() {
        opcion1.setBounds(50, 300, 150, 50);
        opcion1.setText("Goku");
        opcion2.setBounds(50, 350, 150, 50);
        opcion2.setText("Kakarot");
        grupo1.add(opcion1);
        grupo1.add(opcion2);

        panel.add(opcion1);
        panel.add(opcion2);

    }

    public void boton() {
        botonEnviar.setBounds(450, 600, 100, 50);
        botonEnviar.setText("ENVIAR");
        botonEnviar.setVisible(true);

        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionRadio();
            }

        };
        botonEnviar.addActionListener(pulsar);
        panel.add(botonEnviar);
    }

    public void checkBox() {
        check1.setBounds(50, 400, 200, 50);
        check1.setText("skdksdjkdsj");
        check2.setBounds(50, 450, 200, 50);
        check2.setText("DIOS");
        panel.add(check1);
        panel.add(check2);
    }

    public void comboBox() {
        String [] pen={"Roto","No roto","Simbiosis"};
            combo=new JComboBox<>(pen);
        combo.setBounds(100, 550, 100, 50);
        panel.add(combo);
    }

    MouseListener raton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            label.setText(" GORDO");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            label.setText(" PEQUEÑO");

        }

    };

    public void seleccionRadio() {

        if (opcion1.isSelected()) {
            label.setText("PU");
        } else {
            label.setText("SIGMA");
        }
        
        if (combo.getSelectedItem().equals("Fimosis")) {
            JOptionPane.showMessageDialog(frame, "JODER Q ASCO");
            
        }
    }
}
