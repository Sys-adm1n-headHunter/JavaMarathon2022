package day5.task1;

/* SAI
1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции.
 */

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(1970);
        car.setColor("Red");
        car.setModel("BMW");

        System.out.println("Our car: " + car.getYear() + " year " + car.getModel() + " model " +
                car.getColor() + " color");
    }

}
