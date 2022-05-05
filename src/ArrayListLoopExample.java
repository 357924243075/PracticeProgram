import java.util.*;

public class ArrayListLoopExample {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(4);
        al.add(10);
        al.add(9);
        al.add(8);
        al.add(5);
        System.out.println("Using Advanced For Loop");

        for(Integer num:al) {
            System.out.println(num);
        }
    }
}
