package Questions;

import java.util.Scanner;

public class findNumberInTwoDArrays {

    public static void matrixInput(int[][] matrix, int rows, int columns) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements of matrix : ");
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
    public static void findElement(int[][] matrix, int rows, int columns, int element) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                if(matrix[i][j]==element) {
                    System.out.println("Element is found at index : ("+i+" , "+j+")");
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = in.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = in.nextInt();
        int[][] matrix = new int[rows][columns];
        matrixInput(matrix, rows, columns);
        System.out.println("Enter an element to search : ");
        int element = in.nextInt();
        displayMatrix(matrix, rows, columns);
        findElement(matrix, rows, columns, element);
    }
}
