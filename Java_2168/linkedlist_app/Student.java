//Student.java (code not in book).
//Student class: 
//    for a student in a course section like cis2168 003
package linkedlist_app;

/**
 * @author cindy
 */
public class Student {

    private long id;            //tu id
    private String firstName;
    private String lastName;
    private double grade;       //total grade in a course section

    //for creating a dummy Student object (all data fields having system-default values
    public Student() {
    }

    //for creating a Student object with given values in all data fields
    public Student(long id, String firstName, String lastName, double grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    //getters and setters for all data fields
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
