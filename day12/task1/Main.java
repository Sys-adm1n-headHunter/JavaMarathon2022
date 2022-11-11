package day12.task1;
/* SAI
1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
из списка. Распечатать список.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Lada");
        cars.add("Ferrari");
        cars.add("Bugatti");
        cars.add("Ford");
        System.out.println(cars);

        cars.add(3,"Audi");
        cars.remove(0);
        System.out.println(cars);
    }
}
