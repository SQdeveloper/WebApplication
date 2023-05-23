/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.alura.servlets;

import com.alura.actions.CompanyList;
import com.alura.actions.NewCompany;
import com.alura.actions.Remove;
import com.alura.actions.Update;
import com.alura.actions.UpdateForm;
import com.alura.db.DB;
import com.alura.models.Company;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
/**
 *
 * @author PC
 */
@WebServlet(urlPatterns = {"/entry"})
public class uniqueEntryServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        
        if(action.equals("RemoveCompany")){
            Remove nc = new Remove();
            nc.execute(request, response);
        }else if(action.equals("UpdateCompany")) {
            Update uc = new Update();
            uc.execute(request, response);
        }else if(action.equals("NewCompany")) {
            NewCompany nc = new NewCompany();
            nc.execute(request, response);
        }else if(action.equals("CompanyList")) {
            CompanyList cl = new CompanyList();
            cl.execute(request, response);
        }else if(action.equals("UpdateForm")) {
            UpdateForm uf = new UpdateForm();
            uf.execute(request, response);
        }
    }
}
