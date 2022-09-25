package generic_class_demo;

public class GenericMethodTest {
    
    public static <T> void checkEqual(T type1, T type2){

        if (type1.equals(type2)) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }

    
}
