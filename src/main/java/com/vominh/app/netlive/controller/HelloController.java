package com.vominh.app.netlive.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    public HelloController(){

    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}