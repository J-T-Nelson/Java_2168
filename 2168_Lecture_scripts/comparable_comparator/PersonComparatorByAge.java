//PersonComparatorByAge.java
//* A Comparator Class that compares 2 Person objects based on age (really birthday)
//* Demo how to create a class that implements Comparator interface

package comparable_comparator;

/*<example chapter="8" number="3">*/

import java.util.Comparator;

/** A class to compare Person objects using an ordering 
 *      that is not the natural ordering defined in Comparable interface.
 *  This non-natural-ordering is defined using Comparator interface.
 *  @author Koffman and Wolfgang
 */
public class PersonComparatorByAge implements Comparator<Person> {

    /**
     * Compare two Person objects based on birth date.
     * @param left The left-hand side of the comparison
     * @param right The right-hand side of the comparison
     * @return A negative integer if the left person's birthday
     *         precedes the right person's birthday;
     *         0 if the birthdays are the same;
     *         a positive integer if the left person's birthday
     *         follows the right person?s birthday.
     */
    @Override  
    public int compare(Person left, Person right) {
        return left.getBirthDay() - right.getBirthDay();
    }
}
/*</example>*/
