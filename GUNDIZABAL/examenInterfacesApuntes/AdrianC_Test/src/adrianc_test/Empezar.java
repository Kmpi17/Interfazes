/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrianc_test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Empezar {

    JFrame frameEmpezar = new JFrame();
    JPanel panelEmpezar = new JPanel();
    JButton botonEmpezar = new JButton();
    JLabel fondo = new JLabel();

    public void MenuJugar() {
        frameEmpezar.setVisible(true);
        frameEmpezar.setSize(1200, 800);
        frameEmpezar.setResizable(false);
        frameEmpezar.setLocationRelativeTo(null);

        panelEmpezar();
        botonEmpezar();
        fondo();

    }

    public void panelEmpezar() {
        frameEmpezar.add(panelEmpezar);

        panelEmpezar.setLayout(null);
    }

    public void botonEmpezar() {
        panelEmpezar.add(botonEmpezar);
        botonEmpezar.setBounds(500, 300, 150, 75);
        botonEmpezar.setText("EMPEZAR");
        botonEmpezar.setFont(new Font("Arial", Font.BOLD, 15));
        botonEmpezar.setBackground(Color.white);

        ActionListener pulsar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Examen ventanaExamen = new Examen(Empezar.this);
                ventanaExamen.Examen();
            }
        };
        botonEmpezar.addActionListener(pulsar);
    }

    public void fondo() {
        ImageIcon imagen = new ImageIcon("img\\aula.jpg");
        JLabel fondo = new JLabel();

        fondo.setSize(panelEmpezar.getWidth(), panelEmpezar.getHeight());

        Image imagenEscalada = imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
        fondo.setIcon(new ImageIcon(imagenEscalada));
        panelEmpezar.add(fondo);
        panelEmpezar.repaint();
        panelEmpezar.revalidate();
    }

    public void mostrarPuntuacion(int puntuacion) {
        JOptionPane.showMessageDialog(frameEmpezar, "Tu puntuación es: " + puntuacion);
    }
}
