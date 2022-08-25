package generic_interface_demo;

//Generic Interface Practice
//make this class implement Comparable<T> interface in Java API.
//  compare animals based on their names in alphabetical order
//  return 0 if  names same
//         -1 if  this animal's name < other animal's name
//         1  if  this animal's name > other animal's name
public class Animal {

    private String name = "default";

    public Animal(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Animal " + name + " can move");
    }

}
