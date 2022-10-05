//SimpleArrayQueueTest.java


package queue_app;

import java.util.Queue;
import java.util.ArrayDeque;

/**
 * Demo: how to use array list based queue data structure in Java API:
 *      Queue interface, ArrayDeque class in java.util package.
 * 
 * @author Cindy
 */
public class SimpleArrayQueueTest {

    public static void main(String[] args) {
        //Create an empty array list based queue and make studentsQueue reference it.
        Queue<String> studentsQueue = new ArrayDeque<>();    

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