package collectionsAndLists;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> cars = new Stack<>();

        cars.push("Rolls Royce Phantom");
        cars.push("BMW M5");
        cars.push("Range Rover Evouque");
        cars.push("Toyota Land Cruiser");

        System.out.println("Stack is : ");
        System.out.println(cars);

        System.out.println("Removing car at top from stack : " + cars.pop());
        System.out.println(cars);

        System.out.println("Car at top of stack is : " + cars.peek());

        System.out.println("Is stack empty ? " + cars.empty());

        System.out.println("Printing stack from top car : ");
        for (int i = cars.size() - 1; i >= 0; i--) {
            System.out.println("Car at position " + i + " is : " + cars.get(i));
        }
    }
}
