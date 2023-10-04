module com.jop.dumbtoggle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jop.dumbtoggle to javafx.fxml;
    exports com.jop.dumbtoggle;
}