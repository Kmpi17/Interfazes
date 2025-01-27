module org.example.escaperroom2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.escaperroom2 to javafx.fxml;
    exports org.example.escaperroom2;
}