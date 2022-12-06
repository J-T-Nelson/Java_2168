package Lab_5_helper_files.linear_search_recursive;

public class RecursiveLinearSearch {

    public static void main(String[] args) {
        String sweet = "icecream";
        String[] sweetArray = {"cake", "donut", "choclate", "cookie", "icecream"};
        //call the public linearSearch(...) method: search nameArr for name.
        
        System.out.println(linearSearch(sweetArray, sweet));
        //Use the following if calling linearSearch(..) method from another class.
        //System.out.println(RecursiveLinearSearch.linearSearch(sweetArray, sweet));

    }

    /**
     * Public Wrapper for recursive linear search method
     * @param items The array being searched
     * @param target The object being searched for
     * @return The subscript of target if found; otherwise -1
     */    
    public static int linearSearch(Object[] items,
            Object target) {
        //call the private recursive linearSearch(...), 
        //    start the search from first item in the array
        return linearSearch(items, target, 0);
    }

    /**
     * Private recursive linear search method.
     * @param items The array being searched
     * @param target The item being searched for
     * @param posFirst The position of the current first element
     * @return The subscript of target if found; otherwise -1
     */
    private static int linearSearch(Object[] items,
            Object target, int posFirst) {
        if (posFirst == items.length) {     //have checked all items in the array
            return -1;                      //failed search
        } else if (target.equals(items[posFirst])) { //found target; successful search
            return posFirst;
        }
        else {
            //Take recursive step: call the method itself
            //  In the next round, start the search from the item after the current first element
            return linearSearch(items, target, posFirst + 1);
        }
    }
    
}
