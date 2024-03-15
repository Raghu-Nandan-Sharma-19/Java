package Questions;

import java.util.Scanner;

public class productUsingFunctions {
    public static int product(int num1, int num2) {
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();
        System.out.println("Product is : "+product(num1, num2));
    }
}
