package problems;

public class SumOfNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println("Sum is : " + sum);
    }
}