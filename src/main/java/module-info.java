module com.fakenewsdetector.fakenews_detector {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires org.apache.commons.text;
    requires com.opencsv;

    opens br.ufrn.imd to javafx.fxml;
    exports br.ufrn.imd;
    exports br.ufrn.imd.controller;
    opens br.ufrn.imd.controller to javafx.fxml;
}