package problems;

import java.util.Scanner;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size = in.nextInt();
        
        int[] numbers = new int[size];
        int maximumNumber = Integer.MIN_VALUE;
        System.out.println("Enter " + size + " numbers : ");

        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }

        for (int number : numbers) {
            if(number > maximumNumber) {
                maximumNumber = number;
            }
        }

        System.out.println("Maximum number in array is : " + maximumNumber);
        in.close();
    }
}
