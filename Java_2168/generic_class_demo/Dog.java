package generic_class_demo;

public class Dog extends Animal {
    
    public Dog() {
        super("dog"); 
    }
    
    public Dog(String name) {
        super(name); 
    }
    
    @Override
    public void move() {
        System.out.println("Dog " + name + " can run and walk");
    }    
    
    public void bark() {
        System.out.println("Dog " + name + " can bark");
    }    
}
