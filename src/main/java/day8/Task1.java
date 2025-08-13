package day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";

        long before = System.currentTimeMillis();

        for(int i = 0; i <= 20; i++)
            numbers += i + " ";

        long after = System.currentTimeMillis();

        System.out.println("Время выполнения с классом String: " + (after - before));

        System.out.println(numbers);

        StringBuilder sb = new StringBuilder("");

        before = System.currentTimeMillis();

        for(int i = 0; i <= 20; i++)
            sb.append(i).append(" ");

        after = System.currentTimeMillis();

        System.out.println("Время выполнения с классом StringBuilder: " + (after - before));

        System.out.println(sb);

    }
}
