import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = in.nextInt();
        System.out.println("Enter second number : ");
        int number2 = in.nextInt();
        if(number1==number2) {
            System.out.println("Equal");
        } else if (number1>number2) {
            System.out.println("Number 1 is greater");
        } else {
            System.out.println("Number 1 is lesser");
        }
    }
}
