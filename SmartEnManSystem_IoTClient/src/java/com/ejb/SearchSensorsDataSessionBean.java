/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejb;

import java.util.HashMap;

/**
 *
 * @author Thilini
 */
public interface SearchSensorsDataSessionBean {
    
     HashMap<String, HashMap<String, String>> searchSensorsDataSessionBean(String searchtype, String search, String fromdate, String todate);
}
