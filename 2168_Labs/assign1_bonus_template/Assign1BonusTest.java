package assign1_bonus_template;

/** Assign 1 Bonus Part - Write a Java generic method.
 * @author Cindy 
 * @author Jon Tanner Nelson
 */
public class Assign1BonusTest {

    public static void main(String[] args) {
        //You do not need to change the code inside main(...)
        //They are provided for you to test your own solution.
        
        String[] sweets = {"cake", "choclate", "donut"};
        Integer[] numbers = {10, 20, 30, 40};
        
        //When you add your method, uncomment the following three lines.
       contains(sweets, "donut");  //should print Found
       contains(sweets, "cookie"); //should print Not Found   <-- edited this myself, as it was wrong in the initial file      
       contains(numbers, 100);     //should print Not Found

    }
    
    public static <T> boolean contains(T[] anyArray, T anyValue) {

        // using 'String.valueOf()'' to convert our target value to a string for generality of the method
        String valOfInterest = String.valueOf(anyValue); // It is also computationally more efficient to only have to call String.valueOf() once for 'anyValue'

        // for loop compares valOfInterest to String casted values of the array until it reaches a match or exhausts the array.
        //      Returns the desired values and prints results for user. 
        
        for(int i = 0; i < anyArray.length; i++){

            if(valOfInterest.equals(String.valueOf(anyArray[i]))) {
                System.out.println("Found");
                return true;
            }
        }
        System.out.println("Not Found");
        return false;
    }
}
