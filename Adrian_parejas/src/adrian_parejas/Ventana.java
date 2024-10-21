/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_parejas;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel carta1 = new JLabel();
    JLabel carta2 = new JLabel();

    public Ventana() {//constructor vacio para jframe
        frame.setVisible(true); //mostrar jframe
        frame.setSize(500, 500); //setear tamaño
        frame.setResizable(true); //permitir o no ampliar

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //poner pantalla completo
        frame.setLocation(0, 0); //cambiar posicion inicial de la ventana
        frame.getContentPane().setBackground(Color.red); //para aceder al panel y 
        frame.setTitle("Lihuak");// para añadir un titulo

        Panel(); // llama al metodo panel

        baraja();
        FondoPantalla();

    }

    public void Panel() {

        frame.add(panel); // añadir panel sobre la ventana
        panel.setLayout(null); // desactiva el layout por defecto

    }

    public void FondoPantalla() {

        ImageIcon imagen = new ImageIcon("img\\ghotam.jpg");
        JLabel fondo = new JLabel();

        // Establecer el tamaño del JLabel de fondo
        fondo.setBounds(0, 0, panel.getWidth(), panel.getHeight());

        // Asignar la imagen al JLabel de fondo
        fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH)));

        // Añadir el JLabel de fondo al panel
        panel.add(fondo);

        // Asegúrate de que el panel se repinte
        panel.revalidate();
        panel.repaint();
    }

    public void baraja() {

        carta1.setBounds(250, 100, 300, 400);
        carta1.setVisible(true);
        carta1.setBackground(Color.white);
        carta1.setForeground(Color.white);
        panel.add(carta1);
        ImageIcon reverso = new ImageIcon("img\\reverso.jpg");
        carta1.setIcon(new ImageIcon(reverso.getImage().getScaledInstance(carta1.getWidth(), carta1.getHeight(), Image.SCALE_SMOOTH)));

        carta2.setBounds(800, 100, 300, 400);
        carta2.setVisible(true);
        carta2.setBackground(Color.white);
        carta2.setForeground(Color.white);
        panel.add(carta2);
        ImageIcon reverso2 = new ImageIcon("img\\reverso.jpg");
        carta2.setIcon(new ImageIcon(reverso2.getImage().getScaledInstance(carta2.getWidth(), carta2.getHeight(), Image.SCALE_SMOOTH)));
    }

}
