package recursion;

import java.util.Scanner;

public class checkStringIsPalindrome {
    public static String reverseString(String str, int i) {
        if(i==str.length()) {
            return "";
        }
        return reverseString(str, i+1)+str.charAt(i);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = in.nextLine();
        System.out.println("Reverse of string is : ");
        System.out.println(reverseString(str, 0));
        if (str.equals(reverseString(str, 0))) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
