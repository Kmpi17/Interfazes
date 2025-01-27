module com.example.plantillabien {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.plantillabien to javafx.fxml;
    exports com.example.plantillabien;
}