import java.util.Scanner;

public class Functions {
    public static void printName(String name) { // function definition
        System.out.println("Name is : "+name); // function body
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.nextLine();
        printName(name); // calling the function
    }
}
