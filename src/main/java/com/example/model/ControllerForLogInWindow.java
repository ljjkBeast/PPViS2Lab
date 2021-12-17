package com.example.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerForLogInWindow {
    @FXML
    public void logIn(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.modelWindowName, Constants.Windows.modelWindowPath);
    }
}
