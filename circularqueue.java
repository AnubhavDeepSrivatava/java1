//rear=(rear+1)%size
public class circularqueue {
    static class queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean full() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (full()) {
                System.out.println("full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peak
        public static int peek() {
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue obj = new queue(5);
        obj.add(10);
        obj.add(20);
        System.out.println(obj.peek());
    }

}
