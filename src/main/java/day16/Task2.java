package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        File randomNumbers = new File("randomNumbers");
        File averageNumbers = new File("averageNumbers");
        Random random = new Random();
        int[] numbers = new int[1000];
        try {
            PrintWriter pw1 = new PrintWriter(randomNumbers);
            for (int i = 0; i < 1000; i++) {
                int number = random.nextInt(100);
                numbers[i] = number;
                pw1.println(number);
            }
            pw1.close();
            PrintWriter pw2 = new PrintWriter(averageNumbers);
            double superAverage = 0;
            for (int i = 0; i < 1000; i = i + 20) {
                double sum = 0;
                for (int j = i; j < (i + 4); j++) {
                    sum = sum + numbers[j];
                }
                pw2.println(sum / 4);
                superAverage = superAverage + sum/4;
            }
            System.out.println(superAverage);
            pw2.close();

        } catch (
                FileNotFoundException e) {
            System.out.println("Нет возможности создать файл");
        }
    }
}
