package basicMaths;

import java.util.Scanner;

import static java.lang.Math.log10;

public class countDigits {
    public static int calculateCount(int n) {
//        int count = 0;
//        while(n>0) {
//            count++;
//            n=n/10;
//        }
        int count = (int)(log10(n)+1);
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        System.out.println("The number of digits are : "+calculateCount(number));
    }
}
