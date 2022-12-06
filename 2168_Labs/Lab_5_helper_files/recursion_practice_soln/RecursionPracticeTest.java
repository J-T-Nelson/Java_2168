package Lab_5_helper_files.recursion_practice_soln;

public class RecursionPracticeTest {

    public static void main(String[] args) {
        int[] items = {10, 20, 30, 40};
        System.out.println(sum(items));
    }

    //Question:
    //Write a recursive method to 
    //   find the sum of all values stored in an array of integers.

    //Answer:
    //public wrapper
    public static int sum(int[] items) {
        return sum(items, 0);
    }

    //private recursive counterpart
    private static int sum(int[] items, int posFirst) {
        if (posFirst == items.length) {  //empty array   
            return 0;
        } else {
            return items[posFirst] + sum(items, posFirst + 1);
        }
    }

}
