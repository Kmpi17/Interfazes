
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class MenuJugar {
    
    JFrame frameJugar=new JFrame();
    JPanel panelJugar=new JPanel();
    JButton botonJugar=new JButton();
    JLabel fondo = new JLabel();
    
    
    
    public void MenuJugar(){
        frameJugar.setVisible(true);
        frameJugar.setSize(1200, 800);
        frameJugar.setResizable(false);
        frameJugar.setLocationRelativeTo(null);
        
        panelJugar();
        botonJugar();
        fondo();
        
    }
    
    public void panelJugar(){
        frameJugar.add(panelJugar);
   
       panelJugar.setLayout(null);
    }
    
    public void botonJugar(){
        panelJugar.add(botonJugar);
        botonJugar.setBounds(500, 300, 150, 75);
        botonJugar.setText("JUGAR");
        botonJugar.setFont(new Font("Arial",Font.BOLD,15));
        botonJugar.setBackground(Color.white);
        
        ActionListener pulsar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                Ventana ventanaPrincipal=new Ventana();
                ventanaPrincipal.Ventana();
               
            }
            
        };
        botonJugar.addActionListener(pulsar);
    }
    
    public void fondo(){
        ImageIcon imagen=new ImageIcon("img\\rifa.jpg");
        JLabel fondo = new JLabel();
     
            fondo.setSize(panelJugar.getWidth(), panelJugar.getHeight());
    
    
    Image imagenEscalada = imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
    fondo.setIcon(new ImageIcon(imagenEscalada));
     panelJugar.add(fondo);
     panelJugar.repaint();
     panelJugar.revalidate();
    }
    
    
    
}
