package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(40);
        queue.offer(50);
//        System.out.println(queue.remove());
//        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeLast());
//        System.out.println(queue.pollFirst());
//        System.out.println(queue.pollLast());
        System.out.println(queue.peekLast());
        System.out.println(queue.peekFirst());
//        System.out.println(queue.element());
//        System.out.println(queue.element());
//        System.out.println(queue.getFirst());
//        System.out.println(queue.getLast());
    }
}
