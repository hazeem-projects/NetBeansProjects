/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.webapp.ejb;

import com.webapp.entity.Department;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thilini
 */
@Stateless
public class DepartmentSessionBean implements DepartmentSessionBeanRemote, DepartmentSessionBeanLocal {

   
       @PersistenceContext(unitName = "econEJMModulePU")
    private EntityManager em;
    
    @Override
    public void registerDepartment(Department department) {
        em.persist(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return em.createQuery("SELECT d FROM Department d", Department.class).getResultList();
    }

    
}
