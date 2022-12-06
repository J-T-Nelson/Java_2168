/**
 * An application for showing how to use the Comparable interface and Comparator interface.
 * @author cindy
 */
package comparable_comparator;

public class PersonComparisonTest {

    public static void main(String[] args) {
        //create 2 Person objects
        Person trump = new Person("Trump", "Donald", 1);  //day 1 in the year
        Person obama = new Person("Obama", "Barack", 15); //day 15 in the year     

        //using Comparable interface
        int comparableResult = trump.compareTo(obama);

        //using Comparator interface
        PersonComparatorByAge ageComparator = new PersonComparatorByAge();
        int comparatorResult = ageComparator.compare(trump, obama);
        
        System.out.println("Comparable result by name: " + comparableResult);
        System.out.println("Comparator result by birthday: " + comparatorResult);
    }
}
