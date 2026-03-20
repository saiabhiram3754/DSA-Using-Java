package HashMap;
import java.util.*;

public class MajorityElements {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            // if(map.containsKey(arr[i])) {             // updates the value of the key if it is already present in the map
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     map.put(arr[i], 1); 
            // }
            
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> keys = map.keySet();  // returns a Set view of the keys contained in this map 
        for(Integer key : keys) {
            if(map.get(key) > arr.length / 3 ) {
                System.out.println("Majority Element: " + key);
            }
        }

    }
}
