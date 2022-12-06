// CIS2168
// Section: 003
// Assignment 5
// File: ChangeDispenser.java
// Author: Jon Tanner Nelson, Email: jon.tanner.nelson@temple.edu

package Lab_5;


import java.util.Scanner;

public class ChangeDispenser {

    public static String makeChange(Double amount) {
        // changeCounter tracks the number of each coin used to make change in an array
        Integer[] changeCounter = {0, 0, 0, 0, 0, 0}; 
        
        // calcChange updates changeCounter such that appropriate amounts of each coin are held in their respective positions of the array
        changeCounter = calcChange(amount, changeCounter);    
        
        String[] singular = {"Dollar", "Half Dollar", "Quarter", "Dime", "Nickle", "Penny"};
        String[] plural = {"Dollars", "Half Dollars", "Quarters", "Dimes", "Nickles", "Pennys"};
        String stringOut = "";
        
        // for loop writes the output string by determining plural or singular for each denomination
        // and creating the appropriate output for each denomination
        for(int i = 0; i < 6; i++){ 
            if(changeCounter[i] == 1){
                stringOut = stringOut + 1 + "   " + singular[i] + "\n"; 
            } else {
                stringOut = stringOut + changeCounter[i] + "   " + plural[i] + "\n";
            }
        }
        return stringOut;
    }

    private static Integer[] calcChange(double amount, Integer[] changeCounter){
        // if statements work by checking remaining value within 'amount' and altering it before updating the coin count and calling the function back again. 
        if(amount >= 1.0){
            amount = amount - 1.0;
            changeCounter[0] = changeCounter[0] + 1;
            return calcChange(amount, changeCounter);
        }
        if(amount >= .50){
            amount = amount - .50;
            changeCounter[1] = changeCounter[1] + 1;
            return calcChange(amount, changeCounter);
        }
        if(amount >= .25){
            amount = amount - .25;
            changeCounter[2] = changeCounter[2] + 1;
            return calcChange(amount, changeCounter);
        }
        if(amount >= .10){
            amount = amount - .10;
            changeCounter[3] = changeCounter[3] + 1;
            return calcChange(amount, changeCounter);
        }
        if(amount >= .05){
            amount = amount - .05;
            changeCounter[4] = changeCounter[4] + 1;
            return calcChange(amount, changeCounter);
        }
        if(amount >= .009){
            amount = amount - .01;
            changeCounter[5] = changeCounter[5] + 1;
            return calcChange(amount, changeCounter);
        }
        // when no if statements trigger, it means we have less than .01 left in amount, and thus cannot make change any more precisely. 
        // base case is thus reached, and the cascade collapses spitting out an updated changeCounter array.  
        return changeCounter;
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource") 
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the amount of money you want turned into coin based change. \n" + "Please enter a value in the form '0.00'... ");

        // while loop is here to ensure proper input is given. 
        while(!userIn.hasNextDouble()){ // NOTE TO SELF: hasNextXXXX() does prompt input from a user on its own, and returns 'true' or 'false', it doesn't advance the scanner though. 
            System.out.println("That input is not valid, please try again.");
            userIn.next(); // NOTE TO SELF: next() advances the scanner past the next token... IF THERE IS NO TOKEN, it will prompt the user for one in the case the scanner is reading from System.in
        }
        Double value = userIn.nextDouble();
        
        System.out.println("Here is your change: \n" + makeChange(value));
            // test your code using $2.91, $0.91, $0.78, $0
        }
        
    }
    
    
    
    /* BELOW THIS POINT IS THROWAWAY CODE FOR MY (Tanner's) REFERENCE / experimentation */
    
    //Double value = -1.0;
    // boolean validInput = false;
    // while(!validInput){
        //     try {
        //         System.out.println("I just looped again!");
        //         value = userIn.nextDouble();
        //         validInput = true;

        //     } catch (InputMismatchException e) {
        //         userIn.nextLine();
        //         continue;
        //     }
        // }   // ^^ the above code block here fails to properly grab only double as user input. I am not sure what is wrong with it, but once a single input has been grabbed it will not allow for further input upon successive loops and thus forces manual program termination.
        // // OK figured out how to make it work... the issue was that the scanner wasn't advancing once a single error was thrown, which thus results in a infinite loop of failing?... lets check that actually. YEP. its infinitely looping because the scanner is reading the next thing, which is failed input then throwing the exception then continuing without ever advancing the scanner. 

                
        // System.out.println("does hasNextXXX() only conditionally grab input? ... calling userIn.next()");
        // userIn.next();
        // System.out.println("checking if .next() conditionally prompts for input... getting input from hasNext().. then making variable 'varr' = .next() and printing it");
        // userIn.hasNext();
        // String varr = userIn.next();
        // System.out.println("Printing varr: " + varr);


        // System.out.println("grabbing random string to see if scanner.next() prompts input..");
        // String scannedString = userIn.next();
        // System.out.println("Printing the last grabbed thing :" + scannedString);

        // System.out.println("Here is your change: \n" + value);
        // System.out.println("checking if .hasNextXXXX() grabs input or just checks what is there..." + userIn.hasNextInt());
