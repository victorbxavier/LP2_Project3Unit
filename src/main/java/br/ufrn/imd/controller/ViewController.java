package br.ufrn.imd.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ViewController {

    public Button BtnSubmit;
    public Slider SliderLimiar;
    @FXML
    private DatePicker txtData;

    @FXML
    private TextField txtNoticia;
    @FXML
    private TextField txtLink;

    @FXML
    private Slider btnLimiar;

    @FXML
    private Button btnSubmit;

    //Segunda View
    @FXML
    private Label labelNoticia;

    @FXML
    private Label labelPorcentagem;

    @FXML
    private Label labelLimiar;


    @FXML
    public void onBtnSubmit(ActionEvent actionEvent) {
        String txt = txtNoticia.getText();
        labelNoticia.setText(txt);

        String data = txtData.getPromptText();

        String link = txtLink.getText();
    }
}