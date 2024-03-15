package Questions;

import java.util.Scanner;

public class printSomethingAccordingToMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Enter student marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student marks (out of 100): ");
                    double marks = in.nextDouble();
                    if (marks>=90 && marks<=100) {
                        System.out.println("This is Good");
                    } else if (marks<=89 && marks>=60) {
                        System.out.println("This is also Good");
                    } else if (marks<=59 && marks>=0) {
                        System.out.println("This is Good as well");
                        System.out.println("Because marks don’t matter but our effort does.");
                    } else {
                        System.out.println("Invalid marks entered.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        } while (choice!=0);
    }
}
