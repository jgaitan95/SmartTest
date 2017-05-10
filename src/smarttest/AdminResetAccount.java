/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author Justin Sanchez
 */
public class AdminResetAccount {
    public static Scene setScene()
    {
        GridPane AdminGrid = new GridPane();
        AdminGrid.setAlignment(Pos.CENTER);
        AdminGrid.setHgap(10);
        AdminGrid.setVgap(10);
        AdminGrid.setPadding(new Insets(10,25,10,25)); 

        //button
        Button CreateButton = new Button("Reset");
        HBox cbox = new HBox(10);
        cbox.setAlignment(Pos.CENTER);
        cbox.getChildren().add(CreateButton);
        AdminGrid.add(cbox,1,3);
        
        //Scenes
        Scene scene = new Scene(AdminGrid, 350, 225);
        return scene;
    }
}
