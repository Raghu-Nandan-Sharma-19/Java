public class NestedIfElse {
    public static void main(String[] args) {
        int num1 = 5, num2 = 4, num3 = 9;
        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println("Number 1 is greatest " + num1);
            } else {
                System.out.println("Number 3 is greatest " + num3);
            }
        } else {
            if(num2 > num3) {
                System.out.println("Number 2 is greatest " + num2);
            } else {
                System.out.println("Number 3 is greatest " + num3);
            }
        }
    }
}