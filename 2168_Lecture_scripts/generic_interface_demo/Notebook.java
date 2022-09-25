package generic_interface_demo;

public class Notebook extends Computer {

    private double screenSize;
    private double weight;

    public Notebook(String brand, double cpuSpeed, double ramSize, double screenSize, double weight) {
        super(brand, cpuSpeed, ramSize);
        this.screenSize = screenSize;
        this.weight = weight;
    }

    public static void printProperties(){
        System.out.println("1. screenSize\n2. weight\n3. brand\n4. cpuSpeed\n5. ramSize");
    }


    public void testThis(){
        System.out.println("Testing what comes out of this.screenSize and this.weight: \nScreenSize: "+this.screenSize+" Weight: "+this.weight);
    }

    public void printProperties(boolean TorF){
        if(TorF){
            Notebook.printProperties();
        }
        
        System.out.println(this.getClass().getName() + " Properties:\n" + "screenSize: "+this.screenSize
                            + " weight: "+this.weight+" brand: "+this.getBrand()+" cpuSpeed: "+this.getCpuSpeed()+" ramSize: "+this.getRamSize());
    }
}

