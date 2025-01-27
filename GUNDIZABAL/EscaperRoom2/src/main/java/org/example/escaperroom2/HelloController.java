package org.example.escaperroom2;

import javafx.event.ActionEvent;
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
    private Button botonInicar;
    @FXML
    private TextField textoNombre;


    @FXML
    public void iniciar(ActionEvent actionEvent) throws IOException {
        String nombre = textoNombre.getText().trim();

        if (nombre.isEmpty()) {

            System.out.println("Por favor, ingrese un nombre.");
            return;
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/escaperroom2/juego.fxml"));
        Scene nuevaEscena = new Scene(loader.load());

        Stage stage = (Stage) botonInicar.getScene().getWindow();

        stage.setScene(nuevaEscena);

        stage.show();

    }
}
