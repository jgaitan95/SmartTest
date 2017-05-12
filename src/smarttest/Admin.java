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
public class Admin extends User{
    Admin(String f, String l, String u, String p){
        super(f,l,u,p);
        this.AccountType = "Admin";    
    }//constructor    
}//Admin
