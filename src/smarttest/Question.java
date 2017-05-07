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
    String learningOutcome;
    int correctOption;
    int points;
    String question;
    ArrayList<String> options;
    

    public Question(){
        learningOutcome = "";
        correctOption = 0;
        question = "";
        points = 0;
        options = new ArrayList<>();
    }
}
