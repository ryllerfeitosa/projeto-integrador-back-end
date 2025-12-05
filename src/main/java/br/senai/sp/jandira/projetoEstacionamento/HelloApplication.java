package br.senai.sp.jandira.projetoEstacionamento;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();              //Criando o Vbox (Alinhamento dos itens na vertical)
        Scene scene = new Scene(root);       //Criando a cena que recebe como parametro o root

        //Definir o tamanho da tela
        stage.setHeight(1000);
        stage.setWidth(1000);


        //Configurar o header da tela
        VBox header = new VBox();
        header.setStyle("-fx-padding: 10;-fx-background-color: beige");
        Label titulo = new Label("Gerenciamento de estacionamento");
        titulo.setStyle("-fx-text-fill: black;-fx-font-size: 30;-fx-font-weight: bold;");
        titulo.setAlignment(Pos.CENTER);
        titulo.setMaxWidth(Double.MAX_VALUE);






        header.getChildren().add(titulo);
        root.getChildren().add(header);
        stage.setTitle("Estacionamento");
        stage.setScene(scene);
        stage.show();
    }
}
