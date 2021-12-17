package com.example.model;

import javafx.event.ActionEvent;

public class ControllerForPersonalAreaWindow {
    public void getRaiseRequests(ActionEvent actionEvent) {
        WindowLoader.loadWindow(Constants.Windows.raiseRequestsWindowName, Constants.Windows.raiseRequestsWindowPath);
    }
}
