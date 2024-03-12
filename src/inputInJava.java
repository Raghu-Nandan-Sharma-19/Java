import java.util.Scanner;

public class inputInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.nextLine(); // or in.next for single word
        System.out.println("Name is : "+ name);
    }
}
