module Pixel8 {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;
    requires java.desktop;
    exports sample to javafx.fxml, javafx.graphics;
    exports code_generator to javafx.fxml, javafx.graphics;
    opens sample;
    opens code_generator;
}