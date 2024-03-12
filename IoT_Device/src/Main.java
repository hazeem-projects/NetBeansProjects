
import com.ejb.InsertSensorsDataSessionBeanRemote;
import javax.ejb.EJB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thilini
 */
public class Main {
    
     
    @EJB
   private static InsertSensorsDataSessionBeanRemote insertSensorsDataSessionBeanRemote;
    
    public static void main(String[] args) {
        
        String reponse = insertSensorsDataSessionBeanRemote.insertSensorsDataSessionBeans("30", "40", "50", "2020-12-01", "09:31:51");
        System.out.println(reponse);
    }
}
