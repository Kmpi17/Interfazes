/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrianc_test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author usuario
 */
public class Examen {

    private int bien;
    private Empezar empezar;

    public Examen(Empezar empezar) {
        this.empezar = empezar;
    }

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel pregunta1 = new JLabel();
    JLabel pregunta2 = new JLabel();
    JLabel pregunta3 = new JLabel();
    JLabel pregunta4 = new JLabel();
    JLabel pregunta5 = new JLabel();
    JLabel pregunta6 = new JLabel();
    JLabel pregunta7 = new JLabel();
    JLabel pregunta8 = new JLabel();
    JLabel pregunta9 = new JLabel();
    JLabel pregunta10 = new JLabel();

    JLabel numero1 = new JLabel();
    JLabel numero2 = new JLabel();
    JLabel numero3 = new JLabel();
    JLabel numero4 = new JLabel();
    JLabel numero5 = new JLabel();
    JLabel numero6 = new JLabel();
    JLabel numero7 = new JLabel();
    JLabel numero8 = new JLabel();
    JLabel numero9 = new JLabel();
    JLabel numero10 = new JLabel();

    JRadioButton opcion1_1 = new JRadioButton();
    JRadioButton opcion2_1 = new JRadioButton();
    JRadioButton opcion3_1 = new JRadioButton();
    ButtonGroup grupo1 = new ButtonGroup();

    JRadioButton opcion1_2 = new JRadioButton();
    JRadioButton opcion2_2 = new JRadioButton();
    JRadioButton opcion3_2 = new JRadioButton();
    ButtonGroup grupo2 = new ButtonGroup();

    JRadioButton opcion1_3 = new JRadioButton();
    JRadioButton opcion2_3 = new JRadioButton();
    JRadioButton opcion3_3 = new JRadioButton();
    ButtonGroup grupo3 = new ButtonGroup();

    JRadioButton opcion1_4 = new JRadioButton();
    JRadioButton opcion2_4 = new JRadioButton();
    JRadioButton opcion3_4 = new JRadioButton();
    ButtonGroup grupo4 = new ButtonGroup();

    JRadioButton opcion1_5 = new JRadioButton();
    JRadioButton opcion2_5 = new JRadioButton();
    JRadioButton opcion3_5 = new JRadioButton();
    ButtonGroup grupo5 = new ButtonGroup();

    JRadioButton opcion1_6 = new JRadioButton();
    JRadioButton opcion2_6 = new JRadioButton();
    JRadioButton opcion3_6 = new JRadioButton();
    ButtonGroup grupo6 = new ButtonGroup();

    JRadioButton opcion1_7 = new JRadioButton();
    JRadioButton opcion2_7 = new JRadioButton();
    JRadioButton opcion3_7 = new JRadioButton();
    ButtonGroup grupo7 = new ButtonGroup();

    JRadioButton opcion1_8 = new JRadioButton();
    JRadioButton opcion2_8 = new JRadioButton();
    JRadioButton opcion3_8 = new JRadioButton();
    ButtonGroup grupo8 = new ButtonGroup();

    JRadioButton opcion1_10 = new JRadioButton();
    JRadioButton opcion2_10 = new JRadioButton();
    JRadioButton opcion3_10 = new JRadioButton();
    ButtonGroup grupo10 = new ButtonGroup();

    JRadioButton opcion1_9 = new JRadioButton();
    JRadioButton opcion2_9 = new JRadioButton();
    JRadioButton opcion3_9 = new JRadioButton();
    ButtonGroup grupo9 = new ButtonGroup();

    JButton botonEnviar = new JButton();

    public void Examen() {

        frame.setVisible(true);
        frame.setSize(1000, 1080);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        Numeros();
        Preguntas();
        botonEnviar();
        checkearEnvio();
        Radio1();
        Radio2();
        Radio3();
        Radio4();
        Radio5();
        Radio6();
        Radio7();
        Radio8();
        Radio9();
        Radio10();

        Panel();
    }

    public void Panel() {
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.gray);
    }

    public void Numeros() {
        numero1.setText("1");
        numero1.setBounds(50, 45, 300, 10);
        numero1.setFont(new Font("Arial", Font.BOLD, 15));
        numero1.setForeground(Color.green);
        panel.add(numero1);

        numero2.setText("2");
        numero2.setBounds(50, 245, 300, 10);
        numero2.setFont(new Font("Arial", Font.BOLD, 15));
        numero2.setForeground(Color.green);
        panel.add(numero2);

        numero3.setText("3");
        numero3.setBounds(50, 445, 300, 10);
        numero3.setFont(new Font("Arial", Font.BOLD, 15));
        numero3.setForeground(Color.green);
        panel.add(numero3);

        numero4.setText("4");
        numero4.setBounds(50, 645, 300, 10);
        numero4.setFont(new Font("Arial", Font.BOLD, 15));
        numero4.setForeground(Color.green);
        panel.add(numero4);

        numero5.setText("5");
        numero5.setBounds(50, 845, 300, 10);
        numero5.setFont(new Font("Arial", Font.BOLD, 15));
        numero5.setForeground(Color.green);
        panel.add(numero5);

        numero6.setText("6");
        numero6.setBounds(450, 45, 300, 10);
        numero6.setFont(new Font("Arial", Font.BOLD, 15));
        numero6.setForeground(Color.green);
        panel.add(numero6);

        numero7.setText("7");
        numero7.setBounds(450, 245, 300, 10);
        numero7.setFont(new Font("Arial", Font.BOLD, 15));
        numero7.setForeground(Color.green);
        panel.add(numero7);

        numero8.setText("8");
        numero8.setBounds(450, 445, 300, 10);
        numero8.setFont(new Font("Arial", Font.BOLD, 15));
        numero8.setForeground(Color.green);
        panel.add(numero8);

        numero9.setText("9");
        numero9.setBounds(450, 645, 300, 10);
        numero9.setFont(new Font("Arial", Font.BOLD, 15));
        numero9.setForeground(Color.green);
        panel.add(numero9);

        numero10.setText("10");
        numero10.setBounds(450, 845, 300, 10);
        numero10.setFont(new Font("Arial", Font.BOLD, 15));
        numero10.setForeground(Color.green);
        panel.add(numero10);
    }

    public void Preguntas() {

        pregunta1.setText("¿Primero letra del abecedario?");
        pregunta1.setBounds(50, 50, 300, 50);
        pregunta1.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta1);

        pregunta2.setText("¿Pais mas envidioso?");
        pregunta2.setBounds(50, 250, 300, 50);
        pregunta2.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta2);

        pregunta3.setText("¿Quinto dia del mes?");
        pregunta3.setBounds(50, 450, 300, 50);
        pregunta3.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta3);

        pregunta4.setText("¿Cuando se creo el jamon?");
        pregunta4.setBounds(50, 650, 300, 50);
        pregunta4.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta4);

        pregunta5.setText("¿Año de la independencia de USA?");
        pregunta5.setBounds(50, 850, 300, 50);
        pregunta5.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta5);

        pregunta6.setText("¿Como se llama goku o kakaroto?");
        pregunta6.setBounds(450, 50, 300, 50);
        pregunta6.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta6);

        pregunta7.setText("¿cuanto es pi?");
        pregunta7.setBounds(450, 250, 300, 50);
        pregunta7.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta7);

        pregunta8.setText("¿Que es la hipertrofia??");
        pregunta8.setBounds(450, 450, 300, 50);
        pregunta8.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta8);

        pregunta9.setText("¿Cuantos anillos tiene Michael Jordan?");
        pregunta9.setBounds(450, 650, 300, 50);
        pregunta9.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta9);

        pregunta10.setText("¿?");
        pregunta10.setBounds(450, 850, 300, 50);
        pregunta10.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pregunta10);

    }

    public void Radio1() {
        opcion1_1.setBounds(50, 90, 200, 40);
        opcion1_1.setText("A");
        opcion2_1.setBounds(50, 120, 200, 40);
        opcion2_1.setText("W");
        opcion3_1.setBounds(50, 150, 200, 40);
        opcion3_1.setText("2");

        grupo1.add(opcion1_1);
        grupo1.add(opcion2_1);
        grupo1.add(opcion3_1);

        panel.add(opcion1_1);
        panel.add(opcion2_1);
        panel.add(opcion3_1);
    }

    public void Radio2() {
        opcion1_2.setBounds(50, 290, 200, 40);
        opcion1_2.setText("Francia");
        opcion2_2.setBounds(50, 320, 200, 40);
        opcion2_2.setText("Gabachos");
        opcion3_2.setBounds(50, 350, 200, 40);
        opcion3_2.setText("Gabachos e Ingleses");

        grupo1.add(opcion1_2);
        grupo1.add(opcion2_2);
        grupo1.add(opcion3_2);

        panel.add(opcion1_2);
        panel.add(opcion2_2);
        panel.add(opcion3_2);
    }

    public void Radio3() {
        opcion1_3.setBounds(50, 490, 200, 40);
        opcion1_3.setText("5");
        opcion2_3.setBounds(50, 520, 200, 40);
        opcion2_3.setText("Viernes");
        opcion3_3.setBounds(50, 550, 200, 40);
        opcion3_3.setText("Mayo");

        grupo3.add(opcion1_3);
        grupo3.add(opcion2_3);
        grupo3.add(opcion3_3);

        panel.add(opcion1_3);
        panel.add(opcion2_3);
        panel.add(opcion3_3);
    }

    public void Radio4() {
        opcion1_4.setBounds(50, 690, 200, 40);
        opcion1_4.setText("Antiguo Egipto");
        opcion2_4.setBounds(50, 720, 200, 40);
        opcion2_4.setText("Edad Media");
        opcion3_4.setBounds(50, 750, 200, 40);
        opcion3_4.setText("Siglo XVIII");

        grupo4.add(opcion1_4);
        grupo4.add(opcion2_4);
        grupo4.add(opcion3_4);

        panel.add(opcion1_4);
        panel.add(opcion2_4);
        panel.add(opcion3_4);
    }

    public void Radio5() {
        opcion1_5.setBounds(50, 890, 200, 40);
        opcion1_5.setText("1776");
        opcion2_5.setBounds(50, 920, 200, 40);
        opcion2_5.setText("1789");
        opcion3_5.setBounds(50, 950, 200, 40);
        opcion3_5.setText("1800");

        grupo5.add(opcion1_5);
        grupo5.add(opcion2_5);
        grupo5.add(opcion3_5);

        panel.add(opcion1_5);
        panel.add(opcion2_5);
        panel.add(opcion3_5);
    }

    public void Radio6() {
        opcion1_6.setBounds(450, 90, 200, 40);
        opcion1_6.setText("Goku");
        opcion2_6.setBounds(450, 120, 200, 40);
        opcion2_6.setText("Es lo mismo");
        opcion3_6.setBounds(450, 150, 200, 40);
        opcion3_6.setText("Piccolo");

        grupo6.add(opcion1_6);
        grupo6.add(opcion2_6);
        grupo6.add(opcion3_6);

        panel.add(opcion1_6);
        panel.add(opcion2_6);
        panel.add(opcion3_6);
    }

    public void Radio7() {
        opcion1_7.setBounds(450, 290, 200, 40);
        opcion1_7.setText("3.14");
        opcion2_7.setBounds(450, 320, 200, 40);
        opcion2_7.setText("Infinito");
        opcion3_7.setBounds(450, 350, 200, 40);
        opcion3_7.setText("3.14159");

        grupo7.add(opcion1_7);
        grupo7.add(opcion2_7);
        grupo7.add(opcion3_7);

        panel.add(opcion1_7);
        panel.add(opcion2_7);
        panel.add(opcion3_7);
    }

    public void Radio8() {
        opcion1_8.setBounds(450, 490, 200, 40);
        opcion1_8.setText("Aumento de tamaño muscular");
        opcion2_8.setBounds(450, 520, 200, 40);
        opcion2_8.setText("Pérdida de peso");
        opcion3_8.setBounds(450, 550, 200, 40);
        opcion3_8.setText("Aumento de resistencia");

        grupo8.add(opcion1_8);
        grupo8.add(opcion2_8);
        grupo8.add(opcion3_8);

        panel.add(opcion1_8);
        panel.add(opcion2_8);
        panel.add(opcion3_8);
    }

    public void Radio9() {
        opcion1_9.setBounds(450, 690, 200, 40);
        opcion1_9.setText("6");
        opcion2_9.setBounds(450, 720, 200, 40);
        opcion2_9.setText("5");
        opcion3_9.setBounds(450, 750, 200, 40);
        opcion3_9.setText("Más que lebron");

        grupo9.add(opcion1_9);
        grupo9.add(opcion2_9);
        grupo9.add(opcion3_9);

        panel.add(opcion1_9);
        panel.add(opcion2_9);
        panel.add(opcion3_9);
    }

    public void Radio10() {
        opcion1_10.setBounds(450, 890, 200, 40);
        opcion1_10.setText("?");
        opcion2_10.setBounds(450, 920, 200, 40);
        opcion2_10.setText("¿");
        opcion3_10.setBounds(450, 950, 200, 40);
        opcion3_10.setText("Coña");

        grupo10.add(opcion1_10);
        grupo10.add(opcion2_10);
        grupo10.add(opcion3_10);

        panel.add(opcion1_10);
        panel.add(opcion2_10);
        panel.add(opcion3_10);
    }

    public void botonEnviar() {
        panel.add(botonEnviar);
        botonEnviar.setText("ENVIAR");
        botonEnviar.setBounds(800, 950, 100, 50);
        botonEnviar.setBackground(Color.GREEN);
        botonEnviar.setForeground(Color.WHITE);
        botonEnviar.setFont(new Font("Arial", Font.BOLD, 15));

        ActionListener enviar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int respuesta = JOptionPane.showConfirmDialog(panel, "¿Seguro que quieres enviar el examen?",
                        "Confirmación de envío", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    verificarRespuestas();
                    JOptionPane.showMessageDialog(panel, "Examen enviado. ¡Gracias!");

                    frame.dispose();

                    empezar.mostrarPuntuacion(bien);
                } else {
                    JOptionPane.showMessageDialog(panel, "No se envió el examen.");
                }
            }
        };
        botonEnviar.addActionListener(enviar);
    }

    public void checkearEnvio() {
        JCheckBox confirmacion = new JCheckBox("Confirmo que quiero enviar el examen");
        panel.add(confirmacion);
        confirmacion.setBounds(800, 1000, 300, 30);
        confirmacion.setFont(new Font("Arial", Font.BOLD, 9));
        confirmacion.setBackground(Color.GRAY);

        confirmacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonEnviar.setEnabled(confirmacion.isSelected());
            }
        });
    }

    public void verificarRespuestas() {
        bien = 0;

        if (opcion1_1.isSelected()) {
            bien++;
        }

        if (opcion1_3.isSelected()) {
            bien++;
        }

        if (opcion1_3.isSelected()) {
            bien++;
        }

        if (opcion1_4.isSelected()) {
            bien++;
        }

        if (opcion1_5.isSelected()) {
            bien++;
        }

        if (opcion2_6.isSelected()) {
            bien++;
        }

        if (opcion3_7.isSelected()) {
            bien++;
        }

        if (opcion1_8.isSelected()) {
            bien++;
        }

        if (opcion3_9.isSelected()) {
            bien++;
        }

        if (opcion3_10.isSelected()) {
            bien++;
        }

    }
}
