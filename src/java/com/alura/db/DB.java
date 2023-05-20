/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.db;

import com.alura.models.Company;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author PC
 */
public class DB {
    
    private static int number = 0;
    private static List<Company> companies = new ArrayList<>();
    
    static {
        Company company1 = new Company("alura", LocalDate.now());
        Company company2 = new Company("stark", LocalDate.now());
        Company company3 = new Company("tesla", LocalDate.now());
        Company company4 = new Company("google", LocalDate.now());
        
        company1.setId(number++);
        company2.setId(number++);
        company3.setId(number++);
        company4.setId(number++);
        
        DB.companies.add(company1);
        DB.companies.add(company2);
        DB.companies.add(company3);
        DB.companies.add(company4);
    }
    
    public static List<Company> getCompanies() {
        return companies;
    }

    public void addCompany(Company company) {
        company.setId(number++);
        DB.companies.add(company);
    }

    public Company findCompany(int id) {
        for(Company cp : companies) {
            if(cp.getId() == id) {
                return cp;
            }
        }
        return null;
    }

    public void removeCompany(int id) {
        
        Iterator<Company> it = companies.iterator();
        
        while(it.hasNext()) {
            Company cp = it.next();
            if(cp.getId() == id) {
                it.remove();                                                
            }
        }
    }
}
