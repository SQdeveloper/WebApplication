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

/**
 *
 * @author PC
 */
@WebServlet(urlPatterns = {"/UpdateFormCompany"})
public class UpdateFormServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String paramId = request.getParameter("id");
            int id = Integer.parseInt(paramId);
            
            DB db = new DB();
            Company company = db.findCompany(id);
            
            RequestDispatcher rd = request.getRequestDispatcher("UpdateCompanyForm.jsp");
            request.setAttribute("cp", company);
            rd.forward(request, response);
    }
  
}
