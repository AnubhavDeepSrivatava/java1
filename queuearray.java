public class queuearray {
  static class queue {
        static int arr[];
        static int size;
         static int rear=-1;
        queue(int n)
        {
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
        public static void add( int data) {
            if(rear==size-1)
            {
                System.out.println("full");
                return ;
            }
            rear++;
            arr[rear]=data;
        }
        public static int dequeue()
        {
            if(isEmpty())
            {
                System.out.println("empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++ )
            {
                arr[i]=arr[i+1];
            }
            return front;
        }
        //peak
        public static int peek()
        {
            return arr[0];
        }
    }

    public static void main(String[] args) {
        queue obj =new queue(5);
        obj.add(10);
        obj.add(20);
        System.out.println(obj.peek());
    }

}
