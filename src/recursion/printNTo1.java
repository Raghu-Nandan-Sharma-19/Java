package recursion;

import java.util.Scanner;

public class printNTo1 {
    public static void print(int n, int  i) {
        if(n<i) {
            return;
        }
        System.out.println(n);
        print(n-1, i);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        System.out.println("Printing numbers : ");
        print(number, 1);
    }
}
