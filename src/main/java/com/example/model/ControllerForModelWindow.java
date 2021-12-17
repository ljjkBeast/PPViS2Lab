package com.example.model;

import javafx.event.ActionEvent;

public class ControllerForModelWindow {
    public void moveToPersonalArea(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.personalAreaWindowName, Constants.Windows.personalAreaPath);
    }

    public void moveToSecretAnimals(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.addAnimalWindowName, Constants.Windows.addAnimalWindowPath);
    }

    public void moveToPublicAnimals(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.addAnimalWindowName, Constants.Windows.addAnimalWindowPath);
    }
}
