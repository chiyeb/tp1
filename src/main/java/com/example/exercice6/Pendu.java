package com.example.exercice6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class Pendu extends Application {

    private Dico dico = new Dico();
    private int nberreur = 0;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        HBox hbox1 = new HBox();
        HBox hbox2 = new HBox();

        ArrayList<String> alphabet = affichletter(hbox1);
        FlowPane fp = new FlowPane();
        Button[] letterButtons = new Button[alphabet.size()];
        for (int i = 0; i < alphabet.size(); i++) {
            String letter = alphabet.get(i);
            letterButtons[i] = new Button(letter);
            fp.getChildren().add(letterButtons[i]);
        }
        Label erreur = new Label("nombre d'erreur: " + nberreur);
        fp.setAlignment(Pos.CENTER);
        for (int i =0; i<alphabet.size(); ++i){

            letterButtons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> letter(event, erreur ,hbox1, hbox2) );

        }
        affichmot();
        hbox2.getChildren().add(erreur);
        BorderPane borderpane = new BorderPane();
        borderpane.setBottom(fp);
        borderpane.setTop(hbox1);
        borderpane.setRight(hbox2);
        Scene scene = new Scene(borderpane);
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Pendu");
        primaryStage.show();


    }
    public void letter(MouseEvent event, Label erreur, HBox hbox1, HBox hbox2){

        Button currentButton = (Button) event.getSource();
        String lettreActu = currentButton.getText();
        String mot = dico.getMot();
        if (mot.contains(lettreActu)) {
            Label lemotcherche = new Label(lettreActu);
            hbox1.getChildren().add(lemotcherche);
        }
        else{
            nberreur+=1;
            erreur.setText("Nombre d'erreur: "+nberreur);
        }




    }
    public void affichmot(){
        String motaffich = dico.getMot();
        int nbdelettre = motaffich.length();
        System.out.println(nbdelettre);
    }
    public ArrayList<String> affichletter(HBox hbox1){
        ArrayList<String> alphabet = new ArrayList<>(Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        ));
        return alphabet;
    }
}
