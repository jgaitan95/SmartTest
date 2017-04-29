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
    

    public Question(){
        correctOption = 0;
        question = ""
        points = 0;
        options = new ArrayList<>();
    }

    
    public Question(String question, String a, String b, String c, String d, int correctAns){
        this.question = question;
        options.add(a);
        options.add(b);
        options.add(c);
        options.add(d);
        this.correctOption = correctAns;
    }
}
