module org.example.game2d {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.game2d to javafx.fxml;
    exports org.example.game2d;
}