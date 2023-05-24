/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.actions;

import com.alura.db.DB;
import com.alura.models.Company;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author PC
 */
public class UpdateForm implements Action {
    
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramId = request.getParameter("id");
        int id = Integer.parseInt(paramId);

        DB db = new DB();
        Company company = db.findCompany(id);
        
        request.setAttribute("cp", company);        
        return "forward:UpdateCompanyForm.jsp";
    }
}
