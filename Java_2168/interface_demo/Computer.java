package interface_demo;

public class Computer implements ComparableComp, Printable {

    @Override
    public void print() {
      System.out.println("bran: " + brand + ", cpu speed: " + cpuSpeed + "ram size: " + ramSize);
    }

      // POSSIBLE RETURNS:
    // 1: this computer is more powerful
    // 0: computers have the same power
    //-1: less powerful
    public int compareTo(Computer otherComp){
      double thisPower = computerPower();
      double otherPower = otherComp.computerPower();
      if(thisPower > otherPower) {
        return 1;
      }
      else if (thisPower < otherPower) {
        return -1;
      }
      return 0;
    }

    private String brand;
    private double cpuSpeed;
    private double ramSize;

    public Computer(String brand, double cpuSpeed, double ramSize) {
        this.brand = brand;
        this.cpuSpeed = cpuSpeed;
        this.ramSize = ramSize;
    }

    public double computerPower() {
        return cpuSpeed * ramSize;
    }
}
