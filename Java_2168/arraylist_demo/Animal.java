package arraylist_demo;

/**
 *
 * @author cindy
 */
public class Animal {
    //self-practice
    //add a method equals to override the equals(Object other) in class Object
    //equals return true if this animal and other animal have the same name.
    private String name = "default";

    public Animal(){
    }

    //method overloading: same method name, different method signature
    public Animal(String name) {
        this.name = name;
    }

    //@Override <-- this is creating an error... not sure why but Its not picking up a super class for Animal with equals() method... maybe the signature is different? 
    public boolean equals(Animal other){
        if(this.name.equals(other.getName())){
            return true;
        }
        return false;
    }

    public String getName(){
		return name;
	}

    public void move() {
        System.out.println("Animal" + name + " shuffles about a bit...");
    }

    @Override
    public String toString(){
        return "name: " + name;
    }

}
