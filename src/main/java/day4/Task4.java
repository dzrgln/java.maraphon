package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        int sum = 0; // sum of three members
        int maxSum = 0; // max sum of three members
        int maxIndex = 0;

        for (int i = 1; i < (array.length - 1); i++) {
            sum = array[i - 1] + array[i] + array[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i - 1;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма максимальной тройки: " + maxSum);
        System.out.println("Индекс первого члена максимальной тройки: " + maxIndex);
    }
}
