//The class Notebook covered in Chapter 1.

package linkedlist_app;

//same as the code in package polymorphism covered in Lec#2.
public class Notebook extends Computer {

    private double screenSize;
    private double weight;

    public Notebook(String brand, double cpuSpeed, double ramSize,
            double screenSize, double weight) {
        super(brand, cpuSpeed, ramSize);
        this.screenSize = screenSize;
        this.weight = weight;
    }

    public Notebook(double cpuSpeed, double ramSize,
            double screenSize, double weight) {
        this("lenovo", cpuSpeed, ramSize, screenSize, weight);
    }

    @Override
    public String toString() {
        String notebkInfo = super.toString() + ", Screen size: " + screenSize
                + ", weight: " + weight;
        return notebkInfo;
    }
}
