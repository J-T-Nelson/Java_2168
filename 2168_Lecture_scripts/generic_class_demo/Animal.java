package generic_class_demo;

public class Animal {
    String name = "default";
    
    public Animal(){
    }
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void move() {
        System.out.println("Animal " + name + " can move");
    }    
}
