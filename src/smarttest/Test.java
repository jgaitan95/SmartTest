/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class Test {
    Boolean isDeployed;
    int totalPoints;
    ArrayList<Question> questions;
    ArrayList<LearningOutcome> learningOutcomes;
    
    
    public Test(){
        isDeployed = false;
        totalPoints = 0;
        questions = new ArrayList<>();
        learningOutcomes = new ArrayList<>();
    }
    
    public void addQuestion(Question q){
        questions.add(q);
        totalPoints += q.points;
    }
}
