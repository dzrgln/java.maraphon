package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = scanner.nextInt();
        if (floors < 1) {
            System.out.println("Ошибка ввода");
        }
        else if (floors < 5) {
            System.out.println("Малоэтажный дом");
        }
        else if (floors < 9) {
            System.out.println("Среднеэтажный дом");
        }
        else if(floors>=9) {
            System.out.println("Многоэтажный дом");
        }
    }

}

