/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class NewCompanyForm implements Action {
    
    public String execute(HttpServletRequest request, HttpServletResponse response) {        
        return "forward:NewCompanyForm.jsp";
    }
}
