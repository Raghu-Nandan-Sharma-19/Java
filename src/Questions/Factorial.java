package Questions;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        int fact=1;
        for(int i=1; i<=num; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        System.out.println("Factorial of "+number+" is : "+factorial(number));
    }
}
