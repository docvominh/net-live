module com.vominh.app.netlive {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires eu.hansolo.tilesfx;
    requires eu.hansolo.fx.countries;
    requires eu.hansolo.fx.heatmap;
    requires eu.hansolo.toolbox;
    requires eu.hansolo.toolboxfx;

    opens com.vominh.app.netlive to javafx.fxml;
    exports com.vominh.app.netlive;
}