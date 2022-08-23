package interface_demo;

public class ATMChase {

    //enforce daily withdraw limit

    private String id;
    private String location;

    private double getBalance(String account) {
        return 2600;
    }

    //need the following for interface practice
    public ATMChase(){

    }

    public ATMChase(String id, String location) {
        this.id = id;
        this.location = location;
    }
}
//
