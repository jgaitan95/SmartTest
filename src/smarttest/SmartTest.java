/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * This is main Client Class 
 */
public class SmartTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //primaryStage.setTitle("Smart Test Login");
        
        String str = "rO0ABXNyAA5zbWFydHRlc3QuVGVzdPaO7CzJjsKcAgAFSQAGdGVzdElESQALdG90YWxQb2ludHNMAAppc0RlcGxveWVkdAATTGphdmEvbGFuZy9Cb29sZWFuO0wAEGxlYXJuaW5nT3V0Y29tZXN0ABVMamF2YS91dGlsL0FycmF5TGlzdDtMAAlxdWVzdGlvbnNxAH4AAnhwGO0MPwAAAApzcgARamF2YS5sYW5nLkJvb2xlYW7NIHKA1Zz67gIAAVoABXZhbHVleHAAc3IAE2phdmEudXRpbC5BcnJheUxpc3R4gdIdmcdhnQMAAUkABHNpemV4cAAAAAB3BAAAAAB4c3EAfgAGAAAAAXcEAAAAAXNyABJzbWFydHRlc3QuUXVlc3Rpb24t7%2BMifskaIQIABUkADWNvcnJlY3RPcHRpb25JAAZwb2ludHNMABBsZWFybmluZ091dGNvbWVzcQB%2BAAJMAAdvcHRpb25zcQB%2BAAJMAAhxdWVzdGlvbnQAEkxqYXZhL2xhbmcvU3RyaW5nO3hwAAAAAQAAAApzcQB%2BAAYAAAABdwQAAAABc3IAGXNtYXJ0dGVzdC5MZWFybmluZ091dGNvbWX67XFtEfEdaAIAAkwACGNhdGVnb3J5cQB%2BAApMAARuYW1lcQB%2BAAp4cHQAC3Byb2dyYW1taW5ndAAEamF2YXhzcQB%2BAAYAAAACdwQAAAACdAAEdHJ1ZXQABWZhbHNleHQAE2phdmEgaXMgb28gbGFuZ3VhZ2V4";
        Test tempTest = (Test)Utils.toObj(str);
        
        Scene scene = CreateTest.setScene();
        //Scene scene = AddLearningOutcomes.setScene();
        //Scene scene = AdminHome.setScene();

        //Scene scene = TakeTest.setScene(tempTest);
        
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
