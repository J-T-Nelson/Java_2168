package generic_interface_demo;

public class Computer implements ComparableComputer {

    @Override
    public int compareTo(Computer other) {
        double thisPower = computePower();
        double otherPower = other.computePower();
        if (thisPower > otherPower) {
            return 1;
        } else if (thisPower < otherPower) {
            return -1;
        } else {
            return 0;
        }
    }
    
    private String brand;
    private double cpuSpeed;
    private double ramSize;

    public Computer(String brand, double cpuSpeed, double ramSize) {
        this.brand = brand;
        this.cpuSpeed = cpuSpeed;
        this.ramSize = ramSize;
    }

    public double computePower() {
        return cpuSpeed * ramSize;
    }
    
    @Override
    public String toString(){
        return "brand: " + brand + ", cpu speed: " + cpuSpeed
            + ", ram size: " + ramSize;
    }    
}
