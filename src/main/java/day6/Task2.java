package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing", 2010, 30, 40000);

        airplane.setYear(2011);
        airplane.setLenght(40);

        airplane.fillUp(1000);
        airplane.fillUp(5000);

        airplane.info();


    }
}
