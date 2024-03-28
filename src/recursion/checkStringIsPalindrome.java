package recursion;

import java.util.Scanner;

public class checkStringIsPalindrome {
    public static boolean reverseString(String str, int i) {
        if(i>=str.length()/2) {
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
            return false;
        }
        return reverseString(str, i+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = in.nextLine();
        if(reverseString(str, 0)) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }
}
