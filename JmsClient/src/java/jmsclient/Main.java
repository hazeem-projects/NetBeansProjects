/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jmsclient;

import javax.jms.Connection;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.InitialContext;

/**
 *
 * @author Thilini
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            InitialContext ic=new InitialContext();
            TopicConnectionFactory factory = (TopicConnectionFactory) ic.lookup("myTopicConnectionFactory");
            TopicConnection c = (TopicConnection) factory.createConnection();
            c.start();
            TopicSession session = c.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            
           Topic topic = (Topic) ic.lookup("myTopic");
            TopicSubscriber subscriber = session.createSubscriber(topic);
            subscriber.setMessageListener(new MessageListener() {
                @Override
                public void onMessage(Message message) {
                     // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            
                    try {
                        String body = message.getBody(String.class);
                        System.out.println(body);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
                }
            });
            
            
            
        
        
        } catch (Exception e) {
        }
    }
    
}
