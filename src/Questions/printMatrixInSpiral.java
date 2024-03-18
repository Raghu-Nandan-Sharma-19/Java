package Questions;

import java.util.Scanner;

public class printMatrixInSpiral {
    public static void matrixInput(int[][] matrix, int rows, int columns) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements in matrix : ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }
    public static void displayMatrix(int[][] matrix, int rows, int columns) {
        System.out.println("The matrix is : ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiralMatrix(int[][] matrix, int rows, int columns) {
        int rowStart = 0;
        int rowEnd = rows-1;
        int columnStart = 0;
        int columnEnd = columns-1;
        System.out.println("Matrix in spiral order is : ");
        while(rowStart<=rowEnd && columnStart<=columnEnd) {
            for(int i=columnStart; i<=columnEnd; i++) {
                System.out.print(matrix[rowStart][i]+" ");
            }
            rowStart++;
            for(int i=rowStart; i<=rowEnd; i++) {
                System.out.print(matrix[i][columnEnd]+" ");
            }
            columnEnd--;
            for(int i=columnEnd; i>=columnStart; i--) {
                System.out.print(matrix[rowEnd][i]+" ");
            }
            rowEnd--;
            for(int i=rowEnd; i>=rowStart; i--) {
                System.out.print(matrix[i][columnStart]+" ");
            }
            columnStart++;
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
        displayMatrix(matrix, rows, columns);
        spiralMatrix(matrix, rows, columns);
    }
}
