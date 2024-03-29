package hashing;

import java.util.Scanner;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = in.next();
        // pre compute
        int[] hash = new int[26];
        for(int i=0; i<str.length(); i++) {
            hash[str.charAt(i)-'a']++;
        }
        int q = in.nextInt();
        while(q-->0) {
            char c = in.next().charAt(0);
            // fetch
            System.out.println(hash[c-'a']);
        }
    }
}
