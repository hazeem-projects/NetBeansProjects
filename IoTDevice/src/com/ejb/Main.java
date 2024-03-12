/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejb;

import javax.ejb.EJB;

/**
 *
 * @author Thilini
 */
public class Main {
 
    
    
    @EJB
    private static  InsertSensorsDataSessionBeanRemote insertSensorsDataSessionBeanRemote;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insertSensorsDataSessionBeanRemote.insertSensorsDataSessionBeans("30", "40", "60","2020-12-01", "09:31:51");
    }

}
