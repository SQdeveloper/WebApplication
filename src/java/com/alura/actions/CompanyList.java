/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.actions;

import com.alura.db.DB;
import com.alura.models.Company;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author PC
 */
public class CompanyList {
    
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Company> companies = DB.getCompanies();            

        RequestDispatcher rd = request.getRequestDispatcher("CompaniesList.jsp");           
        request.setAttribute("companies", companies);
        rd.forward(request, response);   
    }
}
