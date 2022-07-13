package br.ufrn.imd.controller;

import br.ufrn.imd.model.News;

public class NewsController extends ManipuleData {


    News Noticia;

    @Override
    //salva na variavel dataUser, que representa o dado enviado pelo usuario
    public void saveData(News news) {
        this.dao.saveNewsUser(news);
        //salvar o texto enviado pelo usuario
    }

}
