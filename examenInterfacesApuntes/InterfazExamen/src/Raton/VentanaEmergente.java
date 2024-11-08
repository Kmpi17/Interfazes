/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raton;

import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class VentanaEmergente {
    JDialog ventanaEmergente = new JDialog();
    JPanel panel=new JPanel();
    
    
    public VentanaEmergente(){
        ventanaEmergente.setBounds(0, 0, 1000, 1000);
        ventanaEmergente.setVisible(true);
        ventanaEmergente.setResizable(false);
        ventanaEmergente.setLocationRelativeTo(null);
        ventanaEmergente.setTitle("Ventana");
        ventanaEmergente.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
    }
}
