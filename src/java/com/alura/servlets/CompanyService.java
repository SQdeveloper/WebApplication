/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.alura.servlets;

import com.alura.db.DB;
import com.alura.models.Company;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


/**
 *
 * @author PC
 */
@WebServlet(name = "CompanyService", urlPatterns = {"/CompanyService"})
public class CompanyService extends HttpServlet {
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        List<Company> companyList = DB.getCompanies();
        
        
        XStream xstream = new XStream();
        xstream.alias("company", Company.class);
        String xml = xstream.toXML(companyList);
        response.setContentType("Application/xml");
        response.getWriter().print(xml);
        
//        Gson gson = new Gson();
//        String json = gson.toJson(companyList);
//        response.setContentType("Application/json");
//        response.getWriter().print(json);
    }
}
