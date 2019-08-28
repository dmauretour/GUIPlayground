package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label txtName;

    @FXML
    private TextField txtField;

    @FXML
    void showName(ActionEvent event) {
        String name = txtField.getText();
        txtName.setText(name);
    }

}


