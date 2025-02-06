module org.example.gestordegastos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.gestordegastos to javafx.fxml;
    exports org.example.gestordegastos;
}