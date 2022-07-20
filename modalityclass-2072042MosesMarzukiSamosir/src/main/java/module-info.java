module com.example.modalityclass2072042mosesmarzukisamosir {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modalityclass2072042mosesmarzukisamosir to javafx.fxml;
    exports com.example.modalityclass2072042mosesmarzukisamosir;
    exports controller;
    exports model;
    opens controller to javafx.fxml;
}