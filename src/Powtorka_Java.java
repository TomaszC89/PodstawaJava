public class Powtorka_Java {
    public static void main(String[] args) {

        // Typ liczby całkowitej
        int x = 10;
        int y = 20;
//        System.out.println("Suma: " + (x + y));

        // Operator modulo - reszta z dzielenia
        // Przykład: czy liczba jest parzysta.
//        System.out.println(11 % 2);

        // Typ liczby zmiennoprzecinkowej
        double a = 3.5;

        // Typ logiczny (True/False)
        boolean isTrue = false;

        // Możemy do zmiennej zapisać wynik wyrażenia
        int mySum = x + y; // 10 + 20
        boolean isXGreater = (x > y); // false
        boolean isEqual = (x == y); // false

        // Wyświetlić x3 tą samą wartość.
//        System.out.println(isTrue);
//        System.out.println(isTrue);
//        System.out.println(isTrue);

        // Łańcuch znakowy
        String myTxt = "Ala ma kota";
        // Zamiana na same wielkie/małe litery
//        System.out.println(myTxt.toUpperCase() + " " + myTxt.toLowerCase());
        // Łańcuch znakowy porównujemy za pomocą .equals zamiast ==
//        String s1 = "SDA";
//        String s2 = "SDA";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2)); //
//        System.out.println(s1.equalsIgnoreCase(s2)); // Porównanie tekstów bez zwracania na wielkość znaków.
//        String s3 = new String("SDA");
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));

        /* Instrukcje sterowania */
        // 1. if/else if/else
        double temperature = 35.0;

        if (temperature == 36.6) {
            System.out.println("Perfect");
        } else if (temperature > 36.6) {
            System.out.println("Gorączka");
        } else if (temperature < 36.6 && temperature >= 36.4) {
            System.out.println("Ochłodzenie");
        } else {
            System.out.println("Wychłodzenie");
        }

        // Użytkownik podaje liczbę 1-7 i program zwraca dzień tygodnia
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nie rozpoznano nr dnia tygodnia.");
                break;
        }

    }
}