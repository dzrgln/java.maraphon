package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

//Create and fill in the array and print its members
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int maxSum = 0; // max of sum
        int nMax = 0; // number of max sum strting
        // Check each string
        for (int i = 0; i < array.length; i++) {
            int sumI = 0; // sum of string
            for (int j = 0; j < array[i].length; j++) {
                sumI = sumI + array[i][j];
                if (sumI > maxSum) {
                    maxSum = sumI;
                    nMax = i;
                }
            }
        }
        System.out.println("Сумма наибольшей строки: " + maxSum);
        System.out.println("Индекс строки с наибольшей суммой: " + nMax);
    }
}
