/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.alura.servlets;

import com.alura.db.DB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author PC
 */
@WebServlet(urlPatterns = {"/RemoveCompany"})
public class RemoveCompanyServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String paramId = request.getParameter("id");
            int id = Integer.parseInt(paramId);
        
            DB db = new DB();
            db.removeCompany(id);
            
            response.sendRedirect("CompanyList");                        
    }      
}
