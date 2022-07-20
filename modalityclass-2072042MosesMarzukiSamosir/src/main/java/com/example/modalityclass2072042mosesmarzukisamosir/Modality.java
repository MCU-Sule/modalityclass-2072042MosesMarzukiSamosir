package com.example.modalityclass2072042mosesmarzukisamosir;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Modality extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Modality.class.getResource("first-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Modality-2072042-Moses Marzuki Samosir");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}