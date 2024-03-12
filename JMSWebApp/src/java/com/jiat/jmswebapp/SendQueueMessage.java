/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.jiat.jmswebapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thilini
 */
@WebServlet(name = "SendQueueMessage", urlPatterns = {"/SendQueueMessage"})
public class SendQueueMessage extends HttpServlet {
    
    
    @Resource(lookup = "myQueueConnectionFactory")
    private QueueConnectionFactory queueConnectionFactory;
    
    @Resource(lookup = "myQueue")
    private Queue queue;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String message = req.getParameter("message");
        try {
            QueueConnection q = queueConnectionFactory.createQueueConnection();
            QueueSession session = q.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            
            QueueSender sender = session.createSender(queue);
            TextMessage tm = session.createTextMessage(message);
            sender.send(tm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

   
}
