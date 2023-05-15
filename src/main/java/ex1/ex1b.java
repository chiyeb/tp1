package ex1;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ex1b extends Application {


    @Override
    public void start(Stage primaryStage) {
        //boutons sur le coté
        VBox leftbtns = new VBox();

        Label textBtn = new Label("Boutons : ");
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Bouton 3");
        leftbtns.getChildren().addAll(textBtn,btn1, btn2, btn3);
        leftbtns.setAlignment(Pos.CENTER_LEFT);
        leftbtns.setSpacing(10.0d);

        //Menu en haut
        VBox menuprin = new VBox();
        VBox.setMargin( menuprin, new Insets(10.0d) );
        Menu menu1 = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem openMenuItem = new MenuItem("Open");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem closeMenuItem= new MenuItem("Close");
        menu1.getItems().addAll(newMenuItem, openMenuItem, saveMenuItem, closeMenuItem);
        Menu menu2 = new Menu("Edit");
        MenuItem cutMenuItem = new MenuItem("Cut");
        MenuItem copyMenuItem = new MenuItem("Copy");
        MenuItem pasteMenuItem = new MenuItem("Paste");
        menu2.getItems().addAll(cutMenuItem, copyMenuItem, pasteMenuItem);
        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        menuprin.getChildren().add(menuBar);

        //text en bas
        VBox bottext = new VBox();
        Separator sepbot = new Separator();
        Label textbot = new Label("Ceci est un label de bas de page");
        bottext.setAlignment(Pos.CENTER);
        bottext.getChildren().addAll(sepbot,textbot);

        // Création du GridPane
        VBox cent = new VBox();

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Labels pour les colonnes de gauche
        Label nameLabel = new Label("Name:");
        Label emailLabel = new Label("Email:");
        Label passwordLabel = new Label("Password:");

        // Champs de texte pour les colonnes de droite
        TextField nameField = new TextField();
        TextField emailField = new TextField();
        TextField passwordField = new TextField();

        // Ajout des éléments au GridPane
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(emailLabel, 0, 1);
        gridPane.add(passwordLabel, 0, 2);
        gridPane.add(nameField, 1, 0);
        gridPane.add(emailField, 1, 1);
        gridPane.add(passwordField, 1, 2);
        HBox lesbtns = new HBox();
        Button btnsumb = new Button("Sumbit");
        Button btncancel = new Button("Cancel");
        lesbtns.getChildren().addAll(btnsumb, btncancel);
        lesbtns.setAlignment(Pos.CENTER);

        cent.getChildren().addAll(gridPane, lesbtns);
        cent.setAlignment( Pos.CENTER);

        BorderPane borderpane = new BorderPane();
        borderpane.setLeft(leftbtns);
        borderpane.setTop(menuprin);
        borderpane.setBottom(bottext);
        borderpane.setCenter(cent);
        // Créer une scène
        StackPane root = new StackPane();
        Scene scene = new Scene(borderpane);
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("ex1");
        primaryStage.show();
    }

}
