package day6;

public class Task1 {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setModel("Ford Fusion");
        ford.setColor("Black");
        ford.setAgeRealise(2012);

        ford.info();
        System.out.println(ford.yearDifferece(2021));
    }
}
