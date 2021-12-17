package com.example.model;

import javafx.event.ActionEvent;

public class ControllerForSelectedAnimalWindow {
    public void correctAnimal(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.correctAnimalWindowName, Constants.Windows.correctAnimalWindowPath);
    }

    public void rateArticle(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.rateArticleWindowName, Constants.Windows.rateArticleWindowPath);
    }

    public void moveToComments(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.commentsWindowName, Constants.Windows.commentsWindowPath);
    }
}
