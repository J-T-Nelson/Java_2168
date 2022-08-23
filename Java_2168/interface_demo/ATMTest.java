package interface_demo;

public class ATMTest {

    public static void main(String[] args) {
        //use interface ATM

        ATMBankOfAmerica atm1 = new ATMBankOfAmerica();
        atml.showBalance("2168");
        atml.withdraw("2168", 2500);
        //correct
        ATM atm2 = new ATMChase();
        atm2.showBalance("2168");
        atm2.withdraw("2168", 2500);
        atm2.deposit("2168",1000);

        //pitfall
        // ATM atm3 = new ATM(); <-- cannot actually be done, as concrete objects cannot be crated from interfaces
        ATM atm4 = atm2;

    }

}
