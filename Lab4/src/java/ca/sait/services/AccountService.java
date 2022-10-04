/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.services;

import ca.servlets.models.User;

/**
 * 
 * @author jheid
 */
public class AccountService {
    public AccountService(){
        
    }
    public User login(String username, String password) {
        
        if("abe".equals(username) && "password".equals(password)) {
            User user = new User(username, password);
            return user;
        
        } else if("barb".equals(username) && "password".equals(password)) {
            User user = new User(username, password);
            return user;
        } else {
            return null;
        }
    }
}
