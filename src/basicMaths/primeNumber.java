package basicMaths;

import java.util.Scanner;

public class primeNumber {
    public static boolean checkPrime(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count==2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        if(checkPrime(number)) {
            System.out.println(number+" is a prime number");
        } else {
            System.out.println(number+" is not a prime number");
        }
    }
}
