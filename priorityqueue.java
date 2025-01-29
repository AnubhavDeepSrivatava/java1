import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {
        
    
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(1);
    pq.add(5);
    pq.add(2);
    pq.add(9);
    pq.add(0);
    System.out.println(pq.poll()); // prints 0
}
}
