package recursion;

import java.util.Scanner;

public class sumOfFirstNNumbers {
    // Parameterised recursion
    /*public static void calculateSum(int i, int sum) {
        if(i<1) {
            System.out.print("Sum is : ");
            System.out.println(sum);
            return;
        }
        calculateSum(i-1, sum+i);
    }*/
    // Functional recursion
    public static int calculateSum(int n) {
        if(n==0) {
            return 0;
        }
        return n+calculateSum(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        // Functional recursion call
        System.out.print("Sum of first "+number+" natural numbers is : "+calculateSum(number));
        // Parameterised recursion call
        // calculateSum(number, 0);
    }
}
