package day6.task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1970);
        car.setColor("Red");
        car.setModel("BMW");
        car.info();
        System.out.println(car.yearDifference(2000));

        Motorbike motorbike = new Motorbike(1990, "Red", "Honda");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2000));

    }
}
