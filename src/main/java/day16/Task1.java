package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test1");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 11) {
                throw new IllegalArgumentException();
            }
            int[] numbers = new int[11];
            int count = 0;
            int sum = 0;
            int a;
            for (String x : numbersString) {
                a = count++;
                numbers[a] = Integer.parseInt(x);
                sum = sum + numbers[a];
            }
            double arithmeticMeanFull = (double) sum / numbers.length;
            String arithmeticMeanRound = String.format("%.3f", arithmeticMeanFull);
            System.out.println(arithmeticMeanFull + " ---> " + arithmeticMeanRound);

        } catch (FileNotFoundException e) {
            System.out.println("Файл отсутсвует");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректиные исходные данные");
        }
    }
}

