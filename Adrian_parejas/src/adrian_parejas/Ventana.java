/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_parejas;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
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

    ArrayList<Cartas> baraja = new ArrayList<Cartas>();

    public Ventana() {//constructor vacio para jframe
        frame.setVisible(true); //mostrar jframe
        frame.setSize(500, 500); //setear tamaño
        frame.setResizable(true); //permitir o no ampliar

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //poner pantalla completo
        frame.setLocation(0, 0); //cambiar posicion inicial de la ventana
        frame.getContentPane().setBackground(Color.red); //para aceder al panel y 
        frame.setTitle("Lihuak");// para añadir un titulo
        Panel(); // llama al metodo panel
        crearBaraja();

    }

    public void Panel() {
        panel.setBackground(Color.blue);// para cambiar el color del panel
        frame.add(panel); // AÑADIR PANEL SOBRE LA VENTANA

        panel.setLayout(null); // Desactiva el layout por defecto
    }

    public void crearBaraja() {
        for (int i = 0; i < 5; i++) {
            if (i < 2) {
                baraja.add(new Cartas(i, "/imagenes/reverso.jpg", ""));
            }
            if (i > 1 && i < 4) {
                baraja.add(new Cartas(i, "/imagenes/reverso.jpg", ""));
            }
            if (i > 3) {
                baraja.add(new Cartas(i, "/imagenes/reverso.jpg", ""));
            }
        }

        JLabel carta1 = new JLabel();
        JLabel carta2 = new JLabel();
        int[] arrayNumeros = new int[6];

        for (int i = 0; i < arrayNumeros.length; i++) {

            ImageIcon imagen = new ImageIcon(baraja.get(numA).cara);
            carta1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(carta1.getWidth(), carta1.getHeight(), Image.SCALE_DEFAULT)));

        }

        carta1.setBounds(40, 40, 100, 150);

        carta1.setOpaque(true);
        panel.add(carta1);

    }
}
