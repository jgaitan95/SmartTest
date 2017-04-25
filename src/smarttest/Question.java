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
public class Question {
    int correctOption;
    int points;
    ArrayList<String> options;
    
    public Question(){
        correctOption = 0;
        points = 1;
        options = new ArrayList<>();
    }
}
