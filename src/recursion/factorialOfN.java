package recursion;

import java.util.Scanner;

public class factorialOfN {
    // Functional recursion
    public static int calculateFactorial(int n) {
        if(n==0) {
            return 1;
        }
        return n*calculateFactorial(n-1);
    }
    // parameterised recursion
    /*public static void calculateFactorial(int i, int fact) {
        if(i<1) {
            System.out.println("Factorial is : ");
            System.out.println(fact);
            return;
        }
        calculateFactorial(i-1, fact*i);
    }*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial : ");
        int number = in.nextInt();
        // functional recursion call
         System.out.print("Factorial of "+number+" is : "+calculateFactorial(number));
        // Parameterised recursion call
        //calculateFactorial(number, 1);
    }
}
