package Operators;

public class logicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        // Logical AND --> &&
        System.out.println(a<b && b<c); // true
        // Logical OR --> ||
        System.out.println(a<b || b>c); // true
        // Logical NOT --> !
        System.out.println(!(a<b)); // false
    }
}
