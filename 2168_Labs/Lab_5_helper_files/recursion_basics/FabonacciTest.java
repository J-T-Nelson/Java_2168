package Lab_5_helper_files.recursion_basics;

public class FabonacciTest {

    public static void main(String[] args) {
        
        System.out.println(fibonacci(6));
        System.out.println(fibonacciStart(6));
        
    }
    
    /**
     * Recursive method to calculate Fibonacci numbers
     * (in RecursiveMethods.java).
     * @pre n >= 1
     * @param n The position of the Fibonacci number being calculated
     * @return The Fibonacci number
     */
    //straighforward but not efficient.
    public static int fibonacci(int n) {
        if (n <= 2) {   //base case
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2); //recursive steps
        }
        
    }
    
    /**
     * Recursive O(n) method to calculate Fibonacci numbers
     * @pre n >= 1
     * @param fibCurrent The current Fibonacci number
     * @param fibPrevious The previous Fibonacci number
     * @param n The count of Fibonacci numbers left to calculate
     * @return The value of the Fibonacci number calculated so far
     */
    private static int fibo(int fibCurrent, int fibPrevious, int n) {
        if (n == 1) {               //base case
            return fibCurrent;
        } else {
            //take recursive step
            //pass what's already computed to next recursive call
            //  to avoid duplicate computation.
            return fibo(fibCurrent + fibPrevious, fibCurrent, n - 1);
        }
    }

    /**
     * Wrapper method for calculating Fibonacci numbers
     * @pre n >= 1
     * @param n The position of the desired Fibonacci number
     * @return The value of the nth Fibonacci number
     */
    public static int fibonacciStart(int n) {   
               //pass first fibonacci number 1 as fibCurrent 
               //     0 as fibPrevious
               //     n as count of n fibonacci numbers left to compute
        return fibo(1, 0, n);
    }
    /*</example>*/    
    
}
