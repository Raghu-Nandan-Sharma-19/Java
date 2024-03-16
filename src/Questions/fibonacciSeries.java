package Questions;

import java.util.Scanner;

public class fibonacciSeries {
    public static void getFibonacciSeries(int number) {
        int firstNumber = 0, nextNumber = 1;
        int fibonacci;
        System.out.println("Fibonacci series is : ");
        for(int i=1; i<=number; ++i) {
            System.out.println(firstNumber+" ");
            fibonacci = firstNumber+nextNumber;
            firstNumber = nextNumber;
            nextNumber = fibonacci;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = in.nextInt();
        getFibonacciSeries(number);
    }
}
