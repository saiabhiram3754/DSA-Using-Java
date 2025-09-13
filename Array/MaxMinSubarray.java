import java.util.*;

public class MaxMinSubarray {

    // 1. Brute Force Method (O(n^3))
    // Idea: Generate all possible subarrays, calculate their sums,
    // and track maximum and minimum sums.
    public static void maxMinSubarraySumBruteForce(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;  // stores maximum subarray sum
        int minSum = Integer.MAX_VALUE;  // stores minimum subarray sum

        // Choose start index
        for (int i = 0; i < n; i++) {
            // Choose end index
            for (int j = i; j < n; j++) {
                int sum = 0;
                // Calculate sum of subarray arr[i...j]
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                // Update max and min
                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);
            }
        }

        System.out.println("Brute Force → Max Sum = " + maxSum + ", Min Sum = " + minSum);
    }

    // 2. Prefix Sum Method (O(n^2))
    // Idea: Use prefix sums to calculate subarray sums quickly.
    // subarray(i..j) = prefix[j] - prefix[i-1]
    public static void maxMinSubarraySumPrefix(int arr[]) {
        int n = arr.length;

        // Build prefix array
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        // Check all subarrays using prefix sum formula
        for (int i = 0; i < n; i++) {   // start  = i
            for (int j = i; j < n; j++) {  // end  = j
                int sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);
            }
        }

        System.out.println("Prefix Sum → Max Sum = " + maxSum + ", Min Sum = " + minSum);
    }

    // 3. Kadane’s Algorithm (O(n))
    // Idea: Dynamic programming / greedy approach.
    // At each step, decide whether to add the current element
    // to the existing subarray OR start a new subarray.
    // Works for both maximum and minimum subarray sums.
    public static void maxMinSubarraySumKadane(int arr[]) {
        int n = arr.length;

        // Initialize with first element
        int maxsum = Integer.MIN_VALUE;
        int cs = 0;  // current sum
        int currMin = arr[0], minSum = arr[0];

        // Traverse array
        for (int i = 1; i < n; i++) {
            // For maximum sum: either extend current subarray or start new
            cs = cs + arr[i];
            if(cs < 0){
                cs =0 ;
            }

            maxsum = Math.max(maxsum, cs);

            // For minimum sum: either extend current subarray or start new
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);
        }

        System.out.println("Kadane’s → Max Sum = " + maxsum + ", Min Sum = " + minSum);
    }

    public static void main(String[] args) {
        int arr[] = {2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Finding max & min subarray sums using 3 methods:\n");

        maxMinSubarraySumBruteForce(arr); // O(n^3)
        maxMinSubarraySumPrefix(arr);     // O(n^2)
        maxMinSubarraySumKadane(arr);     // O(n)
    }
}
