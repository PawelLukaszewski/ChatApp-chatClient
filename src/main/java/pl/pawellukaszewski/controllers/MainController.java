package pl.pawellukaszewski.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import pl.pawellukaszewski.models.SocketConnector;

import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class MainController implements Initializable {

    @FXML
    Button buttonSend;

    @FXML
    TextArea textMessages;

    @FXML
    TextField textWriteMessage;

    private SocketConnector socketConnector = SocketConnector.getInstance();

    public void initialize(URL location, ResourceBundle resources) {


        socketConnector.connect();
        socketConnector.sendMessage("Ping");
    }
}
