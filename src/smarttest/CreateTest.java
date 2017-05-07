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


public class CreateTest {
    public static Scene setScene(){
        VBox box = new VBox();
        ScrollPane scroll = new ScrollPane();
        
        Test newTest = new Test();
        
        //add two separators
        Separator separator1 = new Separator();
        box.getChildren().add(separator1);
        Separator separator2 = new Separator();
        box.getChildren().add(separator2);
        
        
        Label addQuestionLabel = new Label("Add Questions");
        box.getChildren().add(addQuestionLabel);
        
        
        TextField numberOfOptions = new TextField("Enter number of options you want. e.g 2 or 4");
        box.getChildren().add(numberOfOptions);
        
        //add a new question
        Button addQuestion = new Button("Add Question");
        box.getChildren().add(addQuestion);
        
        //add two separators
        Separator separator3 = new Separator();
        box.getChildren().add(separator3);
        Separator separator4 = new Separator();
        box.getChildren().add(separator4);
        
        //setting up action for addQuestion button
        //add a new question every time button is clicked
        addQuestion.setOnAction((ActionEvent event) -> {
            int num = parseInt(numberOfOptions.getText());
            Question question = new Question();

            Stage tempStage = new Stage();
            Scene tempScene = CreateQuestion.setScene(question,num);
            tempStage.setScene(tempScene);
            tempStage.showAndWait();
            
            newTest.addQuestion(question);
            box.getChildren().clear();
            draw(newTest,box);
        });
        
        
        
        
        
        scroll.setContent(box);
        scroll.setFitToWidth(true);
        Scene scene = new Scene(scroll, 800, 600);
        scene.getStylesheets().add(SmartTest.class.getResource("/resources/style.css").toExternalForm());
        
        return scene;
    }
    
    
    public static void draw(Test newTest, VBox box){
        if(newTest.questions.size() > 0){
            Label existingQuestionsLabel = new Label("Existing Questions");
            box.getChildren().add(existingQuestionsLabel);
            
            for(Question q : newTest.questions){
                
                Label questionLabel = new Label(q.question);
                box.getChildren().add(questionLabel);
                questionLabel.setId("questionLabel");
            }
        }

        //add two separators
        Separator separator1 = new Separator();
        box.getChildren().add(separator1);
        Separator separator2 = new Separator();
        box.getChildren().add(separator2);
        
        
        Label addQuestionLabel = new Label("Add Questions");
        box.getChildren().add(addQuestionLabel);
        
        
        TextField numberOfOptions = new TextField("Enter number of options you want. e.g 2 or 4");
        box.getChildren().add(numberOfOptions);
        
        //add a new question
        Button addQuestion = new Button("Add Question");
        box.getChildren().add(addQuestion);
        
        //add two separators
        Separator separator3 = new Separator();
        box.getChildren().add(separator3);
        Separator separator4 = new Separator();
        box.getChildren().add(separator4);
        
        //setting up action for addQuestion button
        //add a new question every time button is clicked
        addQuestion.setOnAction((ActionEvent event) -> {
            int num = parseInt(numberOfOptions.getText());
            Question question = new Question();

            Stage tempStage = new Stage();
            Scene tempScene = CreateQuestion.setScene(question,num);
            tempStage.setScene(tempScene);
            tempStage.showAndWait();
            
            newTest.addQuestion(question);
            box.getChildren().clear();
            draw(newTest,box);
        });
    }
    

}
