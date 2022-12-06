//Student.java
//* same as the one given in Chapter 2

package Lab_8_helpers.hashmap_use;

public class Student {

    private int id;            //student id
    private String firstName;
    private String lastName;
    private double grade;       //total grade in a course section

    //for creating a dummy Student object (all data fields having system-default values
    public Student() {
    }

    //for creating a Student object with given values in all data fields
    public Student(int id, String firstName, String lastName, double grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    //getters and setters for all data fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //return information about the calling object ( a specific Student object)
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", grade=" + grade + '}';
    }

}
