/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.webapp.ejb.WorkerSessionBeanRemote;
import com.webapp.entity.Workers;
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
@WebServlet(urlPatterns = {"/registerWorkers"})
public class registerWorkers extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
          try {
            InitialContext ic = new InitialContext();
            WorkerSessionBeanRemote worker = (WorkerSessionBeanRemote) ic.lookup("com.webapp.ejb.WorkerSessionBeanRemote");
            
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String nic = req.getParameter("nic");
            String contactno = req.getParameter("contactno");
            String address = req.getParameter("address");
            String department = req.getParameter("department");

            
             Workers workers   = new Workers();
            workers.setName(name);
            workers.setEmail(email);
            workers.setAddress(address);
            workers.setContactnumber(contactno);
            workers.setDepartment(department);
            workers.setNIC(nic);
           
            
            worker.registerWorker(workers);
            
            resp.sendRedirect("worker.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

 
}
