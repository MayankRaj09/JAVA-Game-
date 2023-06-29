package com.internshala.javafxapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class MyMain extends Application {

    public static void main(String[] args) {
        System.out.println("Main");
        launch(args);

    }

    public void init() throws Exception{

        System.out.println("init");
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Start");

        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("app_layout.fxml"));
        VBox rootNode = loader.load();

       // MenuBar menubar=createMenu();
       // rootNode.getChildren().add(0,menubar);

        Scene scene = new Scene(rootNode);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Temperature Converter Tool");
        primaryStage.setResizable(true);
        primaryStage.show();


    }

    private MenuBar createMenu(){

        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem= new MenuItem("New");
        newMenuItem.setOnAction(event -> System.out.println("New Menu Item Clicked"));

        SeparatorMenuItem seperator=new SeparatorMenuItem();
        MenuItem quitMenuItem= new MenuItem("Quit");
        quitMenuItem.setOnAction(event -> {
            Platform.exit();
            System.exit(0);
        });

        fileMenu.getItems().addAll(newMenuItem,seperator,quitMenuItem);

        Menu helpMenu = new Menu("Help");
        MenuItem aboutApp= new MenuItem("About");
        aboutApp.setOnAction(event -> aboutApp());
        helpMenu.getItems().addAll(aboutApp);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,helpMenu);
        return menuBar;


    }

    private void aboutApp() {
        //To Do
        Alert alertDialog = new Alert(Alert.AlertType.INFORMATION);
        alertDialog.setTitle("My First Desktop App");
        alertDialog.setHeaderText("Learning JavaFX");
        alertDialog.setContentText("Hello Everuone");
        ButtonType yes = new ButtonType("Yes");
        ButtonType no = new ButtonType("No");
        alertDialog.getButtonTypes().addAll(yes,no);

        Optional<ButtonType> clickedButton = alertDialog.showAndWait();

        if(clickedButton.isPresent()&& clickedButton.get()==yes){

            System.out.println("Yes Button Clicked");
        }
        else{
            System.out.println("No Button Clicked");
        }

    }

    public void stop() throws Exception{

        System.out.println("Stop");
        super.stop();
    }
}
