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
 * This is main Client Class 
 */
public class SmartTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Smart Test Login");
        GridPane gp = new GridPane();
        
        Label title = new Label("Smart Test");
        gp.add(title, 0, 0);
        
        Button teacher = new Button();
        teacher.setText("Teacher Login");
        gp.add(teacher, 1, 1);
        
        Button student = new Button();
        student.setText("Student Login");
        gp.add(student, 0, 1);
        
        final String URL = "http://localhost/login.php";
        
        teacher.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                String datastr = "usr=teacher";
                try{
                    String response = Utils.httpsPost(URL, datastr); 
                    System.out.println(response);
                } catch (Exception e) { System.out.println("EXCEPTION: " + e.getMessage()); }
            
            }
        });
        
        student.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                String datastr = "usr=student";
                try{
                    String response = Utils.httpsPost(URL, datastr); 
                    System.out.println(response);
                } catch (Exception e) { System.out.println("EXCEPTION: " + e.getMessage()); }
            
            }
        });
        
        Scene scene = new Scene(gp, 720, 500);
        
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
