package Questions;

import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = in.nextInt();
        System.out.println("Enter second number : ");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        System.out.println("Sum is : "+sum);
    }
}
