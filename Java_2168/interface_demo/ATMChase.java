package interface_demo;

//import javax.swing.LayoutStyle.ComponentPlacement;

public class ATMChase implements ATM, Printable, ComparableATMChase {

    //enforce daily withdraw limit

    private String id;
    private String location;
    
    public ATMChase(String id, String location) {
        this.id = id;
        this.location = location;
    }

    public int compareTo(ATMChase otherATM){

        int comparisonResult = id.compareTo(otherATM.id);

        if(comparisonResult == 0){
            return 0;
        }
        if(comparisonResult > 0){
            return 1;
        } else{ 
            return -1; }
    }

    @Override
    public void print(){
        System.out.println(id + location);
    }

    @Override
    public void showBalance(String account) {
        System.out.println("Account: " + account + ", balance: " + getBalance(account));
    }

    //need the following for interface practice

    private double getBalance(String account) {
        return 2600;
    }

    @Override //stub
    public boolean withdraw(String account, double amount) {
        if (amount > MAX_DAILY_WITHDRAW_LIMIT)  {
            System.out.println("amount over max withdraw limit");
            return false;
        }
        else if (amount > getBalance(account)) {
            System.out.println("amount over balance");
            return false;            
        }
        else {
            System.out.println("Balance reduced by " + amount + " from account"
                     + account);
            return true;            
        }
    }   
}
//
