public class BreakAndContinue {
    public static void main(String[] args) {

        // Continue - kontynuowanie pętli od kolejnej interacji
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + ": ");
            System.out.print("Poprzednia: " + (i-1) + " ");

            if (i == 3) {
                System.out.println();
                continue;
            }

            System.out.println("Następna: " + (i+1));
        }

        System.out.println("----------------------------------------");

        for (int j = 0; j <= 5; j++) {
            System.out.print(j + ": ");
            System.out.print("Poprzednia: " + (j-1) + " ");

            if (j == 3) {
                System.out.println();
                break;
            }

            System.out.println("Następna: " + (j+1));
        }
    }
}