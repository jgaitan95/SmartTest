/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminmain;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author Justin Sanchez
 */
public class AdminResetAccount {
    public static Scene setScene()
    {
        //Grid
        GridPane AdminGrid = new GridPane();
        AdminGrid.setAlignment(Pos.CENTER);
        AdminGrid.setHgap(10);
        AdminGrid.setVgap(10);
        AdminGrid.setPadding(new Insets(10,25,10,25)); 
        
        //Label
        Label AccountLabel = new Label("Account Type:");
        Label UserLabel = new Label("Username:");
        AdminGrid.add(AccountLabel, 0, 0);
        AdminGrid.add(UserLabel,0,2);
        
        //TextFields
        TextField AccountTypeTF = new TextField();
        TextField UsernameTF = new TextField();
        AdminGrid.add(AccountTypeTF,1,0);
        AdminGrid.add(UsernameTF,1,2);
        
        //Button
        Button CreateButton = new Button("Reset");
        HBox cbox = new HBox(10);
        cbox.setAlignment(Pos.CENTER);
        cbox.getChildren().add(CreateButton);
        AdminGrid.add(cbox,1,4);
        
        //Scenes
        Scene scene = new Scene(AdminGrid, 350, 225);
        return scene;
    }
}
