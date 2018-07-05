package com.applications.sudoku.app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Created by Shweta on 4/10/2017.
 */
public class MainScreenController implements Initializable {
    @FXML private Button button_1;
    @FXML private Button button_2;
    @FXML private Button button_3;
    @FXML private Button button_4;
    @FXML private Button button_5;
    @FXML private Button button_6;
    @FXML private Button button_7;
    @FXML private Button button_8;
    @FXML private Button button_9;
    @FXML private Button closeButton;
    @FXML private FlowPane flowPane;

    private static String value;
    public static String getValue(){
        return value;
    }

    public static void setValue(String val){
        value = val;
    }

    @Override
    public void initialize(java.net.URL arg0, ResourceBundle arg1) {
    }

    @FXML private void close() {
        flowPane.getScene().getWindow().hide();
    }

    @FXML private void loadNumberPad(MouseEvent event){
        loadPad();
    }

    private void loadPad(){
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("NumberPad.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setResizable(true);
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(root);
        String css = this.getClass().getResource("styleSheet.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);

        stage.show();
    }


}
