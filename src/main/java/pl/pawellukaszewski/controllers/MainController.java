package pl.pawellukaszewski.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import pl.pawellukaszewski.models.SocketConnector;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

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
