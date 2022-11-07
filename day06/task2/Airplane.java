package day06.task2;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.producer = producer;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year +
                ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuel);
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }


}
