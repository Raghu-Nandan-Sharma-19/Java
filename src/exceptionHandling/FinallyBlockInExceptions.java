package exceptionHandling;

public class FinallyBlockInExceptions {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        
        int[] numbers = new int[5];
        try {
            System.out.println(numbers[3]);
        } catch (Exception e) {
            System.out.println("All exceptions handled");
        } finally {
            System.out.println("I will run always");
        }

        System.out.println("End of the program");
    }
}
