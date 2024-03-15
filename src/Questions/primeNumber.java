package Questions;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        for(int i=2; i<=number; i++) {
            if(number%i==0) {
                System.out.println("Not a prime number.");
                break;
            } else {
                System.out.println("Prime number.");
                break;
            }
        }
    }
}
