package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] table = new int[100];
        Random random = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(10001);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countEndingWithZero = 0;
        int sumEndingWithZero = 0;


        for (int num : table) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            if (num % 10 == 0) {
                countEndingWithZero += 1;
                sumEndingWithZero += num;
            }


        }
        System.out.println(Arrays.toString(table));

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наимешьний элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countEndingWithZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumEndingWithZero);
    }
}
