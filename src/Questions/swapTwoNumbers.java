package Questions;

import java.util.Scanner;

public class swapTwoNumbers {
    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping : "+num1+" "+num2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();
        swap(num1, num2);
    }
}
