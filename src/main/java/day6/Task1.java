package day6;



public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setColor("black");
        car1.setYear(2000);
        car1.setModel("kia");

        Motorbike motorbike1 = new Motorbike(2010, "bmw", "black");

        System.out.println("Автомобиль: " + car1.getModel() + " Год выпуска: " +
                car1.getYear() + " Цвет машины: " + car1.getColor());

        car1.info();
        motorbike1.info();

        System.out.println(car1.yearDifference(1900));
        System.out.println(motorbike1.yearDifference(1900));

    }
}
