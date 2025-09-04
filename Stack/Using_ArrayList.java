package Stack;
import java.util.ArrayList;

public class Using_ArrayList {
    static class MyStack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]) {
        MyStack s = new MyStack();

        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // print top
            s.pop(); // remove top
        }
    }
}