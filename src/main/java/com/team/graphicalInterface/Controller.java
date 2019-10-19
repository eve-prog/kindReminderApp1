package com.team.graphicalInterface;

import com.team.constans.Constants;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {


    public TextField txtFieldUser;
    public PasswordField pwdField;
    public Label lblUser;
    public Label lblPassword;


    public Button btnLogin;

    public void loginUser(ActionEvent actionEvent) {
        if (txtFieldUser.getText().equals(Constants.DB_USERNAME)) {
            lblUser.setTextFill(Color.BLACK);
            System.out.println(txtFieldUser.getText());
        }
        else{
            lblUser.setTextFill(Color.RED);
        }
        if (pwdField.getText().equals(Constants.DB_PASSWORD)) {
            lblPassword.setTextFill(Color.BLACK);
            System.out.println(pwdField.getText());
        }
        else{
            lblPassword.setTextFill(Color.RED);
        }
    }
}