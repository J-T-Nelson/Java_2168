package assign1_template;


public class TestStudents {
    public static void main(String[] args) {
        
        //2.2 Code given to you. Just use them.
        
        //create an array of Student objects.
        Student[] cisDept = new Student[4];
        
        //Create and add 4 students, two undergraduates, two master students
        //   add these students to the array 
        //They are commented since you haven't added your code to Undergraduate, MasterStudent
       
        String[] theisCommittee = {"Tom", "Richard", "Jamie"};
        cisDept[0] = new MasterStudent("222", "Steve", "Jobs", "IST", "MS", 3.5,
                "How to make ipad smarter", "Jamie", theisCommittee);
        
        cisDept[1] = new Undergraduate("444", "Bill", "Gates", "CS", "BS", 3.0, "Erin", "Sally");

        String[] theisCommittee2 = {"Jie", "Zoran", "Gene"};
        cisDept[2] = new MasterStudent("333", "Amy", "Jobs", "CS", "MS", 3.8,
                "Study of Robots That can Perform", "Eduard", theisCommittee2);
        
        cisDept[3] = new Undergraduate("111", "Melinda", "Gates", "IST", "BS", 3.0, "Erin", "Frank");
        
        // for loop to print out the fields of all Students within cisDept[]
        for(int i = 0; i < cisDept.length; i++){
            System.out.println(cisDept[i].toString());
        }
        
        // Testing compareTo method for Students: 
        System.out.println("if negative Jobs Steve preceeds Gates Bill alphabetically: " + cisDept[0].compareTo(cisDept[1])); //returns 3 SUCCESS!!
        
        // Testing indexOfMin:
        int alphFirst = indexOfMin(cisDept); 
        System.out.println("Index of alphabetically first cis Dept Student name: " +
        alphFirst + "Name of alphbetically first Stduent in CIS Dept: " + alphFirst);
        
    }
    
    public static int indexOfMin(Student[] myDept) {
        // assuming first entry is lowest until compareTo proves otherwise
        int min = 0; 
        // for loop compares current alphabetic minimum student name (starting at index 0) 
        //      to each other Student within the array, and returns the index of    
        //      whichevever Student name comes first in alphabetical order.
        for (int i = 1; i < myDept.length; i++){
            if (myDept[i].compareTo(myDept[min]) < 0){
                min = i;
            }
        }
        return min;
    }
}
