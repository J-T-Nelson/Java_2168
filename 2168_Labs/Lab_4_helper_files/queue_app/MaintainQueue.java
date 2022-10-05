package queue_app;

/*<listing chapter="4" number="11">*/

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Class to maintain a queue of customers.
 * Note: I used a do while loop in the video.
 * @author Koffman & Wolfgang & Cindy
 **/
public class MaintainQueue {

    // Data Field
    private final Queue<String> customers;
    private final Scanner in;

    // Constructor
    /** Create an empty queue. */
    public MaintainQueue() {
        //create an empty linked list based queue for storing the customers
        customers = new LinkedList<>();
        in = new Scanner(System.in);
    }
    
    /*</listing>*/
    /*<listing chapter="4" number="11">*/
    
    /**
     * Performs the operations selected on queue customers.
     * @pre  customers has been created.
     * @post customers is modified based on user selections.
     */
    public void processCustomers() {
        String choice = "";
        String[] choices = {
            "add", "peek", "remove", "size", "position", "quit"};

        // Perform all operations selected by user.
        do {
            // Process the current choice.
            try {
                String name;
                System.out.println("Chose from the list: "
                        + Arrays.toString(choices));
                choice = in.nextLine();
                switch (choice) {
                    case "add": //add a customer to the end of the line
                        System.out.println("Enter new customer name");
                        name = in.nextLine();
                        customers.offer(name);
                        System.out.println(
                                "Customer " + name
                                + " added to the queue");
                        break;
                    case "peek": //check who's the first in the line and the next to be served
                        System.out.println(
                                "Customer " + customers.element()
                                + " is next in the queue");
                        break;
                    case "remove":
                        System.out.println(
                                "Customer " + customers.remove()
                                + " removed from the queue");
                        break;
                    case "size": //how many customers in the line
                        System.out.println(
                                "Size of queue is " + customers.size());
                        break;
                    case "position": //find the position of a given customer in the line
                        System.out.println("Enter customer name");
                        name = in.nextLine();
                        int countAhead = 0;
                        for (String nextName : customers) { //enhanced for loop
                            if (!nextName.equals(name)) { //not the target customer
                                countAhead++;
                            } else {
                                System.out.println(
                                        "The number of customers ahead of "
                                        + name + " is " + countAhead);
                                break; // Customer found, exit loop.
                            }
                        }

                        // Check whether the target customer was found.
                        if (countAhead == customers.size()) {
                            System.out.println(
                                    name + " is not in queue");
                        }
                        break;
                    case "quit":
                        System.out.println(
                                "Leaving customer queue. "
                                + "\nNumber of customers in queue is "
                                + customers.size());
                        break;
                    default:
                        System.out.println("Invalid choice -- try again");
                } // end switch
            } catch (NoSuchElementException e) {
                System.out.println("The Queue is empty");
            } // end try-catch
            
        } 
        while (!choice.equals("quit"));
    }    
    /*</listing>*/
    
}
