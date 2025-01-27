
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Ventana {
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    JButton botonGenerar=new JButton();
    JButton botonElegir=new JButton();
    JButton botonAleatorio=new JButton();
    JTextField cuadroTextoElegir=new JTextField();
    JLabel textoElegir=new JLabel();
    JLabel textoGenerar=new JLabel();
    JLabel fondo=new JLabel();
    JLabel textoNumeroG=new JLabel();
    JLabel textoPremio=new JLabel();
    JLabel textoNumeroElegido=new JLabel();
    JLabel textoGanaPremio=new JLabel(); 
    Juego j1=new Juego();
    
    public void Ventana(){
        frame.setVisible(true);
        frame.setSize(1200, 800);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
              
        panel();
        textoElegir();
        cuadroTextElegir();
        botonElegir();
        botonAleatorio();
        textoGenerar();
        botonGenerar();
        textoNumeroG();
        textoGanaPremio();
        textoNumeroElegido();
        
        Fondo();
     
        
    
    }
    
    public void panel(){
        frame.add(panel);
        panel.setLayout(null);
    }
 
 
    
   
    public void Fondo(){
        ImageIcon imagen=new ImageIcon("img\\fondoPrincipal.jpg");
        JLabel fondo = new JLabel();
        
        fondo.setBounds(0, 0, 1200, 800); 
        
     
        Image imagenEscalada = imagen.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
        fondo.setIcon(new ImageIcon(imagenEscalada));
        panel.add(fondo);
        panel.revalidate();
        panel.repaint();
    }
    
    public void textoElegir() {
         
        textoElegir.setText("Si quieres un número concreto, elige en el siguiente formato: #,#,#,#,#");
        textoElegir.setBounds(50, 75, 350, 50); 
        textoElegir.setFont(new Font("Arial", Font.BOLD, 10));
        panel.add(textoElegir);
     
    }
    
    public void botonElegir(){
        panel.add(botonElegir);
        botonElegir.setBounds(50, 235, 100, 50);
        botonElegir.setText("ELEGIR");
        botonElegir.setFont(new Font("Arial",Font.BOLD,15));
        botonElegir.setForeground(Color.white);
        botonElegir.setBackground(Color.CYAN);
        
        ActionListener pulsarElegir=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                  
            }
            
        };
        
        botonElegir.addActionListener(pulsarElegir);
    }
    
      public void botonAleatorio(){
        panel.add(botonAleatorio);
        botonAleatorio.setBounds(50, 320, 120, 50);
        botonAleatorio.setText("ALEATORIO");
        botonAleatorio.setFont(new Font("Arial",Font.BOLD,15));
        botonAleatorio.setForeground(Color.white);
        botonAleatorio.setBackground(Color.CYAN);
        
        ActionListener pulsarAleatorio=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            String numeroGenerado=j1.generarNumerosAleatorios();
            textoNumeroElegido.setText("TU NUMERO ES: "+numeroGenerado);
                   
            }
        };
        
        botonAleatorio.addActionListener(pulsarAleatorio);
    }
    
    
    
          
             
           public void cuadroTextElegir(){
            panel.add(cuadroTextoElegir);
            cuadroTextoElegir.setBounds(50, 135, 150, 75);
            cuadroTextoElegir.setFont(new Font("Arial",Font.BOLD,15));
            panel.revalidate();
            panel.repaint();
        }
      
             
            public void textoGenerar(){
            panel.add(textoGenerar);
            textoGenerar.setText("Pulsa para generar nuevos numeros premiados");
            textoGenerar.setBounds(800, 75, 350, 50);
            textoElegir.setFont(new Font("Arial", Font.BOLD, 10));
        }
            
            
          
         public void botonGenerar(){
            panel.add(botonGenerar);
            botonGenerar.setBounds(900, 150, 100, 50);
            botonGenerar.setText("GENERAR");
            botonGenerar.setFont(new Font("Arial",Font.BOLD,13));
            botonGenerar.setForeground(Color.white);
            botonGenerar.setBackground(Color.CYAN);
        
            ActionListener pulsarGenerar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            j1.generarNumeroGanador();
            String numeroGanadorStr = j1.mostarNumeroGanador();
            j1.generarJugadores();
            j1.elegirNumero(cuadroTextoElegir); 
            j1.compararNumeros();
            textoNumeroG.setText("NÚMERO GANADOR: " + numeroGanadorStr);
            String gananciasTexto = j1.CalcularGanacias();
            textoGanaPremio.setText("TE HAS LLEVADO: " + gananciasTexto + "$");

            panel.revalidate();
            panel.repaint();
                   
            }
            
        };
        
        botonGenerar.addActionListener(pulsarGenerar);
        
    }
         
         public void textoNumeroG(){
             panel.add(textoNumeroG);
             textoNumeroG.setText("PREMIO");
             textoNumeroG.setFont(new Font("Arial",Font.BOLD,25));
             textoNumeroG.setBounds(300, 300, 600, 400);
             textoNumeroG.setBackground(Color.LIGHT_GRAY);
             textoNumeroG.setOpaque(true);
             textoNumeroG.setHorizontalAlignment(SwingConstants.CENTER);
             textoNumeroG.setVerticalAlignment(SwingConstants.CENTER);
             
         }
         
         public void textoNumeroElegido(){
             panel.add(textoNumeroElegido);
             textoNumeroElegido.setFont(new Font("Arial",Font.BOLD,13));
             textoNumeroElegido.setBounds(500, 235, 200, 50);
             textoNumeroElegido.setHorizontalAlignment(SwingConstants.CENTER);
             textoNumeroElegido.setVerticalAlignment(SwingConstants.CENTER);
         }
         
         
         public void textoGanaPremio(){
             panel.add(textoGanaPremio);
             textoGanaPremio.setText("TE HAS LLEVADO ");
             textoGanaPremio.setFont(new Font("Arial",Font.BOLD,15));
             textoGanaPremio.setBounds(10, 450, 250, 50);
             textoGanaPremio.setHorizontalAlignment(SwingConstants.CENTER);
             textoGanaPremio.setVerticalAlignment(SwingConstants.CENTER);
         }
    
}
