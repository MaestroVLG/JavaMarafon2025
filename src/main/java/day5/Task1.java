package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setColor("black");
        car1.setYear(2000);
        car1.setModel("kia");

        System.out.println("Автомобиль: " + car1.getModel() + " Год выпуска: " + car1.getYear() + " Цвет машины: " + car1.getColor());

    }
}






