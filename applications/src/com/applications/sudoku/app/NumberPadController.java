package com.applications.sudoku.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Shweta on 4/15/2017.
 */
public class NumberPadController implements Initializable {

    @FXML private Button number_1;
    @FXML private Button number_2;
    @FXML private Button number_3;
    @FXML private Button number_4;
    @FXML private Button number_5;
    @FXML private Button number_6;
    @FXML private Button number_7;
    @FXML private Button number_8;
    @FXML private Button number_9;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    private void getKey(ActionEvent actionEvent) {
        String text = ((Button)actionEvent.getSource()).getText();
        System.out.println(text);
        MainScreenController.setValue(text);
        Button btn = (Button) actionEvent.getSource();
        String id = btn.getId();
        number_1.getScene().getWindow().hide();
    }
}
