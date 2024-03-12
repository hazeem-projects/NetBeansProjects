/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package com.webapp.ejb;

import com.webapp.entity.AdminLogin;
import javax.ejb.Remote;


@Remote
public interface AdminSessionBeanRemote {

    String loginAdmin(AdminLogin adminLogin);
    
}
