public class Klasa_ogolna {
    public static void main(String[] args) {

        // Tworzenie obiektu klasy
        Car c1 = new Car();
        Car c2 = new Car();

        // Ustawienie wartości
        c1.setColor("Czerwony");
        c1.setYearProduction(2020);
        c2.setRunning(true);

        // Pobieranie wartości
        System.out.println(c1.getColor());
        System.out.println(c1.getYearProduction());
        System.out.println(c1.isRunning());
    }
}