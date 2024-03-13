package Questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = in.nextInt();
        System.out.println("Enter an operation(+,-,*,/,%) : ");
        char operation = in.next().charAt(0);
        System.out.println("Enter second number : ");
        int number2 = in.nextInt();
        switch(operation) {
            case '+':
                int sum = number1+number2;
                System.out.println("Sum is : "+sum);
                break;
            case '-':
                int difference = number1-number2;
                System.out.println("Difference is : "+difference);
                break;
            case '*':
                int product = number1*number2;
                System.out.println("Product is : "+product);
                break;
            case '/':
                double quotient = (double)number1/(double)number2;
                System.out.println("Quotient is : "+quotient);
                break;
            case '%':
                int remainder = number1%number2;
                System.out.println("Remainder is : "+remainder);
                break;
            default:
                System.out.println("Please enter a valid operation");
        }
    }
}
