package day7.task1;

/* SAI
1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
дня.
В классе Самолет создать статический метод compareAirplanes, который в
качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
сообщение в консоль о том, какой из самолетов длиннее
 */

public class Task1 {
    public static void main(String[] args) {
    Airplane airplane1 = new Airplane("H1",1995,321,2142);
    Airplane airplane2 = new Airplane("D3",1990,2324,1242);

    Airplane.compareAirplanes(airplane1,airplane2);
    }
}
