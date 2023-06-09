/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.actions;

import com.alura.db.DB;
import com.alura.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author PC
 */
public class Login implements Action {        

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        
        DB db = new DB();        
        
        User us = db.exitUser(user, password);
        
        if(us != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", us);
            return "redirect:entry?action=CompanyList";
        }
        
        return "redirect:entry?action=LoginForm";
    }
}
