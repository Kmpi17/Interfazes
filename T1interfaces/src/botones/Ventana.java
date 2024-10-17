/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author FP
 */
public class Ventana {
      JFrame frame=new JFrame();
    JPanel panel= new JPanel();
    JRadioButton radio=new JRadioButton();
    JComboBox combo=new JComboBox();
    JButton botonE=new JButton();
 
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
        Combo();
        
    
       
}
    
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
    
    public void Radio(){
        panel.add(radio);
        
    }
    
    public void Check(){
        
    }
    
    public void Combo(){
        String [] paises={"España","Sahara","USA","Marruecos"};
        combo=new JComboBox<>(paises);
        combo.setBounds(500, 500, 150, 50);
        
        
        panel.add(combo);
    }
    
    public void botonEligir(){
        botonE.setText("Elegir");
        botonE.setBounds(500, 675, 100, 50);

        
        JTextArea texto=new JTextArea();
        texto.setBounds(500, 800, 100, 100);
        texto.setBackground(Color.red);
        texto.setEditable(false);
        ActionListener seleccion=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           
            }
            
        };
                botonE.addActionListener(seleccion);
                panel.add(botonE);
                panel.add(texto);
    }
}
