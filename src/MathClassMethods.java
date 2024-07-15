public class MathClassMethods {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        System.out.println("Minimum number is : " + Math.min(a, b));
        System.out.println("Maximum number is : " + Math.max(a, b));
        System.out.println("Square root of " + a + " is : " + Math.sqrt(a));
        System.out.println("4 raise to the power " + 2 + " is : " + Math.pow(a, 2));
        System.out.println("Absolute value of " + 4 + " is : " + Math.abs(a));
        System.out.println("Random value between " + a + " and " + b + " is : " + getRandom(a, b));
        System.out.println("Floor value of 5.9 is : " + Math.floor(5.9));
        System.out.println("Ceil value of 5.9 is : " + Math.ceil(5.9));
        System.out.println("Round off of 96 is : " + Math.round(98));
    }
    public static int getRandom(int a, int b) {
//        return (int) (Math.random() * 6) + 1; // to use this remove the parameters
        return (int) (Math.random() * (b - a + 1) + a);
    }
}