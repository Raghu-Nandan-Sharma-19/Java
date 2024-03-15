package Questions;

import java.util.Scanner;

public class evenOrOddUsingFunctions {
    public static boolean evenOrOdd(int number) {
        if(number%2==0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        if(evenOrOdd(number)) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
