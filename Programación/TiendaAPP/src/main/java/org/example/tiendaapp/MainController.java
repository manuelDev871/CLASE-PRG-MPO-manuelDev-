package org.example.tiendaapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button botonSaludar;

    @FXML
    private TextField editNombre;

    @FXML
    private Text textoSaludo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        botonSaludar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String texto = editNombre.getText();
                if (texto.isEmpty()) {
                    textoSaludo.setText("No hay nadie a quien saludar");
                } else {
                    textoSaludo.setText("Hola " + texto + " has completado la app JAVA FX");
                }
            }
        });
    }
}
