package day6.task2;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Apple",1990,2000,10000);
        airplane.setYear(2000);
        airplane.setLength(2400);
        airplane.fillUp(320);
        airplane.fillUp(150);
        airplane.info();
    }
}
