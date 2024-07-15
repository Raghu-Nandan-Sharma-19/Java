import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int students = in.nextInt();
        System.out.println("Enter number of subjects : ");
        int subjects = in.nextInt();
        int[][] marks = new int[students][subjects];
        System.out.println("Enter marks : ");
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = in.nextInt();
            }
        }
        System.out.println("Marks of every " + students + " student in " + subjects + " subjects are : ");
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}