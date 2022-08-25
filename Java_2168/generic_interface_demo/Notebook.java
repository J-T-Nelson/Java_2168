package generic_interface_demo;

public class Notebook extends Computer {

    private double screenSize;
    private double weight;

    public Notebook(String brand, double cpuSpeed, double ramSize,
            double screenSize, double weight) {
        super(brand, cpuSpeed, ramSize);
        this.screenSize = screenSize;
        this.weight = weight;
    }
}

