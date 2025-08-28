public class DLL {
    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    } 
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.right = head;
        head.left = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.left = tail;
        tail.right = newNode;
        tail = newNode;
    }

    public void ith_position(int data, int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 0) {
            addFirst(data);
            return;
        }
        if (pos == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.right;
        }

        newNode.right = temp.right;
        newNode.left = temp;
        temp.right.left = newNode;
        temp.right = newNode;
        size++;
    }


    public void printll(){
        if(head == null){
            System.out.print("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.right;
        }
        System.out.println();
    }

    public Integer removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size --;
            return val;
        }else {
            int val = head.data;
            head = head.right;
            head.left = null;
            size --;
            return val;
        }
    }

    public Integer removeLast(){
        if(size == 0){
            return Integer.MIN_VALUE ;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size --;
            return val;
        }
        else{
            int val = tail.data;
            tail = tail.left;
            tail.right = null;
            size--;
            return val;
        }
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.right;
            curr.right = prev;
            curr.left = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(1);
        ll.ith_position(9, 2);
        ll.printll();
        ll.removeFirst();
        ll.printll();
        ll.reverse();
        ll.printll();
        System.out.println(size);
    }
}
