package recursion;

import java.util.Scanner;

public class printNumbers {
    static int count = 0;
    public static void print(int n) {
        if(count==n) {
            return;
        }
        System.out.println(count);
        count++;
        print(n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number till you want to print numbers : ");
        int number = in.nextInt();
        print(number);
    }
}
