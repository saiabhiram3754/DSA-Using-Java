import java.util.*;

public class NextGreater {
    public static void main(String args[]) {
        int[] array = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtgreater[] = new int[array.length];

        // Traverse from right to left
        for (int i = array.length - 1; i >= 0; i--) {
            
            // 1. Pop smaller elements
            while (!s.isEmpty() && array[s.peek()] <= array[i]) {
                s.pop();
            }

            // 2. If stack empty → -1, else top element
            if (s.isEmpty()) {
                nxtgreater[i] = -1;
            } else {
                nxtgreater[i] = array[s.peek()];
            }

            // 3. Push current index
            s.push(i);
        }

        // Print result
        System.out.println("Next Greater Element to Right:");
        for (int val : nxtgreater) {
            System.out.print(val + " ");
        }
    }
}


// next greater right 
// next greater left 
// next smaller right 
// next smaller left