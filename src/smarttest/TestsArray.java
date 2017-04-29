/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

import java.util.ArrayList;

/**
 *
 * @author arslanwaheed
 */
public class TestsArray extends ArrayList<Test> implements java.io.Serializable{
    ArrayList<Test> testArray;
    
    public TestsArray(){
        testArray = new ArrayList<>();
    }
}
