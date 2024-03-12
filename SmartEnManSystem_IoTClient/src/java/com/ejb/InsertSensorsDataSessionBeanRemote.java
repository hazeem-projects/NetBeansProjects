/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejb;

import javax.ejb.Remote;

/**
 *
 * @author Thilini
 */
@Remote
public interface InsertSensorsDataSessionBeanRemote {
    
    String insertSensorsDataSessionBeans(String voltage, String frequency,String current,String date, String time);
    
}
