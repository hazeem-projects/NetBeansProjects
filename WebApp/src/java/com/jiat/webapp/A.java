/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.jiat.webapp;

import com.jiat.ejb.CartBeanRemote;
import com.jiat.ejb.UserDetailsBeanRemote;
import java.io.IOException;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thilini
 */
@WebServlet(name = "A", urlPatterns = {"/A"})
public class A extends HttpServlet {
    
//    @EJB
//    UserDetailsBeanRemote userDetailsBeanRemote;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      
//        UserDetailsBeanRemote userDetailsBeanRemote=null;
//        
//        
//        
//        if(request.getSession().getAttribute("UserBean")==null){
//            try {
//                InitialContext ic=new InitialContext();
//       userDetailsBeanRemote =(UserDetailsBeanRemote) ic.lookup("java:global/EJBModule1/UserDetails!com.jiat.ejb.UserDetailsBeanRemote");
//        
//       request.getSession().setAttribute("UserBean", userDetailsBeanRemote);
//            } catch (Exception e) {
//            }
//            
//        }else{
//       userDetailsBeanRemote =(UserDetailsBeanRemote) request.getSession().getAttribute("UserBean");
//        
//        }
//        
//        
//        try {
//            
//        
//        String fullName = userDetailsBeanRemote.getFullName();
//        response.getWriter().write(fullName);
//        } catch (Exception e) {
//        }
try {
            InitialContext context=new InitialContext();
       CartBeanRemote cartBeanRemote =(CartBeanRemote) context.lookup("java:global/EJBModuleTest/CartBean!com.jiat.ejb.CartBeanRemote");
             String addToCart=cartBeanRemote.addToCart("Apple", 10);
             response.getWriter().write(addToCart);
        } catch (Exception e) {
        }
       
    }

    
    
}
