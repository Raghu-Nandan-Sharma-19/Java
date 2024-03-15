package Questions;

import java.util.Scanner;

public class averageOfThreeNumbers {
    public static int getAverage(int num1, int num2, int num3) {
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println("Average is : "+getAverage(num1, num2, num3));
    }
}
