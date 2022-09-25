package interface_demo;

public interface ATM {

    double MAX_DAILY_WITHDRAW_LIMIT = 2000;

    void showBalance(String account);

    boolean withdraw(String account, double amount);

    default void deposit(String account, double amount) {
        System.out.println("balance increased by " + amount + " in account"+account);
    }


}
//
