package day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";

        long before = System.currentTimeMillis();

        for(int i = 0; i <= 20000; i++)
            numbers += numbers + " ";

        long after = System.currentTimeMillis();

        System.out.println("Время выполнения с классом String: " + (after - before));

        System.out.println(numbers);

        StringBuilder sb = new StringBuilder("");

        long before1 = System.currentTimeMillis();

        for(int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");

        long after1 = System.currentTimeMillis();

        System.out.println("Время выполнения с классом StringBuilder: " + (after1 - before1));

        System.out.println(sb);

    }
}
