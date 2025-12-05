package br.senai.sp.jandira.projetoEstacionamento;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();              //Criando o Vbox (Alinhamento dos itens na vertical)
        Scene scene = new Scene(root);       //Criando a cena que recebe como parametro o root
        root.setStyle("-fx-background-color: #F0D49B;");  //Cor de fundo do root (Próximo de um laranja)


        //Definir o tamanho da tela
        stage.setHeight(1000);
        stage.setWidth(1000);



        //Configurar o header da tela
        VBox header = new VBox();
        header.setStyle("-fx-padding: 10;-fx-background-color: beige");
        Label titulo = new Label("Gerenciamento de estacionamento");
        titulo.setStyle("-fx-text-fill: black;-fx-font-size: 30;-fx-font-weight: bold;");
        titulo.setAlignment(Pos.CENTER);         //Alinhar o header no centro
        titulo.setMaxWidth(Double.MAX_VALUE);    //Necessário determinar a largura do header para o alinhamento
        header.getChildren().add(titulo);

        //Configurar o main
        VBox listaDeVeiculos = new VBox();
        listaDeVeiculos.setStyle("-fx-padding: 10;-fx-background-color: blue");
        listaDeVeiculos.setPrefWidth(500);
        listaDeVeiculos.setPrefHeight(1000);
        VBox botoes = new VBox();
        botoes.setStyle("-fx-padding: 10;-fx-background-color: pink");
        botoes.setPrefWidth(500);
        botoes.setPrefHeight(1000);
        HBox main = new HBox();
        main.getChildren().addAll(listaDeVeiculos, botoes);







        root.getChildren().addAll(header, main);
        stage.setTitle("Estacionamento");
        stage.setScene(scene);
        stage.show();
    }
}
