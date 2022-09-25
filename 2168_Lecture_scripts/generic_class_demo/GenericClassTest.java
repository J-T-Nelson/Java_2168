package generic_class_demo;

public class GenericClassTest {

    public static void main(String[] args) {

        //non-generic
        IntegerContainerClass integerContainer = new IntegerContainerClass(10);
        System.out.println(integerContainer.getData());
        //Integer integerObject = integerContainer.getData();

        DoubleContainerClass doubleContainer = new DoubleContainerClass(21.68);
        System.out.println(doubleContainer.getData());
        //Double doubleObject = doubleContainer.getData();
        
        //generic
        GenericContainerClass<Integer> genericContainer1 = new GenericContainerClass<>(20);
         System.out.println(genericContainer1.getData());
        //Integer integerObject2 = genericContainer1.getData();       
        
        GenericContainerClass<String> genericContainer2 = new GenericContainerClass<>("donut");
         System.out.println(genericContainer2.getData());
        //String sweet = genericContainer2.getData();         

    }

}
