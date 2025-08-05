package day6;

public class Airplane {

    private String producer;
    private int year;
    private int lenght;
    private int weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public Airplane (String producer, int year, int lenght, int weight) {

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
}
