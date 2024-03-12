/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package com.webapp.ejb;

import com.webapp.entity.Managers;
import java.util.List;
import javax.ejb.Remote;


@Remote
public interface ManagerSessionBeanRemote {

    void registerManager(Managers manager);

    List getAllManagers();

    void updateManagers(Managers manager);

   void deleteManagers(Managers managers);

   Managers getByIdManager(Integer id);
    
}
