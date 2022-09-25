//ManageStudents.java (Code not in textbook.)
//* Use java.util.LinkedList to manage students in a course section like cis2168 sec 003
//* Create and populate a linked list of Student objects
//* Display the information of each student in the linked list
//* Find and display a specific student's grade based on a given first name
//* Remove a student from the linked list (delete by content)
//* Display the location of a specific student in the linked list

package linkedlist_app;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author cindy
 */
public class ManageStudents {

    public static void main(String[] args) {
        //Create 3 Student objects and have variables s1, s2, s3 referencing them
        Student s1 = new Student(111, "Joe", "Biden", 85);
        Student s2 = new Student(222, "Steve", "Jobs", 80);
        Student s3 = new Student(333, "Taylor", "Swift", 90);
        
        //Create an empty linked list of Student objects, and 
        //  have reference variable students2168 referencing it.
        List<Student> students2168 = new LinkedList<>();        

        //populate the linked list students2168 by 
        //  appending these 3 Student objects        
        students2168.add(s1);
        students2168.add(s2);
        students2168.add(s3);
        System.out.println(students2168);

        System.out.println("\nStudents in linked list students2168: ");        
        //display each student in the linked list
        for (int i = 0; i < students2168.size(); i++) {
            Student currentStudent = students2168.get(i);
            //implicitly call toString() in Student class.
            System.out.println((i+1) + ", " + currentStudent); 
        }
        System.out.println();

        //find and display Steve's grade
        System.out.print("Steve's grade: ");
        for (Student s : students2168) {
            // if current student's first name is Steve
            if (s.getFirstName().equals("Steve")) {
                System.out.println(s.getGrade());
                System.out.println();
                break;
            }
        }

        //remove from the linked list the Student object referenced by s2
        students2168.remove(s2);
        //For verification/debugging:
        //   display each student information in the linked list after deletion
        System.out.println("after removing s2: ");
        System.out.println(students2168);

        //find and display the location of specific Student objects in the linked list
        System.out.println("\nLocation of s3, s2: ");
        System.out.println(students2168.indexOf(s3));
        System.out.println(students2168.indexOf(s2));
    }
}

/*---- Program Output:
[Student{id=111, firstName=Joe, lastName=Biden, grade=85.0}, Student{id=222, firstName=Steve, lastName=Jobs, grade=80.0}, Student{id=333, firstName=Taylor, lastName=Swift, grade=90.0}]

Students in linked list students2168: 
1, Student{id=111, firstName=Joe, lastName=Biden, grade=85.0}
2, Student{id=222, firstName=Steve, lastName=Jobs, grade=80.0}
3, Student{id=333, firstName=Taylor, lastName=Swift, grade=90.0}

Steve's grade: 80.0

after removing s2: 
[Student{id=111, firstName=Joe, lastName=Biden, grade=85.0}, Student{id=333, firstName=Taylor, lastName=Swift, grade=90.0}]

Location of s3, s2: 
1
-1
*/