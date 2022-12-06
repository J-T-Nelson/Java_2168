package Lab_5_helper_files.recursion_basics;


public class StringLengthComputeTest {

    public static void main(String[] args) {
        String name = "bce";
        System.out.println(length(name));

    }

    //compute the length of a given string str using recursion
    // and return the length.
    public static int length(String str) {
                          //can also use str.isEmpty()
        if (str == null || str.equals("")) {        //base case
            return 0;
        } else {
            return 1 + length(str.substring(1));    //recursive step
        }
    }

}
