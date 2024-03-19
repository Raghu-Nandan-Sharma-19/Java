package Questions;

import java.util.Scanner;

public class combinedLengthOfStrings {
    public static void inputStrings(String[] strings, int numberOfStrings) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter "+numberOfStrings+" strings : ");
        for(int i=0; i<numberOfStrings; i++) {
            strings[i] = in.nextLine();
        }
    }
    public static void combinedLength(String[] strings) {
        int totalLength = 0;
        System.out.println("Entered strings are : ");
        for(int i=0; i<strings.length; i++) {
            System.out.println(strings[i]);
            totalLength += strings[i].length();
        }
        System.out.println("Combined length of string is : "+totalLength);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of strings : ");
        int numberOfStrings = in.nextInt();
        String[] strings = new String[numberOfStrings];
        inputStrings(strings, numberOfStrings);
        combinedLength(strings);
    }
}
