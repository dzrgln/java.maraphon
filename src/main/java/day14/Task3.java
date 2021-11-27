package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("People");
        System.out.println(parseFileToStringList(file));
    }

    public static List<Person> parseFileToStringList(File file) {
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                int age = Integer.parseInt(person[1]);
                if (age <= 0) {
                    throw new IllegalAccessException();
                }
                Person person1 = new Person(person[0], age);
                people.add(person1);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println("Некорректный входной файл");
        }
        return people;
    }
}