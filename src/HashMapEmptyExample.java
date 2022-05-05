import java.util.*;

public class HashMapEmptyExample {
    public static void main(String args[]) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        System.out.println("Is HashMap Empty?"+hashmap.isEmpty());
        hashmap.put(11,"Apple");
        hashmap.put(22,"Banana");
        hashmap.put(33,"Mango");
        hashmap.put(44,"Pear");
        hashmap.put(55,"PineApple");
        System.out.println("Is HashMap Empty?"+hashmap.isEmpty());

    }
}
