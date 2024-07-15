public class LabeledBreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Labeled break");
        outerLoop:
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j <= 5) {
                if (j == 3) break outerLoop;
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Labeled continue");
        label:
        for (int i = 0; i < 10; i++) {
            System.out.println();
            int j = 0;
            while (j <= 5) {
                if (j == 3) continue label;
                System.out.print(j + " ");
                j++;
            }
        }
    }
}