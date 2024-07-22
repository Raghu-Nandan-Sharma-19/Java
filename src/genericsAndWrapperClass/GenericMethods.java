package genericsAndWrapperClass;

public class GenericMethods {
    public static void main(String[] args) {
        printData("Java programming");
        printData(123);

        GenericMethods obj = new GenericMethods();
        obj.doubleData("Hi, I am java program");
        obj.doubleData(123);
    }

    static <E> void printData(E data) {
        System.out.println(data);
    }

    <E> void doubleData(E data) {
        System.out.println(data);
    }
}
