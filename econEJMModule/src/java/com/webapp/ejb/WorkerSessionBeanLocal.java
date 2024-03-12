/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.webapp.ejb;

import com.webapp.entity.Workers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thilini
 */
@Local
public interface WorkerSessionBeanLocal {

    void registerWorker(Workers worker);

    void updateWorker(Workers worker);

    void deleteWorker(Workers workers);

    List getAllWorkers();
    Workers getByIdWorker(Integer id);
    
}
