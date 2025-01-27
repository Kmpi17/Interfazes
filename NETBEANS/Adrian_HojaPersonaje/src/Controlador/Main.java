/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author FP
 */
public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
       
  
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Ventana.fxml"));
        Parent root = loader.load();
        stage.setTitle("Creacion de Personaje");
        stage.setScene(new Scene(root));
        stage.show();
        
     
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
