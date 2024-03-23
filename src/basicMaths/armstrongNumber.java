package basicMaths;

import java.util.Scanner;
import java.lang.Math;

public class armstrongNumber {
    public static boolean checkArmstrong(int n) {
        int originalNumber = n, duplicate = n, sum = 0, count = 0;
        while(n>0) {
            count++;
            n/=10;
        }
        while(duplicate>0) {
            int lastDigit = duplicate%10;
            sum+=Math.pow(lastDigit, count);
            duplicate/=10;
        }
        if(originalNumber==sum) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        if(checkArmstrong(number)) {
            System.out.println(number+" is an armstrong number.");
        } else {
            System.out.println(number+" is not an armstrong number");
        }
    }
}
