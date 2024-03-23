package javaCollectionsFramework;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack : "+ animals);

        System.out.println(animals.peek());  // gets the element which is at the top

        animals.pop(); // pops(removes) the top element from the stack

        System.out.println("Stack : "+ animals);

        System.out.println(animals.peek());
    }
}
