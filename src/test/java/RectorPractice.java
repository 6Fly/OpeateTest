import java.util.PriorityQueue;
import java.util.Queue;

public class RectorPractice {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(10);
        q.add(2);
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(4);
        q.add(7);
        q.add(6);
        q.add(9);
        q.forEach(System.out::println);


    }
}
