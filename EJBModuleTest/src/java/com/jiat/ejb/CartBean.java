/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.jiat.ejb;

import javax.ejb.Stateful;

/**
 *
 * @author Thilini
 */
@Stateful
public class CartBean implements CartBeanRemote, CartBeanLocal {

    @Override
    public String addToCart(String name, Integer qty) {
        return name+""+qty;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    
}
