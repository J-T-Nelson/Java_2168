package generic_interface_demo;

public class ATMChase implements ComparableATMChase {

    @Override
    public int compareTo(ATMChase other) {
        if (id.compareTo(other.id) == 0) {
            return 0;
        } else if (id.compareTo(other.id) < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    // public String get(){

    // }
    public String getLocation() {
        return location;
    }

    private String id;
    private String location;

    public ATMChase() {

    }

    public ATMChase(String id, String location) {
        this.id = id;
        this.location = location;
    }
}
