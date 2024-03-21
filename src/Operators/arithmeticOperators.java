package Operators;

public class arithmeticOperators {
    public static void main(String[] args) {
        int a=10, b=5, c;
        // addition
        c = a+b;
        System.out.println(c); // 15
        // subtraction
        c = a-b;
        System.out.println(c); // 5
        // multiplication
        c = a*b;
        System.out.println(c); // 50
        // division
        c = a/b;
        System.out.println(c); // 2
        // modulus
        c = a%b;
        System.out.println(c); // 0
        // Increment
        a = 10;
        b = 0;
        // Pre increment
        b = ++a;
        System.out.println(a); // 11
        System.out.println(b); // 11
        // post increment
        a = 10;
        b = 0;
        b = a++;
        System.out.println(a); // 11
        System.out.println(b); // 10
        // Decrement
        a = 10;
        b = 0;
        // Pre decrement
        b = --a;
        System.out.println(a); // 9
        System.out.println(b); // 9
        // Post decrement
        a = 10;
        b = 0;
        b = a--;
        System.out.println(a); // 9
        System.out.println(b); // 10
    }
}
