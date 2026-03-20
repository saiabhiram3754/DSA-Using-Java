package HashMap;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("India");
        cities.add("China");
        cities.add("Nepal");
        System.out.println(cities);  // Output: [India, China, Nepal]

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("China");   
        lhs.add("Nepal");
        System.out.println(lhs);  // Output: [India, China, Nepal]

        TreeSet<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("China");    
        ts.add("Nepal");
        System.out.println(ts);  // Output: [China, India, Nepal]
    }
}
