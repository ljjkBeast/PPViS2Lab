package com.example.model;

import javafx.event.ActionEvent;

public class ControllerForFoundedAnimalsWindow {
    public void moveToSelectedAnimal(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.selectedAnimalWindowName, Constants.Windows.selectedAnimalWindowPath);
    }
}
