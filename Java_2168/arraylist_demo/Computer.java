package arraylist_demo;

/**
 *
 * @author cindy
 */
public class Computer {
    private String brand;
    private double cpuSpeed;
    private double ramSize;
    
    public Computer(String brand, double cpuSpeed, double ramSize){
        this.brand = brand;
        this.cpuSpeed = cpuSpeed;
        this.ramSize = ramSize;
    }
    
    public double computePower(){
        return cpuSpeed * ramSize;
    }
    
    /*
    public int comparePower(Computer other){
        double thisPower = computePower();
        double theOtherPower = other.computePower();
        
        if (thisPower == theOtherPower) {
            return 0;
        }
        else if (thisPower > theOtherPower) {
            return 1;
        }
        else {
            return -1;
        }
    }
    */
    
    @Override
    public String toString(){
        String compInfo = "Brand: " + brand + ", cpuSpeed: " + cpuSpeed 
                + ", ramSize: " + ramSize;
        return compInfo;
    }
       
}
