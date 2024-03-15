package Questions;

import java.util.Scanner;

public class circumferenceOfACircle {
    public static float calculateCircumference(float radius) {
        return 2.0F*3.14F*radius;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float radius = in.nextFloat();
        System.out.println("Circumference is : %.2f"+calculateCircumference(radius));
    }
}
