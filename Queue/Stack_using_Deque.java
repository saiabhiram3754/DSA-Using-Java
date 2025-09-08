import java.util.*;

public class Stack_using_Deque{
   static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }

    }
    public static void main(String[] args){
        Stack s = new Stack();

        s.push(4);
        s.push(5);
        s.push(6);

        System.out.print(s.peek());
    }
}