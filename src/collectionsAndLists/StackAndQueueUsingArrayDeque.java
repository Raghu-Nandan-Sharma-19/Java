package collectionsAndLists;

import java.util.ArrayDeque;

public class StackAndQueueUsingArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack is : " + stack);
        System.out.println("Removing top element from stack : " + stack.pop());
        System.out.println("Peek element in stack is : " + stack.peek());
        System.out.println("Stack is : " + stack);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue is : " + queue);
        System.out.println("Removing top element from queue : " + queue.poll());
        System.out.println("Peek element in queue is : " + queue.peek());
        System.out.println("Queue is : " + queue);
    }
}
