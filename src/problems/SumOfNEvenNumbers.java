package problems;

import java.util.Scanner;

public class SumOfNEvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += (2 * i);
        }
        System.out.println("Sum of first "+ number +" even numbers is : " + sum);
        in.close();
    }
}