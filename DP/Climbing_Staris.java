package DP;
import java.util.*;

public class Climbing_Staris {

    // Recursive Solution --- O(2^n) time complexity and O(n) space complexity

    public static int climbStairs(int n) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);

    }

    // Recursive Solution with Memoization --- O(n) time complexity and O(n) space complexity

    public static int climbStairsDP(int n, int[] ways) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (ways[n] != -1) {  // stores the value of ways[n] if it is already calculated
            return ways[n];
        }

        ways[n] = ways[n-1] + ways[n-2];

        return ways[n]; 
    }

    // Tabulation Method  --- O(n) time complexity and O(n) space complexity

    public static int climbStairsTabulation(int n, int[] ways) {
        
        // Tabulation method builds the solution from the bottom up, 
        // starting with the base case and iteratively filling in the values for 
        // larger subproblems until it reaches the original problem size n.
        for (int i = 1; i <= n; i++) {  
            if (i == 1) {
                ways[i] = ways[i - 1] + 0;  // Step from the previous stair
            } else {
                ways[i] += ways[i - 1] + ways[i - 2];  // Step from two stairs back
            }
        }

        return ways[n];
    }

    public static void main(String[] args) {
        int n = 6;

        // for memoization
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);   // Values are initialized to -1 to indicate that they have not been calculated yet
        
        // for tabulation
        int[] waysTab = new int[n + 1];
        Arrays.fill(waysTab, -1);   // Values are initialized to -1 to indicate that they have not been calculated yet
        waysTab[0] = 1;  // Base case: There is one way to climb zero stairs (do nothing)
        
        System.out.println(climbStairs(n));
        System.out.println(climbStairsDP(n, ways));
        System.out.println(climbStairsTabulation(n, waysTab));
    }
}
