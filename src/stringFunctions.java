public class stringFunctions {
    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Stark";
        // concatenation
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        // length of a string
        System.out.println("Length of string is : "+ fullName.length());
        // Accessing characters
        System.out.println("Printing characters of strings : ");
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        // Sub-string
        System.out.println("String from index 1 to 3 is : "+fullName.substring(1, 3));
    }
}
