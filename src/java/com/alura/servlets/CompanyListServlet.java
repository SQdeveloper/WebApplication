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
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author PC
 */
@WebServlet(urlPatterns = {"/CompanyList"})
public class CompanyListServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {            
            
            List<Company> companies = DB.getCompanies();            
            
            RequestDispatcher rd = request.getRequestDispatcher("CompaniesList.jsp");           
            request.setAttribute("companies", companies);
            rd.forward(request, response);            
    }  
}
