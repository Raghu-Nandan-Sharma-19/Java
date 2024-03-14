package Questions;

import java.util.Scanner;

public class evenNumbersTillN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number till you want to print even numbers : ");
        int number = in.nextInt();
        for(int i=1; i<=number; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
