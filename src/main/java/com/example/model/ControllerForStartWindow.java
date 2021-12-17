package com.example.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerForStartWindow {
    @FXML
    public void moveToLogIn(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.logInWindowName, Constants.Windows.logInWindowPath);
    }

    @FXML
    public void moveToRegistration(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.registrationWindowName, Constants.Windows.registrationWindowPath);
    }
}