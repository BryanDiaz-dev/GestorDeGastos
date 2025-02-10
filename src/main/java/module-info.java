module org.nexum {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    exports com.nexum;
    exports com.nexum.controllers;
    opens com.nexum to javafx.fxml;
    opens com.nexum.controllers to javafx.fxml;


}
