package Questions;

import java.util.Scanner;

public class sumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N : ");
        int nNaturalNumbers = in.nextInt();
        int sum = 0;
        for(int i=1; i<=nNaturalNumbers; i++) {
            sum+=i;
        }
        System.out.println("Sum of first n natural numbers is : "+sum);
    }
}
