public class AddFirst_Last {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newnode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void at_position(int data, int pos){
        if(pos == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data); 
        size ++;
        Node temp = head;
        int i = 0;
        while(i < pos - 1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void PrintLL(){
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if( size ==1 ){
            int val = head.data;
            head = tail =null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size --;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head ;
        for(int i =0; i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;    //tail.data
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }

    public static void main(String[] args) {
        AddFirst_Last ll = new AddFirst_Last();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.at_position(9, 2);
        ll.removeFirst();
        ll.PrintLL();
    }
}

