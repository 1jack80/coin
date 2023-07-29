package com.j.coin.Controllers.Client;

import com.j.coin.Models.Model;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_btn;
    public Button transaction_btn;
    public Button accounts_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        dashboard_btn.setOnAction(event -> Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard"));
        transaction_btn.setOnAction(event -> Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions"));
        accounts_btn.setOnAction(event -> Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Accounts"));
    }
}
