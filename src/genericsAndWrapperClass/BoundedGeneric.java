package genericsAndWrapperClass;

public class BoundedGeneric {
    public static void main(String[] args) {
        BoundedGeneric obj = new BoundedGeneric();

        printData1(123);
        obj.printData2(450);

    }

    static <E extends Number> void printData1(E data) {
        System.out.println(data);
    }

    <E extends Number> void printData2(E data) {
        System.out.println(data);
    }
}
