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
public class InSensorsDataSessionBean implements InSensorsDataSessionBeanLocal,InSensorDataBeanRemote {

    @Override
    public String getName() {
        return "Working fine...";
    }

    @Override
    public String nameget() {
        return "A.R.M.Hazeem";
    }

    
}
