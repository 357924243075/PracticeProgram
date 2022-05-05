import java.util.*;

public class TestJavaCollection {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ram");
        list.add("Sham");
        list.add("Radha");
        list.add("Anil");
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
