package controllerView;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import model.CurrencyConverter;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Controller für CurrencyConverter
 */
public class CurrencyConverterC
{
  ObservableList<String> currency = FXCollections.observableArrayList("Yen", "US-Dollar");

  @FXML
  private TextField txtEuro;
  @FXML
  private TextField txtYen;
  
  private CurrencyConverter currencyConverter;
  
  private static final  NumberFormat DEC2FORMAT;

  //Extension
  @FXML
  private ChoiceBox<String> choiceBox;

  @FXML
  private void initialize()
  {
    choiceBox.setItems(currency);
  }


  static
  {
    DEC2FORMAT = NumberFormat.getNumberInstance();
    DEC2FORMAT.setGroupingUsed(true);
    DEC2FORMAT.setMinimumFractionDigits(2);
    DEC2FORMAT.setMaximumFractionDigits(2);
  }
  
  /**
   * Passiert, wenn der Umrechnungs-Button gedrückt wird
   */
  @FXML
  public void btnConvertAction()
  {
    //  besser in Methode auslagern, weil gleiche Funktionalitäten via GUIs häufig auf verschiedene Weisen aufgerufen werden können.
    convert();
  }

  /**
   * Konstruktor.
   * Es muss ein öffentlicher Standardkonstruktor (noArg) existieren. Entweder explizit angegeben oder per Default generiert.
   */
  public CurrencyConverterC()
  {
    currencyConverter = new CurrencyConverter();
  }
  
  /**
   * Konvertierung Euro -> Yen oder Euro -> US-Dollar
   */
  private void convert()
  {
      if (choiceBox.getValue().equals("US-Dollar"))
      {
        try
        {
          double euro = DEC2FORMAT.parse(txtEuro.getText()).doubleValue();
          double dollar = currencyConverter.euroToDollar(euro);
          txtYen.setText(DEC2FORMAT.format(dollar));
        }
        catch (ParseException e)
        {
          System.out.println(e.getMessage());
        }
      }
      else
        {
        try
        {
          double euro = DEC2FORMAT.parse(txtEuro.getText()).doubleValue();
          double yen = currencyConverter.euroToYen(euro);
          txtYen.setText(DEC2FORMAT.format(yen));
        }
        catch (ParseException e)
        {
          System.out.println(e.getMessage());
        }
      }
    }
}