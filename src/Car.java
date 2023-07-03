public class Car {

    /* Zbiór cech/pól */
    private String color;
    private int yearProduction;
    private double enginePower;
    private boolean isRunning;
    private String brand;

    /* Metody należące do klasy */

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}