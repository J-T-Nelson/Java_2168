
package interface_demo;

public class ComputerComparison {

    public static void main(String[] args) {
        Computer myComputer = new Computer("dell", 3, 8);
        Computer hisComputer = new Computer("lenovo", 4, 16);
        Notebook myLaptop = new Notebook("toshiba", 3, 16, 17, 3.5);

        myComputer.print()
        myLaptop.print() // ?? not sure if these 2 lines are correct. 

        //to add code in class
        System.out.println(myComputer.compareTo(myComputer));
        System.out.println(myComputer.compareTo(myLaptop));
        System.out.println(myLaptop.compareTo(myComputer));


    }
}
