// CIS2168
// Section: 003
// Assignment 4
//File: HiringApp.java. 
// Author: Jon Tanner Nelson, Email: jon.tanner.nelson@temple.edu

//Assign 4, HiringApp
package Lab_4;

import java.util.ArrayDeque;
//import java.util.Queue;
import java.util.Deque;
import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HiringApp {

    public static void main(String[] args) throws InterruptedException {

        //Define the data structures for 3 different groups of people:
        //  new applicants
        //  current employees (those who were hired), 
        //  past employees (those who were fired)
        //
        //Hint: for queue: Queue<Person>,  ArrayDeque, LinkedList
        //      for stack: Deque<Person>   ArrayDeque, LinkedList
        
        Deque<Person> currentEmployees = new ArrayDeque<Person>();
        Deque<Person> newTalent = new ArrayDeque<Person>();
        Deque<Person> firedEmployees = new ArrayDeque<Person>();

        //display the menu
        boolean cont = true;
        while(cont){

            int userResponse = getUserChoice(); //
            switch(userResponse){ // need to ensure that currentEmployees is FILO and that the other structures are FIFO 
                case 1: // accept app
                    newTalent.add(getApplication());        
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.println("...");
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.println("...");
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.println("Alright, " + newTalent.getLast().getName() + " has been added to the applicant pool.");    
                    TimeUnit.MILLISECONDS.sleep(2000);
                    break;
                case 2: // hire
                    if(!firedEmployees.isEmpty()){
                        currentEmployees.add(firedEmployees.poll());
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("...");
                        System.out.println("We looked into our previous employees and found: " + currentEmployees.peekLast().getName()+ 
                                           "Who is really quite excited to begin working again!");
                        TimeUnit.SECONDS.sleep(2);
                    } else if(!newTalent.isEmpty()) {
                            currentEmployees.add(newTalent.poll());
                            TimeUnit.MILLISECONDS.sleep(1500);
                            System.out.println("...");
                            System.out.println("We looked into our applicant pool and found: " + currentEmployees.peekLast().getName()+ 
                                           "Oh they do seem eager to get started.");
                            TimeUnit.SECONDS.sleep(2);
                    } else {
                        TimeUnit.MILLISECONDS.sleep(500);
                        System.out.println("...");
                        System.out.println("There are no previous employees or new applicants to hire right now."+
                                              "\nYou should t-take a look at some new applications!");
                        TimeUnit.SECONDS.sleep(3);
                    } 
                    break;
                case 3: // fire
                    if(!currentEmployees.isEmpty()){
                        firedEmployees.add(currentEmployees.removeLast());
                        System.out.println("We fired: " + firedEmployees.getLast().getName() + "He was sad to go, and would probably come back for less pay!");
                    } else {
                        System.out.println("...");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("...");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("...");
                        System.out.println("There are NO employees at the company right now man, you really shouldn't be thinking about firing people.");
                        TimeUnit.SECONDS.sleep(2);
                    }
                    break;
                case 4: // quit
                    System.out.println("Terminating Hiring App");
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.println("...");
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.println("...");
                    TimeUnit.MILLISECONDS.sleep(500);
                    cont = false;
                    break;
            }
        }
         
        //get the menu choice
        
        //process user selected service request.
        
        //loop until the user decides to quit.
        
    }

    //other methods for code modularization
    //method for getting user choice
    public static int getUserChoice() {

        @SuppressWarnings("resource")
        Scanner userInput = new Scanner(System.in);
        displayMenu();
      
        while(!userInput.hasNextInt()){ // not sure if this block will work to correct for bad input. Does next() advance the scanner? 
            userInput.next();
        }
        int choice = userInput.nextInt();

        return choice;
    }

    private static void displayMenu(){
        System.out.println("\nWelcome to the Hiring App, please choose your next action by pressing '1' '2' '3' or '4':\n\n"+
                           "\n1. Accept an application\n2. Hire sombody!\n3. Fire an employee\n4. Quit out of the application");
        return;
    }

    //method for accepting an applicant and reurn this applicant as a Person object
    public static Person getApplication() {

        @SuppressWarnings("resource")
        Scanner userInput = new Scanner(System.in);
        //display prompt for user to enter an applicant's name
        //get user input
        System.out.println("Enter the applicants name: ");
        String name = userInput.nextLine();
        //display prompt for user to enter an applicant's degree
        //get user input
        System.out.println("Enter the applicants degree: ");
        String degree = userInput.nextLine();
        //display prompt for user to enter an applicant's skill list
        //  (first how many skills, then enter skill one by one)
        //use a loop to get each skill
        System.out.println("Enter the number of skills which the user would like to enter for their skill set: ");
        while(!userInput.hasNextInt()){ // not sure if this block will work to correct for bad input. Does next() advance the scanner? 
            userInput.next();
        }
        int skillNum = userInput.nextInt();
        userInput.nextLine(); // consuming next line to allow proper input following this point
//        String[] skills = new String[skillNum]; 
        ArrayList<String> skills = new ArrayList<>();
        for(int i = 1; i <= skillNum; i++){
            System.out.println("Enter skill #" + i + ": ");
            skills.add(userInput.nextLine());
        }
        //create a Person object using the name, degree, skill list
        //and return this Person object
        Person newApplicant = new Person(name, degree, skills);
        
        return newApplicant;
    }

    //You can either implement hire and fire functionalities in main(...),
    //   or implement them here as separate methods:
    //hire method
    //fire method
}

/* NOTES ON ArrayDeque vs Queue
 *  Really cool and different from R in how java has various implementations of data structures. Deque is just an interface, which is to say it isn't an object but rather
 *  a specified set of behaviors (methods) which an object implementing the interface must posses. This allows the flexible implementation of Deque as both a LinkedList and 
 *  as an Array (of sorts), known as the ArrayDeque. Thus the same actions are enabled accross fundamentally different data structures which allows for more specificity when
 *  making choices about data structures generally. 
 * 
 *  Interesting to see the modular design run so deep, as its actually not necessary for basic use of a language, but seems necessary for large scale apps which demand optimal performance. 
 */
