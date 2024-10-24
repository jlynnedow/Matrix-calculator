package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;

public class TwoController {

    @FXML
    private Label c1;
    @FXML
    private TextField a;
    @FXML
    private TextField b;
    @FXML
    private TextField c;
    @FXML
    private TextField d;
    @FXML
    private Label ans;

    public void closeScene2() {
        // Get the current stage
        Stage stage = (Stage) c1.getScene().getWindow();
        // Close the current stage
        stage.close();
    }

    @FXML
    public void onEnter(){
        double[][] mat = new double[2][2];
        mat[0][0] = Double.parseDouble(a.getText());
        mat[0][1] = Double.parseDouble(b.getText());
        mat[1][0] = Double.parseDouble(c.getText());
        mat[1][1] = Double.parseDouble(d.getText());
        double det = Matrix.det(mat);
        //System.out.print(a.getText() + " this should be a number hahahahahaha");
        //System.out.print(det);
        ans.setText("Answer: " + det);
        ans.setFont(Font.font("Montserrat"));
        ans.setVisible(true);
    }


}
