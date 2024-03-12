/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Thilini
 */
@Stateless
public class InsertSensorsDataSessionBean implements InsertSensorsDataSessionBeanLocal,InsertSensorsDataSessionBeanRemote {

    @Override
    public String insertSensorsDataSessionBeans(String voltage, String frequency, String current, String date, String time) {
        String response = "failed";

        try {
//            DB.DB.iud("INSERT INTO sensorsdata (voltage,frequency,current,date,time) "
//                    + "VALUES('" + voltage + "','" + frequency + "','" + current + "','" + date + "','" + time + "')");

            response = "success";

        } catch (Exception e) {
            response = "failed";
            e.printStackTrace();
        }

        return response;

        
    }

    
}
