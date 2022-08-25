
package generic_interface_demo;

public class Dog extends Animal {

    //method overloading: same method name + different parameter list
    public Dog() {
        super("dog");
    }


    public Dog(String name) {
        super(name);
    }


}

