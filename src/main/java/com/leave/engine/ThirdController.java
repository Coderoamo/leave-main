package com.leave.engine;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ThirdController {

    @FXML
    private Button yesOpt;

    @FXML
    void clickedYes(ActionEvent event) throws IOException {
        App.setRoot("primary");

    }

    @FXML
    void ifClicked(MouseEvent event) {

    }

}

