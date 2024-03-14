package Questions;

import java.util.Scanner;

public class tableOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to print the table : ");
        int number = in.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
}
