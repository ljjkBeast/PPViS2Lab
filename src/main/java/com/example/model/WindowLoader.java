package com.example.model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowLoader {
    public static void loadWindow(String name, String path) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(StartWindow.class.getResource(path));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle(name);
        stage.setScene(scene);
        stage.show();
    }
}
