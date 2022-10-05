package queue_app;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Demo: how to use linked list based queue in Java API:
 *       Queue interface, LinkedList classes in java.util package.
 * There is no problem here for using LinkedList as  Queue
 *    because we use Queue interface in the declaration of the queue variable studentsQueue.
 * 
 * @author Cindy
 */
public class SimpleLinkedQueueTest {

    public static void main(String[] args) {        
        //Create an empty linked list based queue and make studentsQueue reference it.        
        Queue<String> studentsQueue = new LinkedList<>();  

        //add to the queue: enqueue
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

        //take out the first in the queue: dequeue
        System.out.println("first in queue (removed): " + studentsQueue.poll());
        System.out.println(studentsQueue); //call toString()
    }

}

/* ---Program Output----
[James]
[James, Tom]
[James, Tom, Jane]
[James, Tom, Jane, steve]
first in queue: James
[James, Tom, Jane, steve]
first in queue (removed): James
[Tom, Jane, steve]
*/