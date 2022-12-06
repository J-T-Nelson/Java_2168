package Lab_7;
// want to practice string.format ... going to toy around with it for a bit until I understand how to use it. 
public class formatterPractice {
    public static void main(String[] args) {
        String[] a1 = {"dog", "dgggg", "og", "dogz", "dogs"};
        String[] a2 = {"Cats", "Came", "Cape", "Catz", "Catss", "healthy"};

        int counter = 0;
        for(String s : a1){
            System.out.println(String.format(s, a2[counter]));
            counter++;
        }

        counter = 0;
        for(String s : a1){
            System.out.println(String.format("Testing how I make strings formatted: string 1 = %s, string 2 = %2$s", s, a2[counter]));
            counter++;
        }

        int[] ints = {1, 45, 626, 72, 7};
        counter = 0;
        for(String s : a1){
            System.out.println(String.format("how I make strings formatted: string 1 = %s, string 2 = %2$s, %3$s", s, a2[counter], ints[counter]));
            counter++;
        } // ^^ NOTE: "%i" doesn't work for formatting ints, refering to it as a string does work just fine however 
    }
}
