module com.example.tap2025 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tap2025 to javafx.fxml;
    exports com.example.tap2025;
}