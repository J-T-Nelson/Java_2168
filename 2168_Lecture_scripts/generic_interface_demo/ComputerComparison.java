
package generic_interface_demo;

public class ComputerComparison {
  
    public static void main(String[] args) {
        Computer myComputer = new Computer("dell", 3, 8);
        //Computer hisComputer = new Computer("lenovo", 4, 16);
        Notebook myLaptop = new Notebook("toshiba", 3, 16, 17, 3.5);
        
        System.out.println(myComputer.compareTo(myComputer));               
        System.out.println(myLaptop.compareTo(myComputer));           
    }    
}
