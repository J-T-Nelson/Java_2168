package arraylist_demo;

/**
 *
 * @author cindy
 */
public class Dog extends Animal {
    public Dog() {
        super("dog");
    }

    public Dog(String name) {
        super(name);
    }

     //method overriding: same method signature
    @Override
    public void move() {
        //super.move();
        System.out.println("Dog" + getName() + " can run and walk");
    }

    public void bark() {
        System.out.println("Dog" + getName() + " can bark");
    }
}
