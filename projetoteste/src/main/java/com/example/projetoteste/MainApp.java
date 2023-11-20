package com.example.projetoteste;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Inicializa a cena de cadastro
        CadastroScene cadastroScene = new CadastroScene();
        cadastroScene.start(primaryStage);
    }
}
