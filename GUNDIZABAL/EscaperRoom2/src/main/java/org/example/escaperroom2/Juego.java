package org.example.escaperroom2;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Juego {


    int contador=0;
    int intentos=0;
    @javafx.fxml.FXML
    private Button botonIUno;
    @javafx.fxml.FXML
    private Button botonIDos;
    @javafx.fxml.FXML
    private Button botonITres;

    @FXML
    private AnchorPane panel1;
    @FXML
    private AnchorPane panel2;
    @FXML
    private AnchorPane panel3;

    private Stage ventana2Stage;
    @FXML
    private Pane panelOculto;
    @FXML
    private Label textoAcierto;
    @FXML
    private TextField textoAcertijo;
    @FXML
    private Label textoPista;
    @FXML
    private TextField respuestaCifrado;
    @FXML
    private Button botonCifrado;
    @FXML
    private Button botonSalir;

    @FXML
    private void mostrarSala1() {
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);


    }

    @FXML
    private void mostrarSala2() {
        panel1.setVisible(false);
        panel2.setVisible(true);
        panel3.setVisible(false);


    }

    @FXML
    private void mostrarSala3() throws IOException {
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        ventana2Stage = new Stage();
        ventana2Stage.setScene(scene);
        ventana2Stage.getIcons().add(new Image(Objects.requireNonNull(
                getClass().getResource("/img/icon.png")).toExternalForm()));
        ventana2Stage.setTitle("Abecedario");
        ventana2Stage.setX(600);
        ventana2Stage.setY(730);
        ventana2Stage.show();
    }

    @FXML
    public void mostrarPanel(Event event) {
        panelOculto.setStyle("-fx-background-color: gray;");
    }


    @FXML
    public void encuentraOculto(Event event) {
        contador+=1;
        botonIUno.setDisable(true);
        textoAcierto.setText("Caso I cerrado");

        if (contador==3){
            botonSalir.setVisible(true);
        }
    }

    @FXML
    public void adivinar(ActionEvent actionEvent) {


        String contestacion=textoAcertijo.getText().toUpperCase();
        if (contestacion.equals("MUERTE")){
            contador+=1;
            botonIDos.setDisable(true);
            textoAcierto.setText("Caso II cerrado");
            if (contador==3){
                botonSalir.setVisible(true);
            }
        }else{
            textoPista.setVisible(true);
            intentos+=1;
            if (intentos==1){
                textoPista.setText("No distingue de clases");
            } else if (intentos==2) {
                textoPista.setText("No tiene fecha");
            }else if (intentos==3) {
                textoPista.setText("Nadie puede escapar de ella");
            }
        }


    }


    @FXML
    public void comprobarCifrado(ActionEvent actionEvent) {
        String cifrado=respuestaCifrado.getText().trim().toLowerCase();
        if (cifrado.equals("intercambio de armas")){
            contador+=1;
            botonITres.setDisable(true);
            textoAcierto.setText("Caso III cerrado");
            if (contador==3){
                botonSalir.setVisible(true);
            }
        }

    }



    @FXML
    public void terminar(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage ventanaMenuStage = new Stage();
        ventanaMenuStage.setScene(scene);
        ventanaMenuStage.getIcons().add(new Image(Objects.requireNonNull(
                getClass().getResource("/img/icon.png")).toExternalForm()));
        ventanaMenuStage.setTitle("Menú Principal");
        ventanaMenuStage.show();
    }
}
