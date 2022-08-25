package generic_interface_demo;

public class ATMChaseComparison {

    public static void main(String[] args) {
        ATMChase atm3 = new ATMChase("1", "Temple University");
        ATMChase atm4 = new ATMChase("2", "City Hall");
        System.out.println(atm3.compareTo(atm4));
 
    }
}
