package com.vominh.app.netlive.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import oshi.SystemInfo;

public class AppController extends BaseController{

    @FXML
    private Label os;
    @FXML
    private Label chip;
    @FXML
    private Label memory;

    private SystemInfo systemInfo;


    @FXML
    public void initialize() {
        systemInfo = new SystemInfo();
        initData();
    }


//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }

    public void initData() {
        os.setText(systemInfo.getOperatingSystem().toString());
        chip.setText(systemInfo.getHardware().getProcessor().getProcessorIdentifier().getName());
        memory.setText(systemInfo.getHardware().getMemory().getTotal() + "");
    }
}