package Practice_Problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ch_4_practice {
    
    public static void main(String[] args) {
        System.out.println("checking if 'kayak' is a palidrome:" + isPalidrome("kayak"));
        System.out.println("checking if 'racecar' is a palidrome:" + isPalidrome("racecar"));
        System.out.println("checking if 'RaceCar' is a palidrome:" + isPalidrome("RaceCar"));
        System.out.println("checking if 'abba' is a palidrome:" + isPalidrome("abba"));
        System.out.println("checking if 'Dick me down nwod em kciD' is a palidrome:" + isPalidrome("Dick me down nwod em kciD"));
        System.out.println("checking if 'abba  ' is a palidrome this time to test for space sensitivity:" + isPalidrome("abba  "));

        System.out.println("I have made an overloaded method that allows for control over space and case insensitivity");
        System.out.println("Lets see how 'lick meemkciL' does in our first method: "+isPalidrome("lick meemkciL")+
                            "\nNow lets see how the overloaded method performs with both insensitivities turned off: " + 
                            isPalidrome("lick meemkciL", false, false));


        String st = "test string";
        String st2 = "test string         ";
        System.out.println(st.equals("teststring")); // equals does consider " " to matter in comparison 
        System.out.println("lets see st2 unedited.. " + st2 + "look at whitespace\n"+"lets see it edited by strip(): " + st2.strip() + "how much space is there now?");

        String st3 = st2.replaceAll("\\s+", "");
        //String st33 = "this is test";
        System.out.println(st3);

        System.out.println("\n\n\n");

        String exp1 = "(x+y)";
        String exp2 = "(x+y(yyy[dgf[gg]]))";
        String exp3 = "(x+y(yyydgf[gg]]))";
        String exp4 = "(x+y(yyydgf[gg])";
        String exp5 = "(x+y(yyydgf[gg)])";

        System.out.println("Testing if isBalanced() is working for exp1 - should be true: " + isBalanced(exp1));
        System.out.println("Testing if isBalanced() is working for exp2 - should be true: " + isBalanced(exp2));
        System.out.println("Testing if isBalanced() is working for exp3 - should be false: " + isBalanced(exp3));
        System.out.println("Testing if isBalanced() is working for exp4 - should be false: " + isBalanced(exp4));
        System.out.println("Testing if isBalanced() is working for exp5 - should be false: " + isBalanced(exp5));
        System.out.println(exp1.length());

    }
    // w2 make the function optionally case sensitive 
    // also make it optionally space sensitive, so that it can acknowledge weather or not 
    //  spaces should be considered or if strings with spaces should have white space removed 


        //default behavior is case sensitive and space sensitive. 
        public static boolean isPalidrome(String strng){
    
            Deque<Character> charStack = new ArrayDeque<>();
    
            for (int i = 0; i < strng.length(); i++) {
                char chrI = strng.charAt(i);
                charStack.push(chrI);
            }
    
            String s = "";
    
            for (int i = 0; i < strng.length(); i++) {
                s += charStack.pop();
            }
    
            if(s.equals(strng)){
                return(true);
            } else { 
                return(false);
              }
            
        }

        // space and case sensitivity can be modified. 
        // If spaceSense is 
        public static boolean isPalidrome(String strng, boolean caseSense, boolean spaceSense){
    
            if(!caseSense){
                strng = strng.toLowerCase();
            }
            if(!spaceSense){
               strng = strng.replaceAll("\\s+", "");
            }
            //System.out.println("TESTING OUTPUT OF isPalindrome overloaded: " + strng);
            Deque<Character> charStack = new ArrayDeque<>();
    
            for (int i = 0; i < strng.length(); i++) {
                char chrI = strng.charAt(i);
                charStack.push(chrI);
            }
    
            String s = "";
    
            for (int i = 0; i < strng.length(); i++) {
                s += charStack.pop();
            }
    
            if(s.equals(strng)){
                return(true);
            } else { 
                return(false);
              }
        }

        public static boolean isBalanced(String expression){

            Deque<Character> stack = new ArrayDeque<>();

            int index = 0;
            while(index < expression.length()){

                char chr = expression.charAt(index);
                if(chr == '(' || chr == '['){
                    stack.push(chr);
                    System.out.println("VERIFYING CONTENTS OF stack: " + stack.toString());
                } else {
                    if(chr == ')'){

                        if(stack.isEmpty()){ // if there is nothing in the stack and a closing bracket is read, the expression is imbalanced. 
                            return false;
                        }

                        char checker = stack.pop();
                        if(checker == '('){
                            index++;
                            continue;
                        } else {
                            return false;
                        }
                        
                    } else {
                        if(chr == ']'){

                            if(stack.isEmpty()){ // if there is nothing in the stack and a closing bracket is read, the expression is imbalanced. 
                                return false;
                            }

                            char checker = stack.pop();
                            if(checker == '['){
                                index++;
                                continue;
                            } else {
                                return false;
                            }
                        }
                    }
                }
                index++;
            }
            if(stack.isEmpty()){ // if the stack isn't empty then a paren was not account for and thus the expression is imbalanced. 
                return true;
            }
            return false;
        }
    }
