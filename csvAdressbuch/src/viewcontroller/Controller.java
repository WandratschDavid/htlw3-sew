package viewcontroller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Person;
import model.Phonebook;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML
    private TextField nameTxtField;

    @FXML
    private TextField addressTxtField;

    @FXML
    private TextField phoneNumTxtField;

    @FXML
    private Label currentPage;

    private Phonebook pB = new Phonebook();

    private int currentIndex = 1;


    @FXML
    private void nextPerson()
    {
        currentIndex++;

        if (currentIndex > pB.getSize()) {currentIndex = 1;}

        updateDisplayedPerson();
    }

    @FXML
    private void prevPerson()
    {
        currentIndex--;

        if (currentIndex < 1) {currentIndex = pB.getSize();}

        updateDisplayedPerson();
    }

    @FXML
    private void addPerson()
    {
        pB.addPerson(nameTxtField.getText(), addressTxtField.getText(), phoneNumTxtField.getText());

        currentIndex = pB.getSize();

        updateDisplayedPerson();
    }

    @FXML
    private void delPerson()
    {
        pB.deletePerson(currentIndex);

        updateDisplayedPerson();
    }

    @FXML
    private void saveChanges()
    {
        String name = nameTxtField.getText();
        String address = addressTxtField.getText();
        String phoneNum = phoneNumTxtField.getText();

        pB.editPerson(name, address, phoneNum, currentIndex);
    }

    @FXML
    private void loadFromCSV(){pB.loadCSV();}

    @FXML
    private void saveToCSV(){pB.saveCSV();}

    private void updateDisplayedPerson()
    {
        Person person = pB.getPerson(currentIndex);
        nameTxtField.setText(person.getName());
        addressTxtField.setText(person.getAddress());
        phoneNumTxtField.setText(person.getPhoneNum());

        currentPage.setText(currentIndex + "/" + pB.getSize());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
}