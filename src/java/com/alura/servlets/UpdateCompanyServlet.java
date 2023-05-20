/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.alura.servlets;

import com.alura.db.DB;
import com.alura.models.Company;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author PC
 */
@WebServlet(urlPatterns = {"/UpdateCompany"})
public class UpdateCompanyServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String paramId = request.getParameter("id");
            int id = Integer.parseInt(paramId);
            String name = request.getParameter("name");
            LocalDate date = LocalDate.parse(request.getParameter("date"));
            
            DB db = new DB();
            Company company = db.findCompany(id);
            company.setName(name);
            company.setDate(date);                        
            
            response.sendRedirect("CompanyList");
    }
  
}
