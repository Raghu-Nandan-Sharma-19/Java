package recursion;

import java.util.Scanner;

public class print1ToN {
    public static void print(int i, int n) {
        if(i>n) {
            return;
        }
        System.out.println(i);
        print(i+1, n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an ending number : ");
        int number = in.nextInt();
        System.out.println("Printing numbers : ");
        print(1, number);
    }
}
