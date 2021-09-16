package viewcontroller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.ColorCode;
import model.Model;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    Model model = new Model();

    @FXML
    Label lbl_colorView = new Label();

    @FXML
    TextField txtF_hexValue = new TextField();

    @FXML
    TextField txtF_rgbValueRed = new TextField();

    @FXML
    TextField txtF_rgbValueGreen = new TextField();

    @FXML
    TextField txtF_rgbValueBlue = new TextField();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    public static void show(Stage stage) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(Controller.class.getResource("view.fxml"));
        Parent root = loader.load();

        stage.setTitle("Color Calculator (Load/Save)");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void handleSave(ActionEvent aE)
    {
        model.save();
    }

    public void handleLoad(ActionEvent aE)
    {
        model.load();

        String hexValue = model.getHex();

        txtF_hexValue.setText(hexValue);

        lbl_colorView.setStyle("-fx-background-color: " + hexValue + ";");

        txtF_rgbValueRed.setText(String.valueOf(model.getRed()));

        txtF_rgbValueGreen.setText(String.valueOf(model.getGreen()));

        txtF_rgbValueBlue.setText(String.valueOf(model.getBlue()));
    }

    public void setExactValue(KeyEvent keyEvent)
    {
        TextField textField = (TextField) keyEvent.getSource();


        if(textField.getId().equals("txtF_rgbValueRed"))
        {
            model.chanceColorViaAbsoluteValue(ColorCode.RED, textField.getText());
        }

        else if(textField.getId().equals("txtF_rgbValueGreen"))
        {
            model.chanceColorViaAbsoluteValue(ColorCode.GREEN, textField.getText());
        }

        else if(textField.getId().equals("txtF_rgbValueBlue"))
        {
            model.chanceColorViaAbsoluteValue(ColorCode.BLUE, textField.getText());
        }

        String hexValue = model.getHex();

        txtF_hexValue.setText(hexValue);

        lbl_colorView.setStyle("-fx-background-color: " + hexValue + ";");
    }

    public void setIntervalValue(Event event)
    {
        Button btn = (Button) event.getSource();

        if(btn.getId().equals("btn_changeRed"))
        {
            model.chanceColorViaRelativeValue(ColorCode.RED, btn.getText());
        }

        else if(btn.getId().equals("btn_changeGreen"))
        {
            model.chanceColorViaRelativeValue(ColorCode.GREEN, btn.getText());
        }

        else if(btn.getId().equals("btn_changeBlue"))
        {
            model.chanceColorViaRelativeValue(ColorCode.BLUE, btn.getText());
        }

        String hexValue = model.getHex();

        txtF_hexValue.setText(hexValue);

        lbl_colorView.setStyle("-fx-background-color: " + hexValue + ";");
    }
}