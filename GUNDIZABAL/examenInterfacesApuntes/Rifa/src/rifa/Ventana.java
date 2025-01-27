/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author gonza
 */
public class Ventana {
    //Background. Base de la ventana
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel fondo = new JLabel();
    JLabel titulo = new JLabel();
    
    //Elementos para introducir numeros
    JLabel n1 = new JLabel();
    JLabel n2 = new JLabel();
    JLabel n3 = new JLabel();
    JLabel n4 = new JLabel();
    JLabel n5 = new JLabel();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    
    JLabel resultados = new JLabel();
    
    //botones
    JButton botonAleatorio = new JButton();
    JButton botonManual = new JButton();
    JButton botonStart = new JButton();
    
    //Objeto donde ocurre el juego.
    Juego juego = new Juego();
    
    public Ventana(){
        frame.setTitle("Rifa");
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        
        panel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        panel.setLayout(null);
        
        
        CrearEtiquetas();
        CrearFondo();
        
        
        frame.add(panel);
        panel.updateUI();
    }
    
    public void CrearFondo(){
        ImageIcon imagenFondo = new ImageIcon("Imagenes/fondo.jpg");
        fondo.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        fondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_DEFAULT)));
        
        titulo.setBounds(235, 20, 120, 60);
        titulo.setBackground(Color.orange);
        titulo.setText("Rifa");
        titulo.setFont(new Font("Algerian", Font.BOLD, 40));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setOpaque(true);
        
        panel.add(titulo);
        panel.add(fondo);
        
        BotonAleatorio();
        BotonManual();
        BotonStart();
    }
    
    public void CrearEtiquetas(){
        
        n1.setBounds(50, 100, 40, 40);
        n1.setText("N1");
        n1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        n1.setHorizontalAlignment(SwingConstants.CENTER);
        n1.setOpaque(true);
        n1.setBackground(Color.PINK);
        t1.setBounds(100, 100, 40, 40);
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setHorizontalAlignment(SwingConstants.CENTER);
        
        n2.setBounds(150, 100, 40, 40);
        n2.setText("N2");
        n2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        n2.setHorizontalAlignment(SwingConstants.CENTER);
        n2.setOpaque(true);
        n2.setBackground(Color.PINK);
        t2.setBounds(200, 100, 40, 40);
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setHorizontalAlignment(SwingConstants.CENTER);
        
        n3.setBounds(250, 100, 40, 40);
        n3.setText("N3");
        n3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        n3.setHorizontalAlignment(SwingConstants.CENTER);
        n3.setOpaque(true);
        n3.setBackground(Color.PINK);
        t3.setBounds(300, 100, 40, 40);
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setHorizontalAlignment(SwingConstants.CENTER);
        
        n4.setBounds(350, 100, 40, 40);
        n4.setText("N4");
        n4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        n4.setHorizontalAlignment(SwingConstants.CENTER);
        n4.setOpaque(true);
        n4.setBackground(Color.PINK);
        t4.setBounds(400, 100, 40, 40);
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setHorizontalAlignment(SwingConstants.CENTER);
        
        n5.setBounds(450, 100, 40, 40);
        n5.setText("N5");
        n5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        n5.setHorizontalAlignment(SwingConstants.CENTER);
        n5.setOpaque(true);
        n5.setBackground(Color.PINK);
        t5.setBounds(500, 100, 40, 40);
        t5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t5.setHorizontalAlignment(SwingConstants.CENTER);
       
        
        resultados.setBounds(50, 250, 490, 50);
        resultados.setOpaque(true);
        resultados.setBackground(Color.white);
        resultados.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
        
        panel.add(n1);
        panel.add(t1);
        panel.add(n2);
        panel.add(t2);
        panel.add(n3);
        panel.add(t3);
        panel.add(n4);
        panel.add(t4);
        panel.add(n5);
        panel.add(t5);
        
        panel.add(resultados);
    }
    
    public void BotonAleatorio(){
        botonAleatorio.setBounds(50, 150, 160, 80);
        botonAleatorio.setText("Aleatorio");
        botonAleatorio.setFont(new Font("Times New Roman", Font.BOLD, 24));
        
        ActionListener aleatorio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juego.CrearJugador("Jugador Aleatorio");
                //juego.MostrarResultados();
            }
        };
        botonAleatorio.addActionListener(aleatorio);
        
        panel.add(botonAleatorio);
    } 
    
    public void BotonManual(){
        botonManual.setBounds(220, 150, 160, 80);
        botonManual.setText("Introducir");
        botonManual.setFont(new Font("Times New Roman", Font.BOLD, 24));
        
        ActionListener manual = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] numeros = new int[5];
                
                //Para leer los numeros de los cuadros de texyo y convertirlos de String a int
                numeros[0] = Integer.parseInt(t1.getText());
                numeros[1] = Integer.parseInt(t2.getText());
                numeros[2] = Integer.parseInt(t3.getText());
                numeros[3] = Integer.parseInt(t4.getText());
                numeros[4] = Integer.parseInt(t5.getText());
                
                juego.IntroducirJugador("JugadorManual", numeros);
                //juego.MostrarResultados();
            }
        };
        botonManual.addActionListener(manual);
             
        panel.add(botonManual);
    }
    
    public void BotonStart(){
        botonStart.setBounds(400, 150, 120, 80);
        botonStart.setText("Start");
        botonStart.setFont(new Font("Times New Roman", Font.BOLD, 24));
        
        
        
        
        ActionListener start = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juego.CrearJugadores();
                juego.jugar();
                
                resultados.setText(juego.MostrarJugador());
                juego.MostrarResultados();
                
                panel.updateUI();
            }
        };
        
        botonStart.addActionListener(start);
        
        panel.add(botonStart);
    }
    
}
