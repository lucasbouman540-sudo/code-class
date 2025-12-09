module com.example.codeclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codeclass to javafx.fxml;
    exports com.example.codeclass;
}