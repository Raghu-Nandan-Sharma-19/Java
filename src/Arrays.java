public class Arrays {
    public static void main(String[] args) {
        int[] age = new int[5];
        age[0] = 5;
        age[1] = 2;
        System.out.println(age[1]);

        // Declaring with initialization
        int[] marks = {98, 12, 45, 12, 65};
        System.out.println(marks[3]);

        // Using for each loop
        String[] names = {"Ram", "Rohit", "Novak", "Carlos", "Arthur"};
        for (String name:names) {
            System.out.println("Name is : " + name);
        }
    }
}
