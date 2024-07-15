public class Continue {
    public static void main(String[] args) {
        System.out.println("for loop");
        for (int i = 0; i <= 20; i++) {
            if(i == 2 || i == 8 || i >= 16) {
                continue;
            }
            System.out.println(i);
        }
    }
}