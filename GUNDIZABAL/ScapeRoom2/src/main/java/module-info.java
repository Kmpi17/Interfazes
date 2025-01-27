module org.example.scaperoom2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.scaperoom2 to javafx.fxml;
    exports org.example.scaperoom2;
}