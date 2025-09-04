import java.util.*;

public class Max_Area {

    public static void MaxArea(int[] heights) {
        int n = heights.length;
        int nsr[] = new int[n]; // Next Smaller Right
        int nsl[] = new int[n]; // Next Smaller Left
        int maxarea = 0;

        Stack<Integer> s = new Stack<>();

        // Step 1: Next Smaller to Right (NSR)
        
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n; // if no smaller → boundary
            } else {
                nsr[i] = s.peek(); // store index
            }
            s.push(i);
        }

        // Step 2: Next Smaller to Left (NSL)

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1; // if no smaller → boundary
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Step 3: Calculate max area
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currentArea = height * width;
            maxarea = Math.max(currentArea, maxarea);
        }

        System.out.println("Maximum area in histogram is: " + maxarea);
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        MaxArea(heights);
    }
}
