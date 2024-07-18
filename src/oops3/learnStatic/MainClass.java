package oops3.learnStatic;

public class MainClass {

    public static void main(String[] args) {
        Children children1 = new Children();
        children1.name = "Novak";
        Children children2 = new Children();
        children2.name = "Carlos";
        Children children3 = new Children();
        children3.name = "Novak";

        System.out.println("Count of children is : " + Children.count);
    }

    static {
        System.out.println("Called from the static block");
    }
}
