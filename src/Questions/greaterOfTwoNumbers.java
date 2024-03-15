package Questions;

import java.util.Scanner;

public class greaterOfTwoNumbers {
    public static void greatestOfTwoNumbers(int number1, int number2) {
        if(number1>number2) {
            System.out.println(number1+" is greater");
        } else if(number1<number2) {
            System.out.println(number2+" is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        greatestOfTwoNumbers(number1, number2);
    }
}
