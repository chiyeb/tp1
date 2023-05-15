package com.example.ex4;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private int vert = 0;
    private int bleu = 0;
    private int rouge = 0;
    private VBox vboxm   = new VBox();;
    private Label label = new Label(); ;


    @Override
    public void start(Stage primaryStage) {


        //les boutons
        HBox hbox = new HBox();
        Button button = new Button("Vert");
        Button button1 = new Button("Rouge");
        Button button2 = new Button("Bleu");
        hbox.getChildren().addAll(button, button1, button2);
        hbox.setAlignment( Pos.BOTTOM_CENTER );
        hbox.setSpacing(10.0d);

        hbox.setPadding( new Insets(10.0d) );

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);



        button.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> nombreDeClicsVert(actionEvent) );
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> nombreDeClicsRouge(actionEvent) );
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> nombreDeClicsBleu(actionEvent) );
        //  Le borderPane
        BorderPane borderpane = new BorderPane();
        borderpane.setBottom(hbox);


        borderpane.setTop(vbox);
        borderpane.setCenter(vboxm);

        // Création de la scene
        Scene scene = new Scene( borderpane );

        // Ajout de la scene à la fenêtre
        primaryStage.setScene(scene);
        primaryStage.setWidth( 400 );
        primaryStage.setHeight( 200 );
        primaryStage.setTitle("ex4");
        primaryStage.show();
    }
    public void nombreDeClicsVert(Event event){
        vboxm.setStyle("-fx-background-color: #0e9874;");
        vert +=1;
        label.setText("Vert choisis "+vert+" fois");
        System.out.println(vert);
    }
    public void nombreDeClicsRouge(Event event){
        vboxm.setStyle("-fx-background-color: #ff0000;");
        rouge +=1;
        label.setText("Rouge choisis "+rouge+" fois");
    }
    public void nombreDeClicsBleu(Event event){
        vboxm.setStyle("-fx-background-color: #0051ff;");
        bleu +=1;
        label.setText("Bleu choisis "+bleu+" fois");
    }
}
