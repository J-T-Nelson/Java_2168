package Lab_5_helper_files.recursion_basics;

//Demo basics of recursion, recursion vs iteration
public class FactorialTest {

    public static void main(String[] args) {
        int n = 10; 
        System.out.println(factorial(n));           
        System.out.println(factorialIterative(n));
                
    }

    //recursive solution of computing factorial of n
    //precondition: n >= 0
    public static long factorial(int n) {        
        if (n == 0) { //base case
            return 1;
        } else {
             return n * factorial(n - 1);  //take recursive step
        }
    }
    
    //iterative solution of computing factorial of n
    //precondition: n >= 0
    public static long factorialIterative(int n) {        
        long factorialN = 1;
        for (int i = n; i >= 2; i--) {
            factorialN *= i;
        }
        return factorialN;
    }    

}
