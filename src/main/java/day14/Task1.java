package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test1");
        printSumDigits(file);


    }

    public static void printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Количество чисeл должно быть 10");
                    ;
                }
            } else {
                int[] numbers = new int[10];
                int counter = 0;

                for (String x : numbersString) {
                    int a = counter++;
                    numbers[a] = Integer.parseInt(x);
                    sum = sum + numbers[a];
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }

    }
}
