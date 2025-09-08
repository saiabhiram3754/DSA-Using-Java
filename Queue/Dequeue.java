import java.util.*;

public class Dequeue{
    public static void main(String[] args){
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1
        deque.addLast(3);  // 2 1 3
        deque.addFirst(4); // 4 2 1 3
        System.out.print(deque);
    }
}

// addFirst()
// addLast()
// removeFirst()
// removrLast()
// getFirst()
// getLast()
