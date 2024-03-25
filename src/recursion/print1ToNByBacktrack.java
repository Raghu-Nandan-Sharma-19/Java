package recursion;

import java.util.Scanner;

public class print1ToNByBacktrack {
    public static void print(int i, int n) {
        if(i<1) {
            return;
        }
        print(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        System.out.println("Printing numbers : ");
        print(number, number);
    }
}
