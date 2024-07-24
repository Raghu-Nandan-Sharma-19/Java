package collectionsAndLists;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(10);
        dq.offer(20);
        dq.offerFirst(30);
        dq.offerLast(40);

        System.out.println("Deque is : " + dq);
        System.out.println("Removing front element from deque : " + dq.poll());
        System.out.println("Removing last element from deque : " + dq.pollLast());
        System.out.println("Deque is : " + dq);
        System.out.println("Front element is : " + dq.peekFirst());
        System.out.println("Last element is : " + dq.peekLast());
        System.out.println("Deque is : " + dq);
    }
}
