package day7;

public class Airplane {

    private String producer;
    private int year;
    private int lenght;
    private int weight;
    private int fuel;
    private String airplane1;
    private String airplane2;


    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int lenght, int weight) {

        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year +
                ", длина:  " + lenght + ", вес: " + weight + ", колличество топлива в баке: " + fuel);
    }

    public void fillUp(int inputFuell) {
        fuel += inputFuell;

    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2) {

        if (airplane1.getLenght() > airplane2.getLenght()){
            System.out.println("Самолёт №1 длинее самолёта №2");
        } else if (airplane1.getLenght() < airplane2.getLenght()) {
            System.out.println("Самолёт №2 длинее самолёта №1");
        } else {
            System.out.println("Длины самолётов равны");
        }
    }
}
