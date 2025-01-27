/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accionRaton;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
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
    JButton botonE = new JButton();
    JTextArea textarea=new JTextArea();
   
    
    public Ventana() {//constructor vacio para jframe
        frame.setVisible(true); //mostrar jframe
        frame.setSize(500, 500); //setear tamaño
        frame.setResizable(true); //permitir o no ampliar
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //poner pantalla completo
        frame.setLocation(0, 0); //cambiar posicion inicial de la ventana
        frame.getContentPane().setBackground(Color.red); //para aceder al panel y 
        frame.setTitle("Lihuak");// para añadir un titulo
        Panel(); // llama al metodo panel
        textArea();
    }

    public void Panel() {
        panel.setBackground(Color.blue);// para cambiar el color del panel
        frame.add(panel); // AÑADIR PANEL SOBRE LA VENTANA
        panel.setLayout(null); // Desactiva el layout por defecto
    }
    
    
    public void textArea(){
        panel.add(textarea);
        textarea.setVisible(true);
        textarea.setBounds(100, 100, 400, 500);
     
         textarea.addMouseListener(raton);
    }
    
   MouseListener raton=new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            textarea.append("aaaaaaaa"+"\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           textarea.append("entra"+"\n");
        }

        @Override
        public void mouseExited(MouseEvent e) {
          textarea.append("sale"+"\n");
        }
        
    };
    
    
}
