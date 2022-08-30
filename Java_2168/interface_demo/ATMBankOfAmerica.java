package interface_demo;

public class ATMBankOfAmerica implements ATM, Printable {

    //no daily withdraw limit
    @Override
    public void showBalance(String account){
      System.out.println("The balance of your account: " + account + " is " + getBalance(account));
    }

    public boolean withdraw(String account, double amount){
        return true;
    }
    
    private String id;
    private String location;

    public ATMBankOfAmerica(String id, String location){
        this.id = id;
        this.location = location;
    }

    public void print(){
      System.out.println("id: " + id + "location: " + location);
    }

    private double getBalance(String account) {
        return 3000;
    }

}
//dog
