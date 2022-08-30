package assign1_template;

//2.3.1 mark the class to implement the generic interface Comparable<T> and compare two students.
public class Student implements Comparable<Student> {

    // compareTo() for Student Class (and its subclasses of course)
    // uses String class's .equals() and .compareTo() methods within. 
    public int compareTo(Student otherStudent) {
        // if block below activates when last names are equal
        //      first it checks for equality of first name as well, returning 0 in 
        // the case of first and last name equality
        //      then if first names differ the built in compareTo() for String class 
        // method is used to return negative or positive integers depending on 
        // lexicographic relationship of names 
        if (this.lastName.equals(otherStudent.getLastName())){
            if (this.firstName.equals(otherStudent.getFirstName())){
                return 0;
            }
            else {
                return firstName.compareTo(otherStudent.getFirstName());
            }
        }
        // when last names differ, String compareTo() is called to return neg or pos integers
        return lastName.compareTo(otherStudent.getLastName());
    }
    
    //Don't change the code below. Just use them.
    private String id;
    private String firstName;
    private String lastName;
    private String major;
    private String degree;
    private double gpa;

    //constructors
    public Student() {
    }

    public Student(String id, String firstName, String lastName, String major,
            String degree, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.degree = degree;
        this.gpa = gpa;
    }

    //setters
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //getters
    public String getDegree() {
        return degree;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "id: " + id + ", firstName: " + firstName + ", lastName: " + lastName
                + ", major: " + major + ", degree: " + degree + ", gpa: " + gpa;
    }
}
