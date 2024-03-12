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
@WebServlet(urlPatterns = {"/deleteWorker"})
public class deleteWorker extends HttpServlet {

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String id = req.getParameter("id");

        try {
            InitialContext ic = new InitialContext();
            WorkerSessionBeanRemote mssbr = (WorkerSessionBeanRemote) ic.lookup("com.webapp.ejb.WorkerSessionBeanRemote");

          Workers w  =mssbr.getByIdWorker(Integer.valueOf(id));
            mssbr.deleteWorker(w);
            resp.sendRedirect("worker.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    }
    
    }
    
    
    

       


