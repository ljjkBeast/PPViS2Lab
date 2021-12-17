package com.example.model;

import javafx.event.ActionEvent;

public class ControllerForAddWindow {
    public void addAminalWindow(ActionEvent actionEvent) {
        //WindowLoader.loadWindow(Constants.Windows.personalAreaWindowName, Constants.Windows.personalAreaPath);
    }

    public void findAnimalWindow(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.foundedAnimalsWindowName, Constants.Windows.foundedAnimalsWindowPath);
    }
}
