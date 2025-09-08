public class circular_queue {
    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear+1)% size == front;
        }

        public void push(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size ;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            } else {
                front = (front+1)%size;
            }

            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.remove());
        q.push(4);
        System.out.println(q.remove());
        q.push(5);

         while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();  // remove after printing
        }
    }
}
