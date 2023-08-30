package com.example.guessflags;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class fifthController {


    @FXML
    private Label scoreLabel;
    @FXML
    private Button firstButton;
    private int score = 0;

    public void choose(ActionEvent e){

        if(e.getSource().equals(firstButton)){
            score++;
        }
        scoreLabel.setText("Score: " + score);
    }

    public void next(ActionEvent e) throws IOException {

        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Game completed");
        dialog.setContentText("You finished the game!Congratulation!");
        ButtonType type = new ButtonType("Ok");
        dialog.getDialogPane().getButtonTypes().add(type);
        dialog.show();

    }
}
