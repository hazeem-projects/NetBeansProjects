/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.webapp.ejb;

import javax.ejb.Local;
import javax.ejb.Timer;

/**
 *
 * @author Thilini
 */
@Local
public interface TimerSessionBeanLocal {
      public void myTimer(Timer timer);
    
    public void createTimer(long duration);
}
