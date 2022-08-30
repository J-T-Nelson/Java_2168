package interface_demo;

public class ATMTest {

    public static void main(String[] args) {
        //use interface ATM

        ATMBankOfAmerica atm1 = new ATMBankOfAmerica("mythank", "jarkston park");
        atm1.showBalance("2168");
        atm1.withdraw("2168", 2500);
        //correct
        ATMChase atm2 = new ATMChase("fillerID", "fillerLocation");
        atm2.showBalance("2168");
        atm2.withdraw("2168", 2500);
        atm2.deposit("2168",1000);

        ATMChase atm3 = new ATMChase("fuck", "Anywherewilldo");       
        System.out.println(atm3.compareTo(atm2)); 

        //pitfall
        // ATM atm3 = new ATM(); <-- cannot actually be done, as concrete objects cannot be crated from interfaces
        //ATM atm4 = atm2;

    }

}
