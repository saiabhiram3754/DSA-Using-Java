import java.util.*;

public class Reversal {
    // public static void reverse(int[] arr) {
    //     Stack<Integer> s = new Stack<>();
    //     Queue<Integer> q = new LinkedList<>();

    //     // Push array elements into stack
    //     for (int i = 0; i < arr.length; i++) {
    //         s.push(arr[i]);
    //     }

    //     // Pop from stack and add to queue
    //     for (int j = 0; j < arr.length; j++) {
    //         q.add(s.pop());
    //     }

    //     // Print and remove from queue
    //     while (!q.isEmpty()) {
    //         System.out.print(q.remove() + " ");
    //     }
    // }



     public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Push array elements into stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        // Pop from stack and add to queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // reverse(arr);
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        reverse(q);

         // Print and remove from queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
