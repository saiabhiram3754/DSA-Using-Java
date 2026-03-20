package HashMap;
import java.util.HashMap;

// implemented using Hash Table Data Structure

public class Basic {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Accessing values using keys
        System.out.println("Value for Apple: " + map.get("Apple")); // Output: 1
        System.out.println("Value for Banana: " + map.get("Banana")); // Output: 2

        // Checking if a key exists
        if (map.containsKey("Orange")) {
            System.out.println("Orange is present in the HashMap.");
        }

        // Removing a key-value pair
        map.remove("Banana");

        // Iterating through the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
