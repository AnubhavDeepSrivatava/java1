import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        System.out.println(q.remove(3));
    }
}
