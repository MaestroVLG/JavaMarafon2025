package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner d = new Scanner((System.in));
        int digit = d.nextInt();


        int[] table = new int[digit];
        Random random = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(11);
        }

        for (int num : table) {
            System.out.print(num + " ");
        }

        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if(table[i] > 8){
                count+=1;

            }
        }
        int count1 = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] == 1) {
                count1 += 1;
            }
        }

        int count2 = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] % 2 == 0) {
                count2 += 1;
            }
        }

        int count3 = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] % 2 != 0) {
                count3 += 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum += table[i];
        }




        System.out.println();
        System.out.println("Длина массива: " + table.length);
        System.out.println();
        System.out.println("Колличество чисел больше 8: " + count);
        System.out.println();
        System.out.println("Колличество равных 1: " + count1);
        System.out.println();
        System.out.println("Количество четных чисел: " + count2);
        System.out.println();
        System.out.println("Количество нечетных чисел: " + count3);
        System.out.println();
        System.out.println("Сумма всех элементов массива: " + sum);



    }
}
