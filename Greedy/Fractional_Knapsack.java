import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        
        int val[] = {60, 100, 120};
        int weights[] = {10, 20, 30};
        int w = 50;

        // Store index and value/weight ratio
        double[][] ratio = new double[weights.length][2];
        for (int i = 0; i < weights.length; i++) {
            ratio[i][0] = i; // index
            ratio[i][1] = val[i] / (double) weights[i]; // ratio
        }

        // Sort by ratio (ascending)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        double finalVal = 0.0;

        // Traverse from highest ratio to lowest
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weights[idx]) {
                // Take full item
                finalVal += val[idx];
                capacity -= weights[idx];
            } else {
                // Take fractional part
                finalVal += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Maximum value in knapsack = " + finalVal);
    }
}
