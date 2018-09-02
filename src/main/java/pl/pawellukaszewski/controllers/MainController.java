package pl.pawellukaszewski.controllers;

import javafx.fxml.Initializable;
import pl.pawellukaszewski.models.SocketConnector;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private SocketConnector socketConnector = SocketConnector.getInstance();

    public void initialize(URL location, ResourceBundle resources) {
        socketConnector.connect();

        socketConnector.sendMessage("Ping");
    }
}
