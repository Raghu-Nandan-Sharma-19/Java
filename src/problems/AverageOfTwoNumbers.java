package problems;

import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();
        System.out.println("Average of " + num1 + " and " + num2 + " is : " + average(num1, num2));
        in.close();
    }

    public static int average(int number1, int number2) {
        return (number1 + number2) / 2;
    }
}