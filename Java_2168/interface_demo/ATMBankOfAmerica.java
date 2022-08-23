package interface_demo;

public class ATMBankOfAmerica {

    //no daily withdraw limit
    @Override
    public void showBalance(String account){
      system.out.println("The balance of your account: " + account + " is " + getBalance(account));
    }

    
    private String id;
    private String location;

    private double getBalance(String account) {
        return 3000;
    }

}
//dog
