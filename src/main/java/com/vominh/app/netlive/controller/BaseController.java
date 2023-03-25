package com.vominh.app.netlive.controller;

import javafx.scene.Node;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class BaseController {

    protected Stage getStage(ActionEvent event){
        return (Stage) ((Node) event.getSource()).getScene().getWindow();
    }
}
