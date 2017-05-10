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

public class AdminCreateAccount {
    public static Scene setScene()
    {
        GridPane AdminGrid = new GridPane();
        AdminGrid.setAlignment(Pos.CENTER);
        AdminGrid.setHgap(10);
        AdminGrid.setVgap(10);
        AdminGrid.setPadding(new Insets(10,10,10,10)); //padding is 25 px all around
        
        //TextFields
        TextField AccountTypeTF = new TextField();
        TextField UsernameTF = new TextField();
        PasswordField PasswordTF = new PasswordField();
        AdminGrid.add(UsernameTF,1,2);
        AdminGrid.add(PasswordTF,1,4);
        AdminGrid.add(AccountTypeTF,1,0);
        
        //Labels
        Label UserLabel = new Label("Username:");
        Label PassLabel = new Label("Password:");
        Label AccountLabel = new Label("Account Type:");
        AdminGrid.add(UserLabel,0,2);
        AdminGrid.add(PassLabel,0,4);
        AdminGrid.add(AccountLabel,0,0);
        
        //button
        Button CreateButton = new Button("Create");
        HBox cbox = new HBox(10);
        cbox.setAlignment(Pos.CENTER);
        cbox.getChildren().add(CreateButton);
        AdminGrid.add(cbox,1,6);
        
        //Scenes
        Scene scene = new Scene(AdminGrid, 350, 225);
        return scene;
    }
}
