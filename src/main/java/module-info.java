module oop {
    requires javafx.controls;
    requires javafx.fxml;

    opens les09.practicum9B_10.userinterface to javafx.fxml;
    exports les09.practicum9B_10;
    exports les09.practicum9B_10.userinterface;

    opens les09.twitter.userinterface to javafx.fxml;
    exports les09.twitter;
    exports les09.twitter.userinterface;
}