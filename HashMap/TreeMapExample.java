package HashMap;
import java.util.*;

// TreeMap Will Follow the Order of Keys (Sorted Order), 
// For String it will be in Lexicographical Order(Alphabetical Order)
// put, get, remove operations in TreeMap will take O(log n) time complexity
// implemented using Red-Black Tree Data Structure

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> thm = new TreeMap<>();

        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("Nepal", 5);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);   
        hm.put("Nepal", 5);

        System.out.println(thm);  //  Output: {China=150, India=100, Nepal=5}
        System.out.println(hm);   //  Output: {China=150, India=100, Nepal=5}

    }
}
