package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) {
        Map<Integer, Point> taxiCars = new HashMap<>();

        File file = new File("taxi_cars.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLong()) {
                String line = scanner.nextLine();
                String[] numbersStrings = line.split(" ");
                taxiCars.put(Integer.parseInt(numbersStrings[0]), new Point(Integer.parseInt(numbersStrings[1]), Integer.parseInt(numbersStrings[2])));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        Map<Integer, Point> taxiInSquare = new HashMap<>();
        taxiInSquare.putAll(searchOfCars(taxiCars));
        System.out.println("Машин в указанной области: " + taxiInSquare.size() + " штук");
        System.out.println("Номера машин в указанной области: " + taxiInSquare.keySet());
    }

    public static Map<Integer, Point> searchOfCars(Map<Integer, Point> map) {

        Map<Integer, Point> taxiInSquare = new HashMap<>();
        taxiInSquare.putAll(map);
        System.out.println(taxiInSquare.size());

        Scanner userImput = new Scanner(System.in);
        System.out.println("Введите координату X первой точки");
        int x1 = userImput.nextInt();
        System.out.println("Введите координату Y первой точки");
        int y1 = userImput.nextInt();
        System.out.println("Введите координату X второй точки");
        int x2 = userImput.nextInt();
        System.out.println("Введите координату Y второй точки");
        int y2 = userImput.nextInt();
        userImput.close();

        for (int i = 1; i <= map.size(); i++) {
            if (map.get(i).getX() <= x1 || map.get(i).getX() >= x2 || map.get(i).getY() <= y1 || map.get(i).getY() >= y2) {
                taxiInSquare.remove(i);
            }
        }
        if (taxiInSquare.isEmpty()) {
            throw new NullPointerException("В указанном диапазоне нет машин");
        }
        return taxiInSquare;
    }
}