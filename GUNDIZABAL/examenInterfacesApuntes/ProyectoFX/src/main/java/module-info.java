module com.example.proyectofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectofx to javafx.fxml;
    exports com.example.proyectofx;
}