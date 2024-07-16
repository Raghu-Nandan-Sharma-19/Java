package oops;

import java.util.Scanner;

public class ThisKeyword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter real number : ");
        int realNum = in.nextInt();
        System.out.println("Enter imaginary number : ");
        int imaginaryNum = in.nextInt();
        ComplexNumber num1 = new ComplexNumber(realNum, imaginaryNum);
        System.out.println("Enter second real number : ");
        int secondRealNumber = in.nextInt();
        System.out.println("Enter second imaginary number : ");
        int secondImaginaryNumber = in.nextInt();
        ComplexNumber num2 = new ComplexNumber(secondRealNumber, secondImaginaryNumber);
        ComplexNumber result = num1.add(num2);
        System.out.println("After adding both complex numbers : ");
        result.print();
        in.close();
    }
    static class ComplexNumber {
        int a, b;
        public ComplexNumber(int a, int b) {
            this.a = a;
            this.b = b;
        }
        void print() {
            System.out.println(a + " + " + b + "i");
        }
        ComplexNumber add(ComplexNumber num2) {
            this.print();
            num2.print();
            return new ComplexNumber(a + num2.a, b + num2.b);
        }
    }
}
