/**class Main
 * @authors David Wandratsch, Moritz Kronberger, Matteo Falkenberg
 * @version 1.20, 03.11.2020
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
    MaFaBar falkenbar = new MaFaBar();
    DavidsGaugeBar DavidsBar = new DavidsGaugeBar();
    MoKrBar moKrBar = new MoKrBar();
    TextField txtValue = new TextField();

    public static void main(String[] args)
    {
        // Launch the JavaFX application
        Application.launch(args);
    }

    @Override public void start(Stage stage)
    {

        EventHandler<MouseEvent> btn_handler = new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent e)
            {

                try
                {
                    int v = Integer.parseInt(txtValue.getText());
                    falkenbar.setValue(v);
                    DavidsBar.setValue(v);
                    moKrBar.setValue(v);
                }
                catch(Exception ex)
                {
                    System.out.println("Input Exception!");
                }

            }
        };

        falkenbar.init(400, 50);
        falkenbar.setValue(45);
        DavidsBar.init(100, 100);
        DavidsBar.setValue(25);
        moKrBar.init(100);
        moKrBar.setValue(35);

        Button btnValue = new Button();
        btnValue.setText("New Value");
        btnValue.addEventHandler(MouseEvent.MOUSE_CLICKED, btn_handler);

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 50, 50, 50));
        vBox.setSpacing(20);
        vBox.getChildren().addAll(falkenbar, DavidsBar, moKrBar, txtValue, btnValue);

        //Creating a Scene
        Scene scene = new Scene(vBox);

        //Setting title to the scene
        stage.setTitle("Gauge Collection");
        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }
}