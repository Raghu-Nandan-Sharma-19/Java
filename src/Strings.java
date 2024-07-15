public class Strings {
    public static void main(String[] args) {
        String name = "Anuj";
        String newName = new String("Anuj");
        System.out.println(name);
        System.out.println(newName);
        if (name.equalsIgnoreCase(newName)) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }
    }
}