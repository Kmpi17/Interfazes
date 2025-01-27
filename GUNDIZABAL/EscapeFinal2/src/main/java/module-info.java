module org.example.escapefinal2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.escapefinal2 to javafx.fxml;
    exports org.example.escapefinal2;
}