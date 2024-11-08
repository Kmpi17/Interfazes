/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author FP
 */


public class Ventana {
    JFrame frame=new JFrame();
    JPanel panel= new JPanel();
    JTextField cuadroTexto= new JTextField();
    JButton boton= new JButton();
    JLabel fondo = new JLabel();
    JTextArea area=new JTextArea();
    JButton botonArea=new JButton();
    public Ventana(){//constructor vacio para jframe
        frame.setVisible(true); //mostrar jframe
        frame.setSize(500,500); //setear tamaño
        frame.setResizable(true); //permitir o no ampliar
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // no hacer nada al darle a la x
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cierra al darle a la x
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // minimizar al darle a la x
        //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //elimina al darle a la x
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //poner pantalla completo
        frame.setLocation(0,0); //cambiar posicion inicial de la ventana
        frame.getContentPane().setBackground(Color.red); //para aceder al panel y 
        frame.setTitle("Lihuak");// para añadir un titulo
        Panel(); // llama al metodo panel
        Etiqueta();
        CajaTexto();
        Boton();
        etiquetaImagen();
        AreaTexto();
        botonArea();
        FondoPantalla();
        
    }   
        
    
    
    //Metodo para construit panel
    public void Panel(){
        panel.setBackground(Color.blue);// para cambiar el color del panel
        frame.add(panel); // AÑADIR PANEL SOBRE LA VENTANA
        //panel.setMaximumSize(new Dimension(500,500));//tamaño maximo del panel
       // panel.setMinimumSize(new Dimension(200,100));//       minimo
       //panel.setLayout(new FlowLayout());//alineamiento a la izquierda
       //panel.setLayout(new BorderLayout());//cinco zonas
       //panel.setLayout(new GridLayout());//una cuadricula
       //panel.setLayout(new GridBagLayout());//
      // panel.setLayout(new BoxLayout(panel, 0));//alineamiento a la izquierda
       panel.setLayout(null); // Desactiva el layout por defecto
    }
    
    public void Etiqueta(){
        JLabel etiqueta= new JLabel();
        
        etiqueta.setBounds(50, 50, 100, 50); //coordenadas y,x y dimensiones
        panel.add(etiqueta);
        etiqueta.setText("Lihuak");
        etiqueta.setOpaque(true); //Para que la etiqueta no sea transparente
        etiqueta.setForeground(Color.white); //para cambiar color del texto
        etiqueta.setBackground(Color.gray); // para cambiar el fondo 
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("Camara",Font.BOLD,20));
    }
    
    
    public void CajaTexto(){
        cuadroTexto.setBounds(50, 120, 100, 50);
        panel.add(cuadroTexto);
        cuadroTexto.setForeground(Color.red);
        cuadroTexto.setBackground(Color.darkGray);
        cuadroTexto.setFont(new Font("Symbol",Font.BOLD,20));
    }
    
    public void Boton(){
        panel.add(boton);
        boton.setBounds(50, 190, 290, 50);
        boton.setText("TOCAME");
        boton.setBackground(Color.white);
        boton.setFont(new Font("Arial",Font.BOLD,10));
        JLabel respuesta = new JLabel();
        panel.add(respuesta);
       
        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               respuesta.setOpaque(true);
               respuesta.setBounds(50, 250, 290, 50);
               respuesta.setText("ERDIABLO");
               respuesta.setBackground(Color.red);
              ImageIcon imagen=new ImageIcon("C:\\Users\\FP\\Documents\\NetBeansProjects\\T1interfaces\\img\\berserk.jpeg");
               boton.setIcon(imagen);
               
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        };
                
                boton.addActionListener(pulsar);
    }
    
    public void etiquetaImagen(){
        ImageIcon imagen=new ImageIcon("C:\\Users\\FP\\Documents\\NetBeansProjects\\T1interfaces\\img\\berserk.jpeg");
        JLabel etiquetaImagen = new JLabel();
        etiquetaImagen.setBounds(800, 500, 500, 500);
        
        // para cambiar el tamaño de la imagen
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiquetaImagen);
        panel.updateUI();
    }

    
    public void FondoPantalla(){
       
          ImageIcon imagen=new ImageIcon("C:\\Users\\FP\\Documents\\NetBeansProjects\\T1interfaces\\img\\berserk.jpeg");
        JLabel fondo = new JLabel();
        
       fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH)));
      
      
        panel.add(fondo);
        
    }
    
    public void AreaTexto(){
        area.setBounds(500, 500, 100, 100);
        area.setVisible(true);
        panel.add(area);
        area.setBackground(Color.red);
       
    }
    
    public void botonArea(){
        panel.add(botonArea);
       
        botonArea.setVisible(true);
        botonArea.setBounds(600, 600, 100, 100);
        botonArea.setText("Recoger");
        String texto="";
        
        ActionListener copiar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String texto=area.getText();
                
                System.out.println("La frase copiade es "+"\n"+texto);
            }
            
        };
        botonArea.addActionListener(copiar);
    }
    
    
}
