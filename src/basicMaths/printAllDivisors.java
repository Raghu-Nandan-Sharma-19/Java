package basicMaths;

import java.util.Scanner;

public class printAllDivisors {
    public static void printDivisors(int n) {
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        printDivisors(number);
    }
}
