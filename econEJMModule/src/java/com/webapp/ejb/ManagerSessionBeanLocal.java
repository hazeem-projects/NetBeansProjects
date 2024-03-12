/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.webapp.ejb;

import com.webapp.entity.Managers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thilini
 */
@Local
public interface ManagerSessionBeanLocal {

    void registerManager(Managers manager);

    List getAllManagers();

    void updateManagers(Managers manager);

    void deleteManagers(Managers managers);

Managers getByIdManager(Integer id);
    
}
