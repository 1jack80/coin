package com.j.coin.Controllers.Client;

import com.j.coin.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldValue, newValue) -> {
            switch (newValue) {
                case "Transactions":
                    // get the client window and set center to transaction view
                    client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionView());
                    break;
                case "Accounts":
                    client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                    break;
                default:
                    // set client window center to dashboard view;
                    client_parent.setCenter(Model.getInstance().getViewFactory().getDashboradView());
            }
        });
    }
}
