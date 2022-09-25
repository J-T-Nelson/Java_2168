package arraylist_demo;



public class ArrayListTest3 {

    public static void main(String[] args) {
        Computer[] lab = new Computer[3];
        lab[0] = new Computer("dell", 3, 16);
        lab[1] = new Notebook("Toshiba", 4, 24, 17, 3.5);
        lab[2] = new Computer("dell", 3.2, 8);

        for (Computer c : lab) {
            System.out.println(c);
        }
        
        //use list, array list, linked list
        
    }
}
