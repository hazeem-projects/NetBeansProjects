/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.webapp.ejb.ManagerSessionBeanRemote;
import com.webapp.entity.Managers;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/registerManagers"})
public class registerManagers extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    
                  try {
            InitialContext ic = new InitialContext();
            ManagerSessionBeanRemote manager = (ManagerSessionBeanRemote) ic.lookup("com.webapp.ejb.ManagerSessionBeanRemote");
            
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String nic = req.getParameter("nic");
            String contactno = req.getParameter("contactno");
            String address = req.getParameter("address");
            String department = req.getParameter("department");

            
             Managers managers   = new Managers();
            managers.setName(name);
            managers.setEmail(email);
            managers.setAddress(address);
            managers.setContactnumber(contactno);
            managers.setDepartment(department);
            managers.setNIC(nic);
           
            
           manager.registerManager(managers);
            
            resp.sendRedirect("manager.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    }

    
}
