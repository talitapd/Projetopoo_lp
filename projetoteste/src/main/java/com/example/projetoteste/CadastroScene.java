package com.example.projetoteste;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CadastroScene extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cadastro de Usuário");

        TextField nomeField = new TextField();
        nomeField.setPromptText("Nome de usuário");

        TextField emailField = new TextField();
        emailField.setPromptText("Endereço de e-mail");

        TextField senhaField = new TextField();
        senhaField.setPromptText("Senha");

        Button btnCadastrar = new Button("Cadastrar");
        btnCadastrar.setOnAction(e -> cadastrarUsuario(nomeField.getText(), emailField.getText(), senhaField.getText()));

        VBox layout = new VBox(10);
        layout.getChildren().addAll(nomeField, emailField, senhaField, btnCadastrar);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void cadastrarUsuario(String nome, String email, String senha) {
        // Lógica para cadastrar o usuário no banco de dados
        Usuario usuario = new Usuario();
        boolean cadastradoComSucesso = usuario.fazerRegistro(email, senha, nome);

        if (cadastradoComSucesso) {
            System.out.println("Usuário cadastrado com sucesso!");
        } else {
            System.out.println("Falha ao cadastrar usuário. Verifique os dados e tente novamente.");
        }
    }

    public static void mostrar(Stage stage) {
        launch();
    }
}
