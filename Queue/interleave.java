import java.util.*;

public class interleave {
    public static void interleave(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 0; i < mid; i++) {
            q1.add(arr[i]);
        }

        int i = mid; // start from second half
        while (!q1.isEmpty()) {
            System.out.print(q1.remove() + " ");  // from first half
            System.out.print(arr[i++] + " ");     // from second half
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        interleave(arr);
    }
}
