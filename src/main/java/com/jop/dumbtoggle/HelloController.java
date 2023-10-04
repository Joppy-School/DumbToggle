package com.jop.dumbtoggle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setVisible(!welcomeText.isVisible());
    }
}