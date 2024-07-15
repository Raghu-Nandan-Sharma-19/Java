import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = in.nextInt();
        System.out.println("Your age is : " + age);
        in.close();
    }
}