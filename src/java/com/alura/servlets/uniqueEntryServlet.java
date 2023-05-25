/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.alura.servlets;

import com.alura.actions.Action;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author PC
 */
@WebServlet(urlPatterns = {"/entry"})
public class uniqueEntryServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        String className = request.getParameter("action");                                
               
        className = "com.alura.actions." + className;        
        String name = null;
        
        try {
            Class gClass = Class.forName(className);
            Object obj = gClass.newInstance();
            Action action = (Action) obj;
            name = action.execute(request, response);
        }catch(ServletException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            throw new ServletException(e);
        }
              
        String[] tipeAndDirection = name.split(":");
        
        if(tipeAndDirection[0].equals("forward")) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipeAndDirection[1]);           
            rd.forward(request, response);   
        }else {
            response.sendRedirect(tipeAndDirection[1]);  
        }
    }
}
