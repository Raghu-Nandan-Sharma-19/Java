package oops;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Greet greet1 = new Greet();
        greet1.greetings();
        Greet greet2 = new Greet();
        System.out.println("Enter name : ");
        String name = in.nextLine();
        greet2.greetings(name);
        in.close();
    }
    
}
class Greet {
    void greetings() {
        System.out.println("Hello, Good Morning");
    }
    void greetings(String name) {
        System.out.println("Hello " + name + ", Good Morning");
    }
}
