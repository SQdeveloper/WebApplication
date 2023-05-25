/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.servlets;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author PC
 */

@WebFilter("/entry")
public class AuthorizationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest srequest , ServletResponse sresponse, FilterChain fc) throws IOException, ServletException {
        
        System.out.println("AuthorizationFilter");
        
        HttpServletRequest request = (HttpServletRequest) srequest;
        HttpServletResponse response = (HttpServletResponse) sresponse;
        
        HttpSession session = request.getSession();
        String className = request.getParameter("action");        
        Boolean isNotSessionUser = session.getAttribute("user") == null;
        Boolean isActionProtected = (!className.equals("LoginForm") && !className.equals("Login"));
        
        if( isNotSessionUser && isActionProtected) {
            response.sendRedirect("entry?action=LoginForm");
            return;
        }
        
        fc.doFilter(request, response);
    }
    
}
