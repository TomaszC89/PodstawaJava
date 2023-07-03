public class WhileLoop {
    public static void main(String[] args) {

        // Wyświetl wartości od 0 do 5 (włącznie).
        int n = 0;

        while (n <= 5) {
            System.out.print(n + " ");
            n++;
        }

        int i = 0;
        int j = 10;

        while (i <= 10 && j >= 0) {
            if (i % 2 == 0) {
                i++;
            } else {
                j--;
                //i++;
            }
            System.out.println("i=" + i + ", j=" + j);
        }
    }
}