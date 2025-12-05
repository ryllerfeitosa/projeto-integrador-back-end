package br.senai.sp.jandira.projetoEstacionamento;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        //Determinando o tamanho da Vbox listaDeVeículos
        listaDeVeiculos.setPrefWidth(500);
        listaDeVeiculos.setPrefHeight(1000);

        VBox vboxDosBotoes = new VBox();
        vboxDosBotoes.setStyle("-fx-padding: 10;-fx-background-color: pink");

        //Determinando o tamanho da Vbox vboxDosBotoes
        vboxDosBotoes.setPrefWidth(500);
        vboxDosBotoes.setPrefHeight(1000);

        //Criar Hbox para alinhar a Vbox listaDeVeiculos e vboxDosBotoes na horizontal
        HBox main = new HBox();
        main.getChildren().addAll(listaDeVeiculos, vboxDosBotoes);

        //Criar os botoes
        VBox boxbotoes = new VBox();
        boxbotoes.setPadding(new Insets(0, 20, 20, 20));
        boxbotoes.setSpacing(10);

        //Botao de cadastro
        Button cadastrar = new Button("Cadastro de veículos");
        cadastrar.setOnAction(click -> {
            System.out.println("Nova tela para cadastrar veículos");
        });

        //Botao de registro de saida/pagamento
        Button registrarSaida = new Button("Saída/Pagamento");
        registrarSaida.setOnAction(click -> {
            System.out.println("Nova tela para confirmar o pagamento e a saída");

        });

        //Botao para fechar o sistema
        Button sair = new Button("Sair");
        sair.setOnAction(click -> {
            System.out.println("Nova tela para sair");

        });

        vboxDosBotoes.getChildren().addAll(cadastrar, registrarSaida, sair);    //Adicionando os botoes na vBoxDosBotoes






        root.getChildren().addAll(header, main);
        stage.setTitle("Estacionamento");
        stage.setScene(scene);
        stage.show();
    }
}
