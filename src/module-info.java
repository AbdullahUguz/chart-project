module ChartProject {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.xml;
    requires java.desktop;

    opens Chart;

    opens Main;
}