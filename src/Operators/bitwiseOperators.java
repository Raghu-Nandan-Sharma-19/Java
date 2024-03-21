package Operators;

public class bitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 6;
        // bitwise AND --> &
        System.out.println(a&b); // 4
        // bitwise OR --> |
        System.out.println(a|b); // 7
        // bitwise XOR --> ^
        System.out.println(a^b); // 3
        // bitwise one's complement --> ~
        System.out.println(~a); // -6
        // bitwise left shift --> <<
        System.out.println(a<<1); // 10
        // bitwise right shift --> >>
        System.out.println(a>>1); // 2
    }
}
