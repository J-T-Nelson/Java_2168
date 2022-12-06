package Lab_4_helper_files.queue_app;

import java.util.LinkedList;

/**
 * Demo: not-so-good way of using linked list based queue in Java API
 * @author Cindy
 */
public class SimpleLinkedQueueTest2 {

    public static void main(String[] args) {
        //not good to use the line below because it allows the program to call methods only intended for a general linked list like get(index)      
        //Create an empty linked list based queue and make studentsQueue reference it.        
        LinkedList<String> studentsQueue = new LinkedList<>();   

        //add to the queue
        studentsQueue.offer("James");
        System.out.println(studentsQueue);  //call toString()        
        studentsQueue.offer("Tom");
        System.out.println(studentsQueue);  //call toString()
        studentsQueue.offer("Jane");
        System.out.println(studentsQueue);  //call toString()        
        studentsQueue.offer("steve");
        System.out.println(studentsQueue);  //call toString()        

        //examine the first in the queue
        System.out.println("first in queue: " + studentsQueue.peek());
        System.out.println(studentsQueue); //call toString()        

        //take out the first in the queue
        System.out.println("first in queue (removed): " + studentsQueue.poll());
        System.out.println(studentsQueue); //call toString()

       //The following line works here. But get(index) is not intended for a Queue data structure.
       System.out.println("Using Get(2): ");
       System.out.println(studentsQueue.get(2));
    }

}

/* ---Program Output ----
[James]
[James, Tom]
[James, Tom, Jane]
[James, Tom, Jane, steve]
first in queue: James
[James, Tom, Jane, steve]
first in queue (removed): James
[Tom, Jane, steve]
Using Get(2): 
steve
*/