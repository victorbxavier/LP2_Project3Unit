package br.ufrn.imd.controller;

import br.ufrn.imd.dao.NewsDao;
import br.ufrn.imd.model.News;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.beans.value.ChangeListener;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class ViewController extends ManipuleData {

    public Button BtnSubmit;
    public Slider SliderLimiar  = new Slider();
    @FXML
    private DatePicker txtData;

    @FXML
    private TextField txtNoticia;
    @FXML
    private TextField txtLink;


    @FXML
    private Button btnSubmit;
    private int limiar;

    @FXML
    private Label labelLimiar;

    @FXML
    private Spinner<Integer> spinner;

    @FXML
    private Label resultado;


    @FXML
    public void onBtnSubmit(ActionEvent actionEvent) {
        NewsDao dao = NewsDao.getInstance();
        List<String> info = new ArrayList<>();
        String txt = txtNoticia.getText();;

        limiar = spinner.getValue();

        String newId = Integer.toString(dao.findAllNews().size());

        info.add(newId);
        info.add(txt);
        info.add("");

        saveData(this.buildDataToNews(info));

        double result = this.testSimilarity(dao.getDataUser().getText_format(), limiar)*10;
        System.out.println(result);
        labelLimiar.setText("Resultado: "+ String.format("%.2f", result));
        if(result>=limiar){
            resultado.setText("É fake news!");
        }else{
            resultado.setText("Não é fake news!");
        }

    }


    @Override
    public void saveData(News news) {
        dao.saveNewsUser(news);
    }


}