package com.example.lab2aj;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateMyBurgerController implements Initializable {

    @FXML
    private Button btnSubmit;

    @FXML
    private Label iblInfo;

    @FXML
    private TextField txtCalories;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPrice;

    public void onSubmit(javafx.event.ActionEvent actionEvent) {
        Burger burger = new Burger();
        burger.setName(txtName.getText());
        burger.setPrice(Double.parseDouble(txtPrice.getText()));
        burger.setCalories(Integer.parseInt(txtCalories.getText()));

        iblInfo.setVisible(true);
        iblInfo.setText(burger.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        iblInfo.setVisible(false);
    }


}


