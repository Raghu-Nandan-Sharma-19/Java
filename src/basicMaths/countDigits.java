package basicMaths;

import java.util.Scanner;

public class countDigits {
    public static int calculateCount(int n) {
        int count = 0;
        while(n>0) {
            int lastDigit = n%10;
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        System.out.println("The number of digits are : "+calculateCount(number));
    }
}
