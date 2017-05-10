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
public class Question implements java.io.Serializable{
    int correctOption;
    int points;
    String question;
    ArrayList<String> options;
    ArrayList<LearningOutcome> learningOutcomes;
    

    public Question(){
        learningOutcomes = new ArrayList<>();
        correctOption = 0;
        question = "";
        points = 0;
        options = new ArrayList<>();
    }
}
