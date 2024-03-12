/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.webapp.ejb;

import java.sql.Time;
import java.util.Date;
import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.ScheduleExpression;
import javax.ejb.Schedules;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.Timer;

/**
 *
 * @author Thilini
 */
@Stateless
public class TimerSessionBean implements TimerSessionBeanRemote, TimerSessionBeanLocal {

       @Resource
    private SessionContext context;
    
    
    @Schedules({
        @Schedule(persistent = false,dayOfWeek = "*", month = "*", hour = "*", dayOfMonth = "*", year = "*", minute = "*", second = "*"),
        @Schedule(persistent = false,dayOfWeek = "*", month = "*", hour = "*", dayOfMonth = "*", year = "*", minute = "*", second = "*"),
        @Schedule(persistent = false,dayOfWeek = "*", month = "*", hour = "*", dayOfMonth = "*", year = "*", minute = "*", second = "*"),
    })

    @Override
    public void myTimer(Timer timer) {
        System.out.println("Timer event: " + new Date());
        timer.cancel();
    }

    @Override
    public void createTimer(long duration) {
        ScheduleExpression se = new ScheduleExpression();
        se.hour("*");
        se.minute("*");
        se.second("*/"+duration);
        Timer timer = context.getTimerService().createCalendarTimer(se);
    }

   

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
