module com.example.projetoteste {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.projetoteste to javafx.fxml;
    exports com.example.projetoteste;
}