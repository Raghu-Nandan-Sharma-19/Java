package basicMaths;

import java.util.Scanner;

public class palindromeNumber {
    public static boolean checkPalindrome(int n) {
        int originalNumber = n, revNum=0;
        System.out.println("Original number is : "+n);
        while(n>0) {
            int lastDigit = n%10;
            n/=10;
            revNum = (revNum*10) + lastDigit;
        }
        System.out.println("Reverse number is : "+revNum);
        if(revNum==originalNumber) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        if(checkPalindrome(number)) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
