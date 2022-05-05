import java.util.*;

public class TreeMapIteratorExample {
    public static void main(String args[]) {
        TreeMap<String, String> treemap = new TreeMap<String, String>();
        treemap.put("Key1","Bhagu");
        treemap.put("Key2","Racchu");
        treemap.put("Key3","Sunnu");
        treemap.put("Key4","Renuu");
        treemap.put("Key5","Priyuu");

        Set set = treemap.entrySet();
        Iterator it = set.iterator();
        System.out.println("TreeMap contains:");
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println("Key is:"+pair.getKey()+"and");
            System.out.println("Value is:"+pair.getValue());
        }
    }
}
