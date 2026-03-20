package HashMap;
import java.util.*;

public class Count_Dis_Elements {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println("Count of Distinct Elements: " + set.size()); // Output: 4
    }
}
