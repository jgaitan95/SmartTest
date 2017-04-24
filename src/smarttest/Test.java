/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

import java.util.ArrayList;

/**
 *
 * @author Caroline
 * Contains code for managing and creating test objects.
 */
public class Test {
    private ArrayList<Question> qs;
    
    public Test(){
        qs = new ArrayList<Question>();
    }
    
    public void addQuestion(Question q){
        qs.add(q);
    }
    
    public ArrayList<Question> getQuestions(){
        return qs;
    }
}
