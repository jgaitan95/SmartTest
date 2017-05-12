/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttest;

/**
 *
 * @author Justin Sanchez
 */
public class Student extends User{
    Student(String fn, String ln, String un, String pw){
        this.FirstName = fn;
        this.LastName = ln;
        this.Username = un;
        this.Password = pw;
        this.AccountType = "Student";
        
    }//constructor
    
}
