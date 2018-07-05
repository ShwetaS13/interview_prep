package com.applications.sudoku.app;

/**
 * Created by Shweta on 4/10/2017.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application
{

    public static void main(String[] arguments)
    {
        Application.launch(Main.class, arguments);
    }


    @Override
    public void start(final Stage stage) throws Exception
    {
        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("NumberPad.fxml"));
        fxmlLoader.setLocation(getClass().getResource("MainScreen.fxml"));
        Parent root = fxmlLoader.load();
        stage.setResizable(true);
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(root);
        String css = this.getClass().getResource("styleSheet.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);

        stage.show();
    }
}
