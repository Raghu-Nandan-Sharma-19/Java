package javaCollectionsFramework;

import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); // adds element in the deque
        adq.offerFirst(12); // adds element at  front
        adq.offerLast(45); // adds element at last

        System.out.println(adq);

        adq.offer(26);
        System.out.println(adq);

        System.out.println(adq.peek()); // returns peek element of the deque
        System.out.println(adq.peekFirst()); // returns first element of the deque
        System.out.println(adq.peekLast()); // returns last element of the deque

        System.out.println(adq.poll()); // removes first element from the queue
        System.out.println("Poll() : "+adq);

        System.out.println(adq.pollFirst()); // removes first element from the deque
        System.out.println("Poll first() : "+adq);

        System.out.println(adq.pollLast()); // removes last element from the deque
        System.out.println("Poll last() : "+adq);
    }
}
