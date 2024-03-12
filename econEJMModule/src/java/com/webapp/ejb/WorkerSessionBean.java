/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.webapp.ejb;

import com.webapp.entity.Managers;
import com.webapp.entity.Workers;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thilini
 */
@Stateless
public class WorkerSessionBean implements WorkerSessionBeanRemote, WorkerSessionBeanLocal {

    
          @PersistenceContext(unitName = "econEJMModulePU")
    private EntityManager em;
    
    
    @Override
    public void registerWorker(Workers worker) {
        
        em.persist(worker);
    }

    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void updateWorker(Workers worker) {
        em.merge(worker);
    }

    @Override
    public void deleteWorker(Workers workers) {
        em.remove(workers);
    }

    @Override
    public List<Workers> getAllWorkers() {
        return em.createQuery("SELECT w FROM Workers w", Workers.class).getResultList();
    }
    
   

    @Override
    public Workers getByIdWorker(Integer id) {
    
      return em.find(Workers.class, id);
    
    }
    
    
    
}
