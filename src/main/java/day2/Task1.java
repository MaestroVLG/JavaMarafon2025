package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите колличество этажей: ");
        int etaj = vvod.nextInt();
        System.out.println("Колличество этажей в здании: " + etaj);

        if (etaj <= 0) {
            System.out.println("Ошибка ввода");
        } else if (etaj <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (etaj <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (etaj > 9) {
            System.out.println("Многоэтажный дом");

        }
    }
}
