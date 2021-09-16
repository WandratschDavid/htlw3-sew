package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import viewcontroller.Controller;

public class TheMain extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Controller.class.getResource("view.fxml"));
            Parent root = loader.load();

            primaryStage.setTitle("Phonebook");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        }
        catch(Exception ignored)
        {
            System.out.println("Error occured while loading fxml-file!");
        }
    }
}