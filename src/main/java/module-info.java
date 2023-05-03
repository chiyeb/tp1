module com.example.tp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp1 to javafx.fxml;
    exports com.example.tp1;
}