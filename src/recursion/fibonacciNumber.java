package recursion;

import java.util.Scanner;

public class fibonacciNumber {
    public static int getFibonacci(int n) {
        if(n<=1) {
            return n;
        }
        int last = getFibonacci(n-1);
        int sLast = getFibonacci(n-2);
        return last+sLast;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        System.out.println("Fibonacci number is : "+getFibonacci(number));
    }
}
