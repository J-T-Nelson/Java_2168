//Person.java
//* Implement the interface Comparable
//* Compare two people based on lastname first, then firstname

package comparable_comparator;

/*<example chapter="8" number="2">*/

/** A class to represent a person.
 *  @author Koffman and Wolfgang
 */
public class Person implements Comparable<Person> {
    // Data Fields

    /** The last name */
    private String lastName;
    /** The first name */
    private String firstName;
    /** Birthday represented by an integer from 1 to 366, i.e. a day in the birth year */
    private int birthDay;
    

    // Methods
    /**
     * Compares two Person objects based on names lexicographically. The result
     * is based on the last names if they are different;
     * otherwise, it is based on the first names.
     * @param obj The other Person
     * @return A negative integer if this person's name
     *         precedes the other person’s name;
     *         0 if the names are the same;
     *         a positive integer if this person's name follows
     *         the other person’s name.
     */
    @Override 
    public int compareTo(Person obj) {
        Person other = obj;
        // Compare this Person to other using last names by calling the compareTo method in String class.
        int result = lastName.compareTo(other.lastName);
        if (result == 0) {         // Compare first names if last names are the same.
            return firstName.compareTo(other.firstName); 
        } else {
            return result;
        }
    }

    // Other methods
    /**
     * Gets the person's year of birth
     * @return the day in the year of birth as an int value
     */
    public int getBirthDay() {
        return birthDay;
    }
    
    //added to example for demo
    //The constructor for creating a new person object with given last name,
    //      first name, and birthday.
    public Person(String lastName, String firstName, int birthDay) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
    }
}
/*</example>*/