public class Using_LL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null & tail == null;
        }

        public static void push(int data){
            Node newnode = new Node(data);

            if(head == null){
                head = tail = newnode;
                return;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is full");
                return -1;
            }

            int val = head.data;
            if(head == tail){
                tail = head = null;
            } else {
                head = head.next;
            }
            return val;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is full");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();

        q.push(1);
        q.push(2);
        q.push(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();  // remove after printing
        }
    }
}