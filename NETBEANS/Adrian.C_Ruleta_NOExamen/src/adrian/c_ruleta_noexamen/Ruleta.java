/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adrian.c_ruleta_noexamen;

import javax.swing.JOptionPane;

/**
 *
 * @author FP
 */
public class Ruleta extends javax.swing.JFrame {

    private int dinero;

    public Ruleta() {
        initComponents();
    

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        labelDinero = new javax.swing.JLabel();
        botonRojo = new javax.swing.JRadioButton();
        botonNegro = new javax.swing.JRadioButton();
        botonVerde = new javax.swing.JRadioButton();
        botonInstrucciones = new javax.swing.JButton();
        botonComprar = new javax.swing.JButton();
        numeroSelecionado = new javax.swing.JLabel();
        botonApostar = new javax.swing.JButton();
        textoDineroApostado = new javax.swing.JTextField();
        checkBoxApostar = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelDinero1 = new javax.swing.JLabel();
        botonRojo1 = new javax.swing.JRadioButton();
        botonNegro1 = new javax.swing.JRadioButton();
        botonVerde1 = new javax.swing.JRadioButton();
        botonInstrucciones1 = new javax.swing.JButton();
        botonComprar1 = new javax.swing.JButton();
        numeroSelecionado1 = new javax.swing.JLabel();
        botonApostar1 = new javax.swing.JButton();
        textoDineroApostado1 = new javax.swing.JTextField();
        checkBoxApostar1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        jLabel1.setText("DINERO :");

        jLabel3.setText("jLabel3");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        labelDinero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDinero.setText("DINERO");
        jPanel2.add(labelDinero);

        botonRojo.setBackground(new java.awt.Color(255, 0, 0));
        botonRojo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRojo.setText("ROJO(pares)");
        botonRojo.setOpaque(true);
        jPanel2.add(botonRojo);

        botonNegro.setBackground(new java.awt.Color(0, 0, 0));
        botonNegro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonNegro.setText("NEGRO(impares)");
        jPanel2.add(botonNegro);

        botonVerde.setBackground(new java.awt.Color(51, 204, 0));
        botonVerde.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonVerde.setText("VERDE(0)");
        jPanel2.add(botonVerde);

        botonInstrucciones.setBackground(new java.awt.Color(51, 51, 51));
        botonInstrucciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonInstrucciones.setText("INSTRUCCIONES");
        botonInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInstruccionesActionPerformed(evt);
            }
        });
        jPanel2.add(botonInstrucciones);

        botonComprar.setBackground(new java.awt.Color(51, 51, 51));
        botonComprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonComprar.setText("COMPRAR FICHAS");
        botonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarActionPerformed(evt);
            }
        });
        jPanel2.add(botonComprar);

        numeroSelecionado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numeroSelecionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroSelecionado.setText("jLabel4");
        jPanel2.add(numeroSelecionado);

        botonApostar.setBackground(new java.awt.Color(51, 51, 51));
        botonApostar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonApostar.setText("APOSTAR");
        botonApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonApostarActionPerformed(evt);
            }
        });
        jPanel2.add(botonApostar);

        textoDineroApostado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel2.add(textoDineroApostado);

        checkBoxApostar.setText("Seguro de apostar");
        checkBoxApostar.setActionCommand("");
        jPanel2.add(checkBoxApostar);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruleta1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("CASINO MAFIA");
        jPanel1.add(jLabel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDinero1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDinero1.setText("DINERO : 0");
        jPanel3.add(labelDinero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 43));

        botonRojo1.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(botonRojo1);
        botonRojo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRojo1.setText("ROJO(pares)");
        botonRojo1.setOpaque(true);
        jPanel3.add(botonRojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 147, -1));

        botonNegro1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(botonNegro1);
        botonNegro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonNegro1.setForeground(new java.awt.Color(255, 255, 255));
        botonNegro1.setText("NEGRO(impares)");
        botonNegro1.setOpaque(true);
        jPanel3.add(botonNegro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        botonVerde1.setBackground(new java.awt.Color(51, 204, 0));
        buttonGroup1.add(botonVerde1);
        botonVerde1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonVerde1.setText("VERDE(0)");
        botonVerde1.setOpaque(true);
        jPanel3.add(botonVerde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 117, -1));

        botonInstrucciones1.setBackground(new java.awt.Color(51, 51, 51));
        botonInstrucciones1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonInstrucciones1.setText("INSTRUCCIONES");
        botonInstrucciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInstrucciones1ActionPerformed(evt);
            }
        });
        jPanel3.add(botonInstrucciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 157, 46));

        botonComprar1.setBackground(new java.awt.Color(51, 51, 51));
        botonComprar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonComprar1.setText("COMPRAR FICHAS");
        botonComprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprar1ActionPerformed(evt);
            }
        });
        jPanel3.add(botonComprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 49));

        numeroSelecionado1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numeroSelecionado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroSelecionado1.setText("NUMERO");
        jPanel3.add(numeroSelecionado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 167, -1));

        botonApostar1.setBackground(new java.awt.Color(51, 51, 51));
        botonApostar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonApostar1.setText("APOSTAR");
        botonApostar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonApostar1ActionPerformed(evt);
            }
        });
        jPanel3.add(botonApostar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 167, 46));

        textoDineroApostado1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel3.add(textoDineroApostado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 167, 94));

        checkBoxApostar1.setText("Seguro de apostar");
        checkBoxApostar1.setActionCommand("");
        jPanel3.add(checkBoxApostar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruleta1.jpg"))); // NOI18N
        jPanel4.add(jLabel5);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -10, 1160, 680));

        botonSalir.setBackground(new java.awt.Color(51, 51, 51));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel3.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 170, 40));

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonApostarActionPerformed


    }//GEN-LAST:event_botonApostarActionPerformed

    private void botonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarActionPerformed

    }//GEN-LAST:event_botonComprarActionPerformed

    private void botonInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInstruccionesActionPerformed

    }//GEN-LAST:event_botonInstruccionesActionPerformed

    private void botonInstrucciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInstrucciones1ActionPerformed
        Instrucciones pi = new Instrucciones(this, true);
        pi.setVisible(true);
    }//GEN-LAST:event_botonInstrucciones1ActionPerformed

    private void botonComprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprar1ActionPerformed
        ComprarFichas cf = new ComprarFichas(this, true);
        cf.setVisible(true);
        dinero = cf.getDinero();
        labelDinero1.setText("DINERO: " + dinero);
    }//GEN-LAST:event_botonComprar1ActionPerformed

    private void botonApostar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonApostar1ActionPerformed
        int dineroApostado = Integer.parseInt(textoDineroApostado1.getText());
        System.out.println(dineroApostado);
        int dineroActual = dinero;
        if (checkBoxApostar1.isSelected()) {
            jugarRuleta(dineroApostado);
        }
    }//GEN-LAST:event_botonApostar1ActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres salir con este dinero: " + dinero + "?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (salir == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_botonSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ruleta().setVisible(true);
            }
        });
    }

    private void jugarRuleta(int dineroApostado) {
      
   
        int numeroElegido = (int) (Math.random() * 37);
        if (numeroElegido == 0) {
            if (botonVerde1.isSelected()) {
                System.out.println("Boton verde");
                dinero += dineroApostado * 35;
            } else {
                dinero -= dineroApostado;
            }
        } else if (numeroElegido % 2 == 0) {
            if (botonRojo1.isSelected()) {
                System.out.println("Boton rojo");
                dinero += dineroApostado;
            } else {
                dinero -= dineroApostado;
            }
        } else {
            if (botonNegro1.isSelected()) {
                System.out.println("Boton negro");
                dinero += dineroApostado;
            } else {
                dinero -= dineroApostado;
            }
        }
        labelDinero1.setText("DINERO: " + dinero);
        numeroSelecionado1.setText("" + numeroElegido);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonApostar;
    private javax.swing.JButton botonApostar1;
    private javax.swing.JButton botonComprar;
    private javax.swing.JButton botonComprar1;
    private javax.swing.JButton botonInstrucciones;
    private javax.swing.JButton botonInstrucciones1;
    private javax.swing.JRadioButton botonNegro;
    private javax.swing.JRadioButton botonNegro1;
    private javax.swing.JRadioButton botonRojo;
    private javax.swing.JRadioButton botonRojo1;
    private javax.swing.JButton botonSalir;
    private javax.swing.JRadioButton botonVerde;
    private javax.swing.JRadioButton botonVerde1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBoxApostar;
    private javax.swing.JCheckBox checkBoxApostar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelDinero;
    private javax.swing.JLabel labelDinero1;
    private javax.swing.JLabel numeroSelecionado;
    private javax.swing.JLabel numeroSelecionado1;
    private javax.swing.JTextField textoDineroApostado;
    private javax.swing.JTextField textoDineroApostado1;
    // End of variables declaration//GEN-END:variables
}
