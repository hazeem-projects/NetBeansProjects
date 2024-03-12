/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.webapp.ejb;

import com.webapp.entity.AdminLogin;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Thilini
 */
@Stateless
public class AdminSessionBean implements AdminSessionBeanRemote, AdminSessionBeanLocal {

    
    @PersistenceContext(unitName = "econEJMModulePU")
    private EntityManager em;
    
    @Override
    public String loginAdmin(AdminLogin adminLogin) {
        
          TypedQuery<AdminLogin> query = em.createQuery("SELECT a FROM AdminLogin a WHERE a.username=:username and u.password=:password",AdminLogin.class);
        query.setParameter("username", adminLogin.getUsername());
        query.setParameter("password", adminLogin.getPassword());
        AdminLogin adminLogin1 = query.getSingleResult();
        
        return "Login success";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    

   
    
}
