/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

import static java.lang.Integer.parseInt;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.event.EventHandler;
import java.util.Arrays;
/**
 *
 * @author Caroline
 */
public class TakeTest {
    private static int currentIndex = 0;
    public static boolean testFinished = false;
    private static Test testToTake = new Test(); //The test that is being taken
    
    private static ArrayList<Question> qs = testToTake.getQuestions();
    private static Label question = new Label();
    private static ArrayList<Button> answers = new ArrayList<Button>();
    
    public static Scene setScene(Test test){
        qs = test.getQuestions();
        VBox box = new VBox();
        ScrollPane scroll = new ScrollPane();
        
        //Label to display the question
        question = new Label(qs.get(currentIndex).toString());
        box.getChildren().add(question);
        
        //Creates a list of buttons out of all the answers
        answers = new ArrayList<Button>(qs.get(currentIndex).getOptions().size());
        for(int i = 0; i < qs.get(currentIndex).getOptions().size(); i++){
            //create the new button with the info
            answers.add(new Button());
            answers.get(i).setText(qs.get(currentIndex).getOptions().get(i));
            box.getChildren().add(answers.get(i));
            answers.get(i).setOnAction(new EventHandler<ActionEvent>(){
               @Override
               public void handle(ActionEvent event){
                   if(currentIndex != qs.size()){
                       currentIndex++;
                       box.getChildren().remove(question);
                       question = new Label(qs.get(currentIndex).toString());
                       for(Button button : answers){
                           box.getChildren().remove(button);
                           button.setText(qs.get(currentIndex).getOptions().get(currentIndex));
                           box.getChildren().add(button);
                       }
                   } else {
                       testFinished = true;
                   }
               }
            });
        }
        scroll.setContent(box);
        scroll.setFitToWidth(true);
        Scene scene = new Scene(scroll, 800, 600);
        scene.getStylesheets().add(SmartTest.class.getResource("/resources/style.css").toExternalForm());
        
        return scene;
        
    }
    /*
     * This method is called from another class in order to pass the 
     * test object for the test that is being taken
    */
    public static void setTestToTake(Test test){
        testToTake = test;
    }
}
