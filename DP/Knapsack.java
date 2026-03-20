package DP;
import java.util.*;

public class Knapsack {

    // Recursive Solution --- O(2^n) time complexity and O(n) space complexity
    public static int knapsack(int val[], int wt[], int W, int n) {

        if(W == 0 || n == 0) {
            return 0;
        }

        if(wt[n-1] <= W) {

            // Valid -- > Include the item and exclude the item
            int ans1 = val[n-1] + knapsack(val, wt, W - wt[n-1], n - 1);

            // Valid --> Exclude the item
            int ans2 = knapsack(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
        } else {

            // Invalid --> Exclude the item
            return knapsack(val, wt, W, n - 1);
        }
    }

    // Recursive Solution with Memoization --- O(n*W) time complexity and O(n*W) space complexity
    public static int knapsackDP(int val[], int wt[], int W, int n, int dp[][]) {

        if(W == 0 || n == 0) {
            return 0;
        }

        if(dp[W][n] != -1) {
            return dp[W][n];
        }
         if(wt[n-1] <= W) {

            // Valid -- > Include the item and exclude the item
            int ans1 = val[n-1] + knapsackDP(val, wt, W - wt[n-1], n - 1, dp);

            // Valid --> Exclude the item
            int ans2 = knapsackDP(val, wt, W, n - 1, dp);

            dp[W][n] = Math.max(ans1, ans2);
            return dp[W][n];
        } else {

            // Invalid --> Exclude the item
            dp[W][n] = knapsackDP(val, wt, W, n - 1, dp);
            return dp[W][n];
        }
    }
    
    // Tabulation Method  --- O(n*W) time complexity and O(n*W) space complexity
    public static void knapsackTabulation(int val[], int wt[], int W, int n, int dp[][]) {

        for(int i = 0; i < n + 1; i++) {
            dp[0][i] = 0;  // Base case: When the capacity is 0, the maximum value is 0
        }

        for(int j = 0; j < dp[0].length; j++) {
            dp[j][0] = 0;  // Base case: When there are no items, the maximum value is 0
        }

        for(int i = 1; i < n + 1; i++) {
            for(int j = 0; j < W + 1; j++) {
                if(wt[i-1] <= j) { // Valid --> Include the item and exclude the item
                     
                    int ans1 = val[i-1] + dp[i-1][j-wt[i-1]];  // Include the item
                    int ans2 = dp[i-1][j];  // Exclude the item

                    dp[i][j] = Math.max(ans1, ans2);  // Include the item and exclude the item

                } else {// Invalid --> Exclude the item
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println("Maximum value that can be obtained (Tabulation): " + dp[n][W]);
    }


    public static void main(String [] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;

        int dp[][] = new int[val.length + 1][W + 1];
        for(int i = 0; i < val.length + 1; i++) {
            for(int j = 0; j < W + 1; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Maximum value that can be obtained: " + knapsack(val, wt, W, val.length));
        System.out.println("Maximum value that can be obtained (DP): " + knapsackDP(val, wt, W, val.length, dp));
        
        knapsackTabulation(val, wt, W, val.length, dp);
        System.out.println("Maximum value that can be obtained (Tabulation): " + dp[val.length][W]);

    }    
}
