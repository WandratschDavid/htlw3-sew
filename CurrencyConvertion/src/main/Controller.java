package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller
{
    @FXML
    private Label euro;

    @FXML
    private TextArea area_euro;

    @FXML
    private Button convert;

    @FXML
    private Label yen;

    @FXML
    private TextArea area_yen;

    @FXML
    void handler_doConvertion(ActionEvent actionEvent)
    {
        CurrencyConverter converter = new CurrencyConverter();

        try {
            double yen = converter.euroToYen(Double.parseDouble(area_euro.getText()));
            area_yen.setText(String.format("%.2f", yen));
        }
        catch (Exception ex)
        {
            area_yen.setText("wrong input!");
        }
    }
}