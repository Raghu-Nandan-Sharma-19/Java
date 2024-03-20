public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Tony");
        System.out.println(name);
        // char at index 0
        System.out.println(name.charAt(0));
        // set char at index 0
        name.setCharAt(0, 'P');
        System.out.println(name); // Pony
        // insert
        name.insert(0, 'S');
        System.out.println(name); // SPony
        // delete the extra P
        name.delete(1, 2);
        System.out.println(name); // Sony
        name.setCharAt(0, 'T');
        System.out.println(name); // Tony
        // Append
        name.append(" Stark");
        System.out.println(name); // Tony Stark
        // Length
        System.out.println(name.length());
    }
}
