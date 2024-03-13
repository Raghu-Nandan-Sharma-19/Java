package Questions;

import java.util.Scanner;

public class printTheGreeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 3 : ");
        int number = in.nextInt();
        switch(number) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Please enter a number from 1 to 3");
        }
    }
}
