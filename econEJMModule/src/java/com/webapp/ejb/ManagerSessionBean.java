/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.webapp.ejb;

import com.webapp.entity.Managers;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thilini
 */
@Stateless
public class ManagerSessionBean implements ManagerSessionBeanRemote, ManagerSessionBeanLocal {

    
    @PersistenceContext(unitName = "econEJMModulePU")
    private EntityManager em;
    
    
    @Override
    public void registerManager(Managers manager) {
        em.persist(manager);
        
        
    }
    

    @Override
    public List<Managers> getAllManagers() {
        return em.createQuery("SELECT m FROM Managers m", Managers.class).getResultList();
    }

    @Override
    public void updateManagers(Managers manager) {
        em.merge(manager);
    }

    @Override
    public void deleteManagers(Managers managers) {
        em.remove(managers);
    }

    @Override
    public Managers getByIdManager(Integer id) {
        return em.find(Managers.class, id);
    }
    
    
    
    
    
    
}
