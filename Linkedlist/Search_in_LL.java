public class Search_in_LL {
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

        // iterative search

        // public int Search(int key){
        //     int i = 0;
        //     Node temp = head;
        //     while(temp != null){
        //         if(temp.data == key){
        //             return i;
        //         }
        //         temp = temp.next;
        //         i++;
        //     }
        //     return -1;
        // }

        public int helper(Node head,int key){
            //base case
            if(head == null){
                return -1;
            }

            if(head.data == key){
                return 0;
            }

            //recursive call
            int index = helper(head.next, key);
            if(index == -1){
                return -1;
            }
            // based on the index value we are return the position
            return index+1;
        }

        public int recSearch(int key){
            return helper(head,key);
        }

        //just print values in reverse order

        public void Reverse(Node head){
            //base case
            if(head == null){
                return;
            }
            //recursive step call
            Reverse(head.next);
            // printing the data
            System.out.print(head.data+" ");
        }

        // maintain 3 variables and 4 steps apply iteratively
        // total reverse the linkedlist 
        public void IterReverse(){
            Node prev = null;
            Node current = head;
            Node next;

            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }

        //remove element from the 
        //nth position from the end/backside
        public void Rmove_nth_element(int pos){
            //calculate size
            int sz = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                sz++;
            }

            // condition for size = 1 
            if(pos == sz){
                head = head.next;
                return;
            }

            int i = 1;
            Node prev = head;
            while(i < sz - pos){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
            // System.out.print(i + " ");
        }

        public static boolean DectedLoop(){
            Node slow = head;           // slow pointer
            Node fast = head;
            while(fast.next != null && fast != null){
                slow = slow.next;   // slow pointer is always increased by +1
                fast = fast.next.next;// fast pointer is always increased by +2
                if(slow == fast){
                    return true; //loop is exits
                }
            }
            return false;  // loop is not exits
        }

        public static void remove_cycle(){
            //dect cycle is present or not
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while(fast != null && fast.next != null){
               slow = slow.next;
               fast = fast.next.next; 
               if(slow == fast){
                cycle = true;
                break;
               }
            }
            if(cycle == false){
                return;
            }
            //find 2nd meeting point
            slow = head;
            Node prev = null;
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next.next;
            }

            // prev node is the last node  
            prev.next = null;
        }

        //slow - fast approach - helper function

        public Node Find_mid(Node head){
            Node slow;
            Node fast;

            slow = head;
            fast = head;
            while(fast !=null &&fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        // palindrome or not
        public boolean palindrome_or_Not(){
            if(head == null || head.next == null){
                return true;
            }
            // step1 - find mid
            Node midNode = Find_mid(head);

            // step2 - reverse 2nd half

            Node prev = null; 
            Node current = midNode;
            Node Next;

            while(current != null){
                Next = current.next;
                current.next = prev;
                prev = current;
                current = Next;
            }

            // step3 - check left and right are equal or not
            Node right = prev;  // right side reversed part head
            Node left = head;

            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                right = right.next;
                left = left.next;
            }
            return true;
        }

        public static void main(String[] args) {
            Search_in_LL ll = new Search_in_LL();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(4);
            ll.addLast(5);
            ll.at_position(3, 2);
            // ll.removeFirst();
            ll.PrintLL();
            // System.out.println(ll.recSearch(9));
            // ll.Reverse(head);
            // ll.IterReverse();
            // ll.PrintLL();
            ll.Rmove_nth_element(2);
            ll.PrintLL();
            ll.palindrome_or_Not();
        }
}