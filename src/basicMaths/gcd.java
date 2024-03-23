package basicMaths;

import java.util.Scanner;

import static java.lang.Math.min;

public class gcd {
    public static int getGcd(int n1, int n2) {
        /*for(int i=min(n1, n2); i>=1; i--) {
            if(n1%i==0 && n2%i==0) {
                System.out.println(i);
                break;
            }
        }*/
        // Euclidean algorithm
        while(n1>0 && n2>0) {
            if(n1>n2){
                n1 = n1%n2;
            } else {
                n2 = n2%n1;
            }
        }
        if(n1==0) {
            return n2;
        } else {
            return n1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = in.nextInt();
        System.out.println("Enter second number : ");
        int number2 = in.nextInt();
        int result = getGcd(number1, number2);
        System.out.print("Greatest common factor of "+number1+" and "+number2+" is : "+result);
    }
}
