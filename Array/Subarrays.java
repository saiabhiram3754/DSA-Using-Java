import java.util.*;

public class Subarrays {

    // Function to print all subarrays and return count
    public static int printSubarrays(int arr[]) {
        int n = arr.length;
        int count = 0;  // to count subarrays

        for (int i = 0; i < n; i++) {         // start index
            for (int j = i; j < n; j++) {     // end index
                // Print subarray from i to j
                System.out.print("{ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("}  ");
                count++; // one subarray found
            }
            System.out.println(); // new line for clarity
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        System.out.println("All subarrays of the array:");
        int total = printSubarrays(arr);  // function call

        System.out.println("\nTotal number of subarrays: " + total);
    }
}
