/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.webapp.ejb.DepartmentSessionBeanRemote;
import com.webapp.entity.Department;
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
@WebServlet(urlPatterns = {"/registerDepartment"})
public class registerDepartment extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
               try {
            InitialContext ic = new InitialContext();
            DepartmentSessionBeanRemote dep = (DepartmentSessionBeanRemote) ic.lookup("com.webapp.ejb.DepartmentSessionBeanRemote");
            
            String name = req.getParameter("name");

            
             Department department   = new Department();
            department.setName(name);
           
            
            dep.registerDepartment(department);
            
            resp.sendRedirect("department.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
