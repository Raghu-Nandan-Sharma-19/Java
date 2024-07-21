package exceptionHandling;

public class ThrowsKeyword {
    public static void main(String[] args) {
        int[] numbers = new int[8];

        try {
            getNumberFromArray(numbers);
        } catch (Exception e) {
            System.out.println("Catched expression : " + e.getMessage());
        }
    }

    static int getNumberFromArray(int[] numbers) throws ArrayIndexOutOfBoundsException {
        return numbers[9];
    }
}
