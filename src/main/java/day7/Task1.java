package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a = new Airplane("Boeing", 1999, 200, 250);
        Airplane b = new Airplane("Airbus", 2015, 120, 150);
        Airplane.compareLength(a, b);
    }
}