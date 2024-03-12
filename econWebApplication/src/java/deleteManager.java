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
@WebServlet(urlPatterns = {"/deleteManager"})
public class deleteManager extends HttpServlet {

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    
        String id = req.getParameter("id");

        try {
            InitialContext ic = new InitialContext();
            ManagerSessionBeanRemote mssbr = (ManagerSessionBeanRemote) ic.lookup("com.webapp.ejb.ManagerSessionBeanRemote");

          Managers m  =mssbr.getByIdManager(Integer.valueOf(id));
            mssbr.deleteManagers(m);
            resp.sendRedirect("manager.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    }

}
