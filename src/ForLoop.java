public class ForLoop {
    public static void main(String[] args) {

        // for (start; warunek działania; krok)
        int suma = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            suma = suma + i;
        }
        System.out.println("Suma liczb 0-10: " + suma);

        for (int j = 30; j >= 0; j = j - 3) {
            System.out.print(j + " ");
        }
    }
}
