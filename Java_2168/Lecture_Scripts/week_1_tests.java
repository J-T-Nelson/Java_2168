import java.util.ArrayList;
import java.util.List;

import generic_interface_demo.Notebook;

public class week_1_tests {
    public static void main(String[] args) {
        // List l = new ArrayList();
        // l.add("hello");
        // String s = (String) l.get(0);
        // System.out.println(s);

        List<String> list = new ArrayList<String>();
        list.add("hello Again, this is the second Hello");
        String s2 = list.get(0); // no cast
        System.out.println(s2);


        Notebook n1 = new Notebook("lingerDongs", 1000, 200, 17, 2);

        n1.testThis();
        n1.printProperties(false);
        n1.printProperties(true);

    }

}
