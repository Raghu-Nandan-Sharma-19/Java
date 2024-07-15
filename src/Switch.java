import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number between 1 to 7 : ");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Today is monday");
                break;
            case 2:
                System.out.println("Today is tuesday");
                break;
            case 3:
                System.out.println("Today is wednesday");
                break;
            case 4:
                System.out.println("Today is thursday");
                break;
            case 5:
                System.out.println("Today is friday");
                break;
            case 6:
                System.out.println("Today is saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Please enter number between 1 to 7");
                break;
        }
        in.close();
    }
}