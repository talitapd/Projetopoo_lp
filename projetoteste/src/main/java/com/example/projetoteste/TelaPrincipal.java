package com.example.projetoteste;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TelaPrincipal extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tela Principal");

        Button btnCadastro = new Button("Abrir Cadastro");
        btnCadastro.setOnAction(e -> abrirCadastro(primaryStage));

        StackPane root = new StackPane();
        root.getChildren().add(btnCadastro);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private void abrirCadastro(Stage primaryStage) {
        CadastroScene.mostrar(new Stage());
    }
}

