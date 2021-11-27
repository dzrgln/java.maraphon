package day4;

import com.sun.javafx.geom.AreaOp;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int n = scanner.nextInt(); // вводится размер массива
        int[] array = new int[n];// создаем массив
        int count8 = 0; // переменная для подсчета больше 8
        int count1 = 0;// переменная для подсчета равно 1
        int countEven = 0;// переменная для подсчета четных значений
        int countOdd = n - countEven;// переменная для подсчета нечетных значений
        int sum = 0; // переменная для подсчета суммы

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10); //заполняем массив случайными значениями
        }

        for (int x : array) {
            System.out.print(x + " "); // вывод элементов массива
            if (x > 8) {    // проверка на больше 8
                count8++;
            }
            if (x == 1) {   // проверка на равенство 1
                count1++;
            }
            if (x % 2 == 0) {  // проверка четность
                countEven++;
            }
            sum = sum + x;  // вычисление суммы
        }
        //Вывод результатов
        System.out.println();
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количестве чисел больше 8: " + count8);
        System.out.println("Количестве чисел равных 1: " + count1);
        System.out.println("Количестве четных числе: " + countEven);
        System.out.println("Количестве нечетных числе: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
