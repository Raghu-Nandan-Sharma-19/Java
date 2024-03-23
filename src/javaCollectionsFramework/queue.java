package javaCollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        // Implementing queue using linked list

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);  // Inserts elements in queue
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());  // removes the first element in queue

        System.out.println(queue);

        System.out.println(queue.peek()); // returns the top element in the queue

        // To implement queue using LinkedList use new ArrayList instead of new LinkedList
    }
}
