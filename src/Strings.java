import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        /* String declaration
           String firstName = "Tony";
           String lastName = "Stark";
           String fullName = firstName+" "+lastName;
           System.out.println("Full name : "+fullName);*/
        // User input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = in.nextLine();
        System.out.println("Your name is : "+name);
    }
}
