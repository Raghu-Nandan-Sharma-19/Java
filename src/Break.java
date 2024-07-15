public class Break {
    public static void main(String[] args) {
        System.out.println("for loop");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            if(i >= 4) {
                break;
            }
        }
        System.out.println("while loop");
        int i = 0;
        while (i <= 8) {
            System.out.println(i);
            i++;
            if (i == 3) {
                break;
            }
        }
        System.out.println("do while loop");
        int j = 0;
        do {
            System.out.println(j);
            j++;
            if (j == 9) {
                break;
            }
        } while (j < 20);
    }
}