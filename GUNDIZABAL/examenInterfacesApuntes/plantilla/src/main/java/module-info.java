module com.example.plantilla {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.plantilla to javafx.fxml;
    exports com.example.plantilla;
}