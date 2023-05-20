/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.alura.servlets;

import com.alura.db.DB;
import com.alura.models.Company;
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
@WebServlet(urlPatterns = {"/NewCompany"})
public class NewCompanyServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String name = request.getParameter("name");
            String paramDate = request.getParameter("date");
            LocalDate date = LocalDate.parse(paramDate);
                        
            Company company = new Company(name, date);
            DB db = new DB();
            db.addCompany(company);
            
            response.sendRedirect("CompanyList");
        
    }

}
