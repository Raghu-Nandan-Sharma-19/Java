package collectionsAndLists;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // min heap 
        Queue<Integer> pqMin = new PriorityQueue<>();
        pqMin.offer(30);
        pqMin.offer(40);
        pqMin.offer(10);
        pqMin.offer(20);
        System.out.println("Priority queue is : " + pqMin);
        System.out.println("Removing top element from Priority Queue : " + pqMin.poll());
        System.out.println("Peek element is : " + pqMin.peek());
        System.out.println("Priority queue is : " + pqMin);

        // max heap
        System.out.println("Priority queue using max heap : ");
        Queue<Integer> pqMax = new PriorityQueue<>((a, b) -> b - a);
        pqMax.offer(30);
        pqMax.offer(40);
        pqMax.offer(10);
        pqMax.offer(20);
        System.out.println("Priority queue is : " + pqMax);
        System.out.println("Removing top element from Priority Queue : " + pqMax.poll());
        System.out.println("Peek element is : " + pqMax.peek());
        System.out.println("Priority queue is : " + pqMax);
    }
}
