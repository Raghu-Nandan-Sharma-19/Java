import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // first way --> with new keyword
//        int[][] numbers = new int[3][3];
        // second way --> input from user
        System.out.println("Enter number of rows : ");
        int rows = in.nextInt();
        System.out.println("Enter number of columns : ");
        int columns = in.nextInt();
        int[][] matrix = new int[rows][columns];
        // input
        // rows
        System.out.println("Enter elements of matrix : ");
        for(int i=0; i<rows; i++) {
            // columns
            for(int j=0; j<columns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Printing matrix : ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}