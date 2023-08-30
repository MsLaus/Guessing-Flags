module com.example.guessflags {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guessflags to javafx.fxml;
    exports com.example.guessflags;
}