package assign2_io_demo;

import java.util.Scanner;

/**
 *
 * @author cindy
 */
public class BasicInputDemo {
      public static void main(String[] args) {
          Scanner kb = new Scanner(System.in);
          
          //read an int value
          System.out.println("Enter student id (integer): ");
          int id = kb.nextInt();         
          System.out.println("The number is: " + id);

          //read a string value that does not contain blanks
          System.out.println("Enter first name: ");
          String firstName = kb.next();

          //read a double value
          System.out.println("Enter the grade: ");
          double grade = kb.nextDouble();                  
          
          String lastName = "Jobs";
          Student s = new Student(id, firstName,lastName, grade);
          System.out.println("The new student is: \n" + s);
      }
}
