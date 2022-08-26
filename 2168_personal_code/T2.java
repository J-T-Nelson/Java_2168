public class T2 {
    
    public static void main(String[] args) {
        CatTUT1 myCat = new CatTUT1();
        AnimalTUT1 myAnimal = myCat;
        AnimalTUT1.testClassMethod(); 
        CatTUT1.testClassMethod();
        myAnimal.testInstanceMethod();
        System.out.println(myAnimal.equals(myCat) + "\nClass Type of myAnimal: " + myAnimal.getClass().getName()); // prints 'true'

        //AnimalTUT1.testInstanceMethod();
        // ^^ Cannot make a static reference to the non-static method testInstanceMet () from the type AnimalTUT
        //myAnimal.testClassMethod();
        // ^^ The static method testClassMethod() from the type AnimalTUT1 should be accessed in a static way
    }

    // public class Animal {
    //     public static void testClassMethod() {
    //         System.out.println("The static method in Animal");
    //     }
    //     public void testInstanceMethod() {
    //         System.out.println("The instance method in Animal");
    //     }
    // }

    // public class Cat extends AnimalTUT1 {
    //     public static void testClassMethod() {
    //         System.out.println("The static method in Cat");
    //     }
    //     public void testInstanceMethod() {
    //         System.out.println("The instance method in Cat");
    //     }
    // }
}
