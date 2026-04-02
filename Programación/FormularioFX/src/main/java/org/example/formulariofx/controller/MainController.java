package org.example.formulariofx.controller;

import javafx.event.Event;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


public class MainController implements Initializable {

    @FXML
    private ChoiceBox<?> choiceTipo;

    @FXML
    private TextField editApellido;

    @FXML
    private TextField editCorreo;

    @FXML
    private TextField editDni;

    @FXML
    private TextField editNombre;

    @FXML
    private TextField editPass;

    @FXML
    private RadioButton radioFem;

    @FXML
    private RadioButton radioMasc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instances();
        initGUI();
        actions();
    }

    private void actions() {
    }

    private void initGUI() {
        
    }

    private void instances() {
        
    }

}
