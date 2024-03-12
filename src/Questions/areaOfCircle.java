package Questions;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double radius = in.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println("Area of circle is : "+area);
    }
}
