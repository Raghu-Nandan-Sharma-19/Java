public class TypeConversions {
    public static void main(String[] args) {
        // Implicit conversion
        int count = 12;
        long countLong = count;
        System.out.println(countLong);

        // Explicit conversion
        long age = 64;
        int ageInt = (int)age;
        System.out.println(ageInt);
    }
}