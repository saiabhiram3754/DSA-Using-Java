package HashMap;
import java.util.*;

public class Union_Intersection {
    public static void main(String[] args) {
        int arr1[] = {1,3,2,5,1,3,1,5,1};
        int arr2[] = {3,5,7,9};

        HashSet<Integer> set = new HashSet<>();

        // union of two arrays
        for(int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Union: " + set.size()); // Output: [1, 2, 3, 5, 7, 9]

        // intersection of two arrays
        int count = 0;
        set.clear(); // clear the set to reuse it for intersection

        for(int i = 0; i < arr1.length; i++) {
           set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }

        System.out.println("Intersection: " + count); // Output: [3, 5]
        System.out.println("Count of Intersection Elements: " + count); // Output: 2
    }
}