import java.util.*;

public class debuggingPractice {


public static void main(String[] args) {
    // code application logic here
    @SuppressWarnings("resource") // recommended to use this from SO post, not totally sure what the key work resource does.. 
    //or how this works, but it certainly works to get the compiler to be quiet 
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any month in number (Ex: 1 for January, etc)");
    int month = Integer.parseInt(sc.next());
    if (month % 2 == 0) {
        System.out.println("The month is Even");
    } else {
        System.out.println("The month is Odd");
    }
    // switch statement to return the name of the month
    switch (month) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("Invalid month.");
            break;
    }
    // while loop to calculate time to new year
    int j = 0;
    int i = month;
    while (i != 12) {
        i += 1;
        j++;
        System.out.println("Calculating time to New Year...");
    }
    System.out.println("Total months left for New Year:" + j);

    }
}