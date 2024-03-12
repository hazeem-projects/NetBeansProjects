/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.jiat.jmswebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnectionFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thilini
 */
@WebServlet(name = "SendMessage", urlPatterns = {"/SendMessage"})
public class SendMessage extends HttpServlet {
    
    
    @Resource(lookup = "myTopicConnectionFactory")
    TopicConnectionFactory Factory;
    
    @Resource(lookup = "myTopic")
    Topic topic;
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("message");
        
        
        try {
          Connection c = Factory.createConnection();
            Session s = c.createSession(false, Session.DUPS_OK_ACKNOWLEDGE);
            MessageProducer producer = s.createProducer(topic);
            TextMessage tm = s.createTextMessage();
            
            tm.setText(message);
            
            producer.send(tm);
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

}
