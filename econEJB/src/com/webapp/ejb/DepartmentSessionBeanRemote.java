/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package com.webapp.ejb;

import com.webapp.entity.Department;
import java.util.List;
import javax.ejb.Remote;


@Remote
public interface DepartmentSessionBeanRemote {

    void registerDepartment(Department department);
    
//        void update(Employee student);
//    
//    void delete (Employee student);
//    
//    Employee findById(Integer studentId);
//    
//    Employee findByEmail(String email);
//    
//    List<Employee> getAll();

    List getAllDepartment();

}
