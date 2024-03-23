package basicMaths;

import java.util.Scanner;

public class reverseNumber {
    public static int getReverseNumber(int n) {
        int revNumber = 0;
        while(n>0) {
            int lastDigit = n%10;
            n/=10;
            revNumber = (revNumber*10) + lastDigit;
        }
        return revNumber;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        System.out.println(number+" in reverse is : "+getReverseNumber(number));
    }
}
