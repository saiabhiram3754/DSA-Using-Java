package HashMap;
import java.util.*;


// LinkedHashMap Will follow the Order of Insertion 
// HashMap Will Not Follow the Order of Insertion
// implemented using Hash Table and Doubly Linked List Data Structure

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Nepal", 5);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);   
        hm.put("Nepal", 5);

        System.out.println(lhm);  //  Output: {India=100, China=150, Nepal=5}
        System.out.println(hm);   //  Output: {China=150, India=100, Nepal=5}
    }
}
