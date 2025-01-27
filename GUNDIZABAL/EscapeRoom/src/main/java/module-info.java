module org.example.escaperoom {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.escaperoom to javafx.fxml;
    exports org.example.escaperoom;
}