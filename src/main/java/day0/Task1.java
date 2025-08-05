package day0;

/** не верная нумерация заданий,
ошибка со стороны курса */

public class Task1 {
    public static void main(String[] args) {

// Задание 1
        int value = 0;
        while (value< 10) {
            System.out.print("JAVA ");
            value = value+1;
        }

        for (int i = 0; i < 11; i++) {
            System.out.print("JAVA ");

        }

        int digit = 0;
        while (digit< 10) {
            System.out.println("JAVA ");
            digit = digit+1;
        }

        for (int i = 0; i < 11; i++) {
            System.out.println("JAVA ");

        }

// Задание 2

        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + "года");
            year = year + 4;
        }

        for (int i = 1980; i<=2020; i = i+4){
            System.out.println("Олимпиада " + i + "года");
        }

// Задание 3

        int k = 7;
        int chislo = 1;

        while (chislo <= 9) {
            System.out.println(chislo + "x" + k + "=" + (chislo*k));
            chislo = chislo + 1;
        }


    }

}