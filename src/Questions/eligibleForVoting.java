package Questions;

import java.util.Scanner;

public class eligibleForVoting {
    public static void checkEligibility(int age) {
        if(age>=18) {
            System.out.println("Eligible for voting");
        } else if(age<0) {
            System.out.println("Please enter age greater than 18");
        } else {
            System.out.println("Not eligible for voting");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = in.nextInt();
        checkEligibility(age);
    }
}
