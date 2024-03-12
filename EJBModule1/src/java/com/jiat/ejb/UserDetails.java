/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jiat.ejb;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 *
 * @author Thilini
 */

@Stateful
public class UserDetails implements UserDetailsBeanRemote{

    public UserDetails() {
        System.out.println("UserDetails init..."+this);
    }
    
    
    
    @Override
    public String getFullName(){
    return "A.R.M.Hazeem"+ " "+this;
    }
}
