/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jiat.ejb;

import javax.ejb.Remote;

/**
 *
 * @author Thilini
 */
@Remote
public interface UserDetailsBeanRemote {
    public String getFullName();
}
