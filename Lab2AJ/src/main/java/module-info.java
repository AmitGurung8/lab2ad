module com.example.lab2aj {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.lab2aj to javafx.fxml;
    exports com.example.lab2aj;
}