package Questions;

import java.util.Scanner;

public class sumOfOddNumbersFrom1ToN {
    public static int sumOfOddNumbers(int number) {
        int sum = 0;
        for(int i=1; i<=number; i++) {
            if(i%2!=0) {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N : ");
        int number = in.nextInt();
        System.out.println("Sum of odd numbers from 1 to "+number+" is : "+sumOfOddNumbers(number));
    }
}
