
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField j1 = new JTextField();
    JTextField j2 = new JTextField();
    JTextField j3 = new JTextField();
    JTextField j4 = new JTextField();
    JTextField j5 = new JTextField();
    JLabel numGanadores = new JLabel();
    JLabel labelBote = new JLabel();
    JButton botonAleatorio = new JButton();
    JButton botonElegir = new JButton();
    Juego juego1 = new Juego();

    public Ventana() {
        frame.setVisible(true);
        frame.setSize(550, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        panel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        panel.setLayout(null);
        panel.setBackground(Color.gray);
        panel.setVisible(true);

        frame.add(panel);

        introducirTexto();
        botonAleatorio();
        botonElegir();
        botonAleatorio();
        monstrarResutados();
        mostrarBote();
    }

    public void introducirTexto() {
        j1.setBounds(50, 50, 50, 50);
        j1.setVisible(true);

        j2.setBounds(150, 50, 50, 50);
        j2.setVisible(true);

        j3.setBounds(250, 50, 50, 50);
        j3.setVisible(true);

        j4.setBounds(350, 50, 50, 50);
        j4.setVisible(true);

        j5.setBounds(450, 50, 50, 50);
        j5.setVisible(true);

        panel.add(j1);
        panel.add(j2);
        panel.add(j3);
        panel.add(j4);
        panel.add(j5);
    }

    public void botonAleatorio() {

        botonAleatorio.setBounds(50, 200, 100, 50);
        botonAleatorio.setVisible(true);
        botonAleatorio.setText("ALEATORIO");

        ActionListener jugarAleatorio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int[] numerosAle = new int[5];
            int contador = 0;

            while (contador < 5) {
                int numAle = (int) (Math.random() * 99);
                boolean esDuplicado = false;

                // Verificar si el número ya está en el array
                for (int j = 0; j < contador; j++) {
                    if (numerosAle[j] == numAle) {
                        esDuplicado = true;
                        break;
                    }
                }

                // Si no es duplicado, lo añadimos al array
                if (!esDuplicado) {
                    numerosAle[contador] = numAle;
                    contador++;
                }
            }

            // Imprimir el contenido del array
            System.out.println(Arrays.toString(numerosAle));

            // Llamar al método jugar con los números generados
            int num1=numerosAle[0];
             int num2=numerosAle[1];
              int num3=numerosAle[2];
               int num4=numerosAle[3];
                int num5=numerosAle[4];
                System.out.println(num1);
            juego1.jugar(num1, num2, num3, num4, num5);
       
            }
        };

        botonAleatorio.addActionListener(jugarAleatorio);
        panel.add(botonAleatorio);
    }

    public void botonElegir() {
        botonElegir.setBounds(50, 100, 100, 50);
        botonElegir.setText("ELEGIR");
        botonElegir.setVisible(true);

        ActionListener jugar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num1 = Integer.parseInt(j1.getText());
                int num2 = Integer.parseInt(j2.getText());
                int num3 = Integer.parseInt(j3.getText());
                int num4 = Integer.parseInt(j4.getText());
                int num5 = Integer.parseInt(j5.getText());
                juego1.jugar(num1, num2, num3, num4, num5);
                numGanadores.setText(juego1.mostrarNumerosGanadores());
                labelBote.setText(juego1.mostrarBote());
            }

        };
        botonElegir.addActionListener(jugar);

        panel.add(botonElegir);
    }

    public void monstrarResutados() {
        numGanadores.setBounds(50, 300, 200, 150);

        panel.add(numGanadores);
    }

    public void mostrarBote() {
        labelBote.setBounds(50, 400, 200, 150);
        panel.add(labelBote);
    }

}
