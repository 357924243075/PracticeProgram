import java.util.*;

public class ArrayListDescendingSort {
    public static void main(String args[]) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Blue");
        arraylist.add("Black");
        arraylist.add("Pink");
        arraylist.add("Red");

        System.out.println("ArrayList Before Sorting:");
        for(String str: arraylist) {
            System.out.println(str);
        }
        Collections.sort(arraylist,Collections.reverseOrder());
        System.out.println("ArrayList in descending order:");
        for(String str: arraylist) {
            System.out.println(str);
        }
    }
}
