package oops;

import java.util.Scanner;

public class Constructors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter real number : ");
        int real = in.nextInt();
        System.out.println("Enter imaginary number : ");
        int imaginary = in.nextInt();
        Complex num1 = new Complex(real, imaginary);
        num1.print();
        in.close();
    }   
}
class Complex {
    int a, b;
    public Complex(int real, int imaginary) {
        a = real;
        b = imaginary;
    }
    void print() {
        System.out.println("Complex number is : " + a + " + " + b + "i");
    }
}