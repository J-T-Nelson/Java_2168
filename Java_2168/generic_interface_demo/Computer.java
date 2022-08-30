package generic_interface_demo;

public class Computer implements ComparableComputer {
    
    private String brand;
    private double cpuSpeed;
    private double ramSize;
    
    public Computer(String brand, double cpuSpeed, double ramSize) {
        this.setBrand(brand);
        this.cpuSpeed = cpuSpeed;
        this.ramSize = ramSize;
    }
    
    public double computePower() {
        return cpuSpeed * ramSize;
    }

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
    
    @Override
    public String toString(){
        return "brand: " + getBrand() + ", cpu speed: " + cpuSpeed
            + ", ram size: " + ramSize;
    }    
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getCpuSpeed() {
        return cpuSpeed;
    }
    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }
    public double getRamSize() {
        return ramSize;
    }
    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }
    
}
