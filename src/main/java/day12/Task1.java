package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Volvo");
        cars.add("Renault");
        cars.add("Lada");
        cars.add("BMW");

        System.out.println(cars);

        cars.add(2, "Kia");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);

    }
}
