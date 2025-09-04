public class Using_LL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newnode = new Node(data);

            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // print top
            s.pop();                      // remove top
        }
    }
}

// import java.util.Stack;

// public class stack {
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         s.pop(); //remove 4

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }

//         if (!s.isEmpty()) {
//             System.out.println(s.peek());
//         } else {
//             System.out.println("Stack is empty, cannot peek.");
//         }
//     }
// }