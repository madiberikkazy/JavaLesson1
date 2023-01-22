module com.example.javalesson1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javalesson1 to javafx.fxml;
    exports com.example.javalesson1;
}