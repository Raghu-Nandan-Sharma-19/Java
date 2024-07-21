package exceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        
        int[] numbers = new int[5];

        try {
            System.out.println(numbers[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to excess the out of bound element");
        }

        try {
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("All exceptions handled");
        }

        System.out.println("End of the program");
    }
}
