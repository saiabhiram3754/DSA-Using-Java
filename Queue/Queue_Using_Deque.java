import java.util.*;

public class Stack_using_Deque{
   static class queue{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }

    }
    public static void main(String[] args){
        queue q = new queue();

        q.push(4);
        q.push(5);
        q.push(6);

        System.out.print(q.peek());
    }
}