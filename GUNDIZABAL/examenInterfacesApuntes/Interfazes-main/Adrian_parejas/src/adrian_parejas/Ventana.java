/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_parejas;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.Timer;

/**
 *
 * @author FP
 */
public class Ventana {

    ImageIcon reverso = new ImageIcon("img\\reverso.jpg");
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel carta1 = new JLabel();
    JLabel carta2 = new JLabel();
    JLabel carta3 = new JLabel();
    JLabel carta4 = new JLabel();
    JLabel carta5 = new JLabel();
    JLabel carta6 = new JLabel();
    private JLabel cartaSelecionnada1 = null;
    private JLabel cartaSelecionnado2 = null;

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
    
        public void baraja() {
        // Configura las cartas
        configurarCarta(carta1, "arkham", 250, 50);
        configurarCarta(carta2, "joker", 800, 50);
        configurarCarta(carta3, "arkham", 1350, 50);
        configurarCarta(carta4, "joker", 250, 550);
        configurarCarta(carta5, "batman", 800, 550);
        configurarCarta(carta6, "batman", 1350, 550);
    }
    

    public void FondoPantalla() {

        ImageIcon imagen = new ImageIcon("img\\ghotam.jpg");
        JLabel fondo = new JLabel();
        fondo.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(fondo);
        panel.revalidate();
        panel.repaint();
    }
    private void configurarCarta(JLabel carta, String nombre, int x, int y) {
        carta.setBounds(x, y, 300, 450);
        carta.setVisible(true);
        carta.setBackground(Color.white);
        carta.setForeground(Color.white);
        carta.setIcon(new ImageIcon(reverso.getImage().getScaledInstance(carta.getWidth(), carta.getHeight(), Image.SCALE_SMOOTH)));
        carta.setName(nombre);
        carta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                manejarClick(carta);
            }
        });
        panel.add(carta);
    }

    private void manejarClick(JLabel cartaSeleccionada) {
        // Evita clics si ya hay dos cartas seleccionadas
        if (cartaSelecionnada1 != null && cartaSelecionnado2 != null) return;

        cartaSeleccionada.setIcon(cambiarImagen(cartaSeleccionada));

        if (cartaSelecionnada1 == null) {
            cartaSelecionnada1 = cartaSeleccionada;
        } else {
            cartaSelecionnado2 = cartaSeleccionada;

            if (cartaSelecionnada1.getName().equals(cartaSelecionnado2.getName())) {
                System.out.println("Las cartas son iguales!");
                cartaSelecionnada1 = null;
                cartaSelecionnado2 = null; 
            } else {
                System.out.println("Las cartas son diferentes!");
                Timer timer = new Timer(1000, e -> revertirCartas());
                timer.setRepeats(false);
                timer.start();
            }
        }
    }

    private void revertirCartas() {
        cartaSelecionnada1.setIcon(new ImageIcon(reverso.getImage().getScaledInstance(cartaSelecionnada1.getWidth(), cartaSelecionnada1.getHeight(), Image.SCALE_SMOOTH)));
        cartaSelecionnado2.setIcon(new ImageIcon(reverso.getImage().getScaledInstance(cartaSelecionnado2.getWidth(), cartaSelecionnado2.getHeight(), Image.SCALE_SMOOTH)));
        cartaSelecionnada1 = null;
        cartaSelecionnado2 = null;
    }

    private ImageIcon cambiarImagen(JLabel cartaSeleccionada) {
        ImageIcon iconoOriginal = null;

        if (cartaSeleccionada.getName().equals("arkham")) {
            iconoOriginal = new ImageIcon("img\\arkham.jpg");
        } else if (cartaSeleccionada.getName().equals("joker")) {
            iconoOriginal = new ImageIcon("img\\joker.jpg");
        }else if(cartaSeleccionada.getName().equals("batman")){
             iconoOriginal = new ImageIcon("img\\batman.jpg");
        }

        if (iconoOriginal != null) {
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(cartaSeleccionada.getWidth(), cartaSeleccionada.getHeight(), Image.SCALE_SMOOTH);
            return new ImageIcon(imagenEscalada);
        }

        return null;
    }

}
