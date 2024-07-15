public class StringMethods {
    public static void main(String[] args) {
        String name = "Raghu", name1 = "  raghu  ";
        System.out.println("Name in uppercase is : "+name.toUpperCase());
        System.out.println("Name in lowercase is : "+name.toLowerCase());
        System.out.println("Name 1 after trimming spaces is : "+name1.trim());
        System.out.println("Does name starts with Rag ? "+name.startsWith("Rag"));
        System.out.println("Does name ends with ghu ? "+name.endsWith("ghu"));
        System.out.println("Is name and name1 equal ? "+name.equals(name1));
        System.out.println("In name one character at index three is : "+name.charAt(3));
        int age = 123;
        String stringAge = String.valueOf(age);
        System.out.println("After converting age in string is : "+stringAge);
        System.out.println("Replacing 'R' with 'Y' in name1 is : "+name.replace("R", "Y"));
        System.out.println("Does name1 contains 'R' ? "+name.contains("R"));
        System.out.println("Substring from index 0 to 3 is : "+name.substring(0, 3));
        String sentence = "I love Java";
        String[] words = sentence.split(" ");
        System.out.println("After spliting sentence on basis of ' ' is : ");
        for (String word : words) {
            System.out.println(word);
        }
        String color = "Brown";
        char[] letters = color.toCharArray();
        System.out.println("Converted string color to char array letters : ");
        for (char letter : letters) {
            System.out.println(letter);
        }
        System.out.println("Is name1 empty ? "+name1.isEmpty());
    }
}
