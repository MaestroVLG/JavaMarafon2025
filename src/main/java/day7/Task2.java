package day7;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = new Player(90);
        Player player2 = new Player(95);
        Player player3 = new Player(60);

        Player.info();

        Player player4 = new Player(80);
        Player player5 = new Player(100);
        Player player6 = new Player(1);

        player6.run();

        Player.info();

        Player player7 = new Player(90);

        Player.info();

    }
}
