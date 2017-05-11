/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Justin Sanchez
 */

//main admin gui
public class AdminHome {
    public static Scene setScene()
    {

        GridPane AdminGrid = new GridPane();
        AdminGrid.setAlignment(Pos.CENTER);
        AdminGrid.setHgap(10);
        AdminGrid.setVgap(10);
        AdminGrid.setPadding(new Insets(10,25,10,25)); //padding is 25 px all around
        //AdminGrid.setGridLinesVisible(false);
        
        //Buttons
        Button createButton = new Button("Create Account");
        HBox cbox = new HBox(10);
        cbox.setAlignment(Pos.CENTER);
        cbox.getChildren().add(createButton);
        AdminGrid.add(cbox,0,0);
        
        Button resetButton = new Button("Reset Account");
        HBox rbox = new HBox(10);
        rbox.setAlignment(Pos.CENTER);
        rbox.getChildren().add(resetButton);
        AdminGrid.add(rbox,0,2);
        
        
        createButton.setOnAction((ActionEvent event) -> {
            Stage tempStage = new Stage();
            Scene tempScene = AdminCreateAccount.setScene();
            tempStage.setScene(tempScene);
            tempStage.show();
            
            Stage s = (Stage)createButton.getScene().getWindow();
            s.close();
        });
        
        resetButton.setOnAction((ActionEvent event) -> {
            Stage tempStage = new Stage();
            Scene tempScene = AdminResetAccount.setScene();
            tempStage.setScene(tempScene);
            tempStage.show();
            
            Stage s = (Stage)resetButton.getScene().getWindow();
            s.close();
        });
        
        //Scenes
        Scene scene = new Scene(AdminGrid, 350, 225);
        return scene;
    }
}
