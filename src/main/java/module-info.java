module com.example.tp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp1 to javafx.fxml;
    exports com.example.tp1;
    exports com.example.partie1;
    exports com.example.partie2;
    exports com.example.ex4;
    exports ex1;
    exports com.example.exercice6;
    exports com.example.partie3;
    opens com.example.partie3 to javafx.fxml;
}