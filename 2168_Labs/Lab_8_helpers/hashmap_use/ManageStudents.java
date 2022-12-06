//ManageStudents.java
//*Use a HashMap to store students in a course like cis2168
//*Perform basic insertion, search, and deletions

package Lab_8_helpers.hashmap_use;

import java.util.Map;
import java.util.HashMap;

public class ManageStudents {

    public static void main(String[] args) {
        //create an empty HashMap for storing the students in a course
        Map<Integer, Student> students2168 = new HashMap<>();
        
        //create 3 students
        Student s1 = new Student(111, "Taylor", "Swift", 85);
        Student s2 = new Student(222, "Steve", "Jobs", 80);
        Student s3 = new Student(333, "Bill", "Gates", 75);
        
        //add 3 students to the HashMap
        students2168.put(111, s1);
        students2168.put(s2.getId(), s2);
        students2168.put(s3.getId(), s3);
        //call toString() in HashMap to get all data contents and print them
        System.out.println(students2168);
        System.out.println();

        //Solution 1: display all entries in the map nicely
        //   use a for-each loop to get each entry in the HashMap
        //       then print the data in each entry in one line
        System.out.println("Students in the Map students2168:");
        for (Map.Entry<Integer, Student> s : students2168.entrySet()) {
            Student currentStudent = s.getValue();
            System.out.println(currentStudent.getFirstName() + ", " + currentStudent.getLastName()
                    + ", " + currentStudent.getGrade());
        }
        
         //Solution 2: display all entries in the map nicely
        //   use a for-each loop to get each key in the set of keys of the HashMap
        //       then use the key to look up the value,
        //       then print the key, and the value in one line   
        System.out.println("");        
        System.out.println("Students in the Map students2168:");
        for (Integer stuid : students2168.keySet()) {
            Student student = students2168.get(stuid);
            System.out.println(student.getFirstName() + ", " + student.getLastName()
                    + ", " + student.getGrade());            
        }
        
        System.out.println();        
        //search by the given key: 111
        Student s = students2168.get(111);
        System.out.println(s.getGrade());
        System.out.println();

        //remove by the given key: s2's id
        students2168.remove(s2.getId());

        //call toString() to get the new data contents in the HashMap and print them
        System.out.println(students2168);
    }
}

/* ---Program Output--
{333=Student{id=333, firstName=Bill, lastName=Gates, grade=75.0}, 222=Student{id=222, firstName=Steve, lastName=Jobs, grade=80.0}, 111=Student{id=111, firstName=Taylor, lastName=Swift, grade=85.0}}

Students in the Map students2168:
Bill, Gates, 75.0
Steve, Jobs, 80.0
Taylor, Swift, 85.0

Students in the Map students2168:
Bill, Gates, 75.0
Steve, Jobs, 80.0
Taylor, Swift, 85.0

85.0

{333=Student{id=333, firstName=Bill, lastName=Gates, grade=75.0}, 111=Student{id=111, firstName=Taylor, lastName=Swift, grade=85.0}}

*/