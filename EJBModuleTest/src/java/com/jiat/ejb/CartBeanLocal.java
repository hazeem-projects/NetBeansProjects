/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.jiat.ejb;

import javax.ejb.Local;

/**
 *
 * @author Thilini
 */
@Local
public interface CartBeanLocal {

    String addToCart(String name, Integer qty);
    
}
