package problems;

import java.util.Scanner;

public class TableOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = in.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        in.close();
    }
}