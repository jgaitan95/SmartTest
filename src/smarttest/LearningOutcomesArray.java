/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

import java.util.ArrayList;


public class LearningOutcomesArray extends ArrayList<LearningOutcome> implements java.io.Serializable {
    ArrayList<LearningOutcome> loArray ;
    
    public LearningOutcomesArray(){
        loArray = new ArrayList<>();
    }
    
}
