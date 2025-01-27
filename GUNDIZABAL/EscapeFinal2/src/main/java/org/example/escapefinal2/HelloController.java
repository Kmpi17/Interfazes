package org.example.escapefinal2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button botonInicio;

    @FXML
    private TextField textoNombre;


    @FXML
    private void onBotonInicioClicked() throws IOException {
        String nombre = textoNombre.getText();

        if (nombre != null && !nombre.trim().isEmpty()) {
            // Si el nombre no está vacío, abrir la nueva ventana

            // Cargar la nueva escena desde el archivo FXML de menu.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/escapefinal2/menu.fxml"));
            AnchorPane root = loader.load();
            Scene nuevaEscena = new Scene(root);

            // Obtener la ventana (Stage) actual
            Stage stage = (Stage) botonInicio.getScene().getWindow();

            // Cambiar la escena de la ventana actual a la nueva
            stage.setScene(nuevaEscena);

            // Mostrar la nueva escena
            stage.show();
        } else {
            // Si el nombre está vacío, podríamos mostrar un mensaje (opcional)
            System.out.println("Por favor ingresa un nombre.");
        }
    }
}

