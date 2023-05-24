/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.models;

/**
 *
 * @author PC
 */
public class User {
    private String login;
    private String password;
    
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Boolean isEqual(String login, String password) {
        if(!this.login.equals(login)) {
            return false;
        }
        if(!this.password.equals(password)) {
            return false;
        }
        
        return true;
    }
}
