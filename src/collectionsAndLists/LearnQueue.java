package collectionsAndLists;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println("Queue is : " + q);
        System.out.println("Removing top element from the queue : " + q.poll());
        System.out.println("Queue is : " + q);
        System.out.println("Peek element in queue is : " + q.peek());
        System.out.println("Queue is : " + q);
        System.out.println("Printing queue : ");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }    
}
