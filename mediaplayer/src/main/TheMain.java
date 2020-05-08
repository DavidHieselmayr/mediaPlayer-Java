/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.stage.Stage;
import mediaplayer.MediaplayerController;

/**
 *
 * @author Nexo
 */
public class TheMain extends Application{
 

    @Override
    public void start(Stage stage) throws Exception {
            MediaplayerController.show(stage);
    }
}
