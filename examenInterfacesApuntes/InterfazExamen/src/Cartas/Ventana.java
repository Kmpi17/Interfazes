/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cartas;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel fondo = new JLabel();
    JLabel carta1 = new JLabel();
    JLabel carta2 = new JLabel();
    JLabel carta3 = new JLabel();
    ImageIcon reverso=new ImageIcon("img\\IMG_20211201_222153.jpg");
    int []  arryaNumeros ={};
    
    public Ventana() {
        frame.setLocationRelativeTo(null);
        frame.setBounds(0, 0, 1000, 800);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panel);

        panel.setBounds(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight());
        panel.setBackground(Color.gray);
        panel.setVisible(true);

        cartas();
        
        
       fondo();
    }

    public void fondo() {
        ImageIcon imagen = new ImageIcon("img\\IMG_20211201_222302.jpg");
        fondo.setBounds(panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight());

        Image imagenEscalada = imagen.getImage().getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
        fondo.setIcon(new ImageIcon(imagenEscalada));
        panel.add(fondo);

        panel.repaint();

    }

    public void cartas() {
       
        Image imagenEscalada=reverso.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        
        
        carta1.setBounds(100, 50, 200, 150);
        carta1.setBackground(Color.white);
        carta1.setName("carta1");
        carta1.setVisible(true);
        carta1.setOpaque(true);
        carta1.setIcon(new ImageIcon(imagenEscalada));
        
        carta2.setBounds(100, 350, 200, 150);
        carta2.setBackground(Color.white);
        carta2.setName("carta1");
        carta2.setVisible(true);
        carta2.setOpaque(true);
           carta2.setIcon(new ImageIcon(imagenEscalada));
        
        carta3.setBounds(100, 650, 200, 150);
        carta3.setBackground(Color.white);
        carta3.setName("carta1");
        carta3.setVisible(true);
        carta3.setOpaque(true);
        
           carta3.setIcon(new ImageIcon(imagenEscalada));
        
         
           
           MouseListener raton=new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
         
            }

            @Override
            public void mousePressed(MouseEvent e) {
              
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
            }
               
           };
             carta1.addMouseListener(raton);
             carta2.addMouseListener(raton);
             carta3.addMouseListener(raton);
             
             
        panel.add(carta1);
        panel.add(carta2);
        panel.add(carta3);
    }
    
    private void click(JLabel seleccionado){
        
        
    }
    
    
    private void darVuelta(JLabel seleccionado){
      
       
        for (int i = 0; i <3; i++) {
            int random=(int)Math.random()*3;
            for (int j = 0; j < ; j++) {
                
            }
            if (random==1) {
                ImageIcon imagenVuelta=new ImageIcon();
                 seleccionado.setIcon(reverso);
            }
        }
        
      
    }
    
}
