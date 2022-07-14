package br.ufrn.imd;

import br.ufrn.imd.controller.ImportDataCsv;
import com.opencsv.exceptions.CsvException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FakeNewsApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ImportDataCsv load = new ImportDataCsv();
        try {
            load.loadCSVData();
        }catch (CsvException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        FXMLLoader fxmlLoader = new FXMLLoader(FakeNewsApplication.class.getResource("fakenews-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        stage.setTitle("Detector de Fake News");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}