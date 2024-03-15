package Questions;

import java.util.Scanner;

public class tableUsingFunctions {
    public static void printTable(int number) {
        for(int i=1; i<=10; i++) {
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number whose table you want to print : ");
        int number = in.nextInt();
        printTable(number);
    }
}
