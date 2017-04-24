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
 */
public class Question {
    
    private ArrayList<String> ans;
    private int correctAns;
    private String question;
    
    public Question(String question, String a, String b, String c, String d, int correctAns){
        this.question = question;
        ans = new ArrayList<String>();
        ans.add(a);
        ans.add(b);
        ans.add(c);
        ans.add(d);
        this.correctAns = correctAns;
    }
    
}
