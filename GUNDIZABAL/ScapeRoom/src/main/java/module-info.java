module org.example.scaperoom {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.scaperoom to javafx.fxml;
    exports org.example.scaperoom;
}