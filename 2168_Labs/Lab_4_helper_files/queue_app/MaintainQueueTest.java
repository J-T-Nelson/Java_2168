package Lab_4_helper_files.queue_app;

/** 
 * Demo: how to use the services provided by class MaintainQueue.
 * Code not in the textbook.
 * Simulate handling a customer line in a bank and in a restaurant.
 * 
 * @author cindy
 */
public class MaintainQueueTest {

    public static void main(String[] args) {
        //simulate a line in a bank
        MaintainQueue bankLineHandler = new MaintainQueue();
        bankLineHandler.processCustomers();
        
        //simulate a line in a restaurant        
        MaintainQueue restaurantLineHandler = new MaintainQueue();
        restaurantLineHandler.processCustomers();        
    }    
    
}
