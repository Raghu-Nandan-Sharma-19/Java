package Questions;

import java.util.Scanner;

public class reverseAString {
    public static void reverseString(StringBuilder str) {
        for(int i=0; i<str.length()/2; i++) {
            int front = i;
            int back = str.length()-1-i;
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);
            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder("");
        System.out.println("Enter String : ");
        str.append(in.nextLine());
        reverseString(str);
    }
}
