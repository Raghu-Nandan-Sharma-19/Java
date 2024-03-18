package Questions;

import java.util.Scanner;

public class transposeOfAMatrix {
    public static void matrixInput(int[][] matrix, int rows, int columns) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements of matrix : ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }
    public static void transposeMatrix(int[][] matrix, int rows, int columns) {
        System.out.println("Transpose of matrix is : ");
        for(int j=0; j<columns; j++) {
            for(int i=0; i<rows; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = in.nextInt();
        System.out.println("Enter number of columns : ");
        int columns = in.nextInt();
        int[][] matrix = new int[rows][columns];
        matrixInput(matrix, rows, columns);
        transposeMatrix(matrix, rows, columns);
    }
}
