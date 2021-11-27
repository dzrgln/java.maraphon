package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

// Создание массива
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000); //заполняем массив случайными значениями
        }

//Ввод переменных
        int max = array[0]; // переменная для подсчета максимального значения
        int min = array[0]; // переменная для подсчета минимального значения
        int number0 = 0; // переменная для подсчета количества значений с 0
        int sum0 = 0; // переменная для подсчета суммы количества значений с 0

//Проверка условий
        for (int x : array) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (x % 10 == 0) {
                number0++;
                sum0 = sum0 + x;
            }
        }

//Вывод результатов
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьшший элемент массива: " + min);
        System.out.println("Количестве элементов массива, оканчивающихся на 0: " + number0);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum0);
    }
}
