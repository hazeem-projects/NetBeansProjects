
import javax.annotation.Resource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thilini
 */
public class Main {
    
    @Resource(lookup = "myQueueConnectionFactory")
    private QueueConnectionFa queueConnectionFactory;
    
    @Resource(lookup = "myQueue")
    private Queue queue;
    
    
    
    
}
