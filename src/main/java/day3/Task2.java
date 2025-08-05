package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);


        while(true) {
            double digit1 = digit.nextDouble();
            double digit2 = digit.nextDouble();

            if (digit1 == 0 | digit2 ==0)
                break;

            System.out.println(digit1 / digit2);
        }


    }
}
