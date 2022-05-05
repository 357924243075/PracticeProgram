import java.util.*;

public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<Integer>arrlist = new ArrayList<Integer>();
        System.out.println("Size before adding elements:"+arrlist.size());
        arrlist.add(11);
        arrlist.add(3);
        arrlist.add(5);
        arrlist.add(4);
        arrlist.add(9);

        System.out.println("Size after adding elements:"+arrlist.size());
        arrlist.remove(1);
        arrlist.remove(2);

        System.out.println("Size after removing elements:"+arrlist.size());
        System.out.println("Resulting ArrayList:");
        for(int num: arrlist) {
            System.out.println(num);
        }

    }
}
