module org.example.escapefinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.escapefinal to javafx.fxml;
    exports org.example.escapefinal;
}