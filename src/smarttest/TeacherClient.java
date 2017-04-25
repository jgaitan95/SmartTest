/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

/**
 *
 * @author Caroline
 */


public class TeacherClient extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Smart Test - Teacher Account");
        GridPane gp = new GridPane();
        
        Label title = new Label("Welcome to Smart Test");
        gp.add(title, 0, 0);
        
        Button createTestBtn = new Button();
        teacher.setText("Create a new Test");
        gp.add(createTestBtn, 1, 1);
        
        Button viewTestsBtn = new Button();
        viewTestsBtn.setText("View Tests");
        gp.add(viewTestsBtn, 0, 1);
        
        createTestBtn.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                
                //Create test
            
            }
        });
        
        viewTestsBtn.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                
                //View tests
                
            }
        });
        
        Scene scene = new Scene(gp, 720, 500);
        
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void main(String[] args){
        launch(args);
    }
}
