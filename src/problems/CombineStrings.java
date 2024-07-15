package problems;

import java.util.Scanner;

public class CombineStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName = in.nextLine();
        System.out.println("Enter your last name : ");
        String lastName = in.nextLine();
        System.out.println("Your name is : " + firstName + " " +  lastName);
        in.close();
    }
}
