package day6.task2;

/* SAI
Создать класс Самолет (Airplane) с полями:
- producer (изготовитель)
- year (год выпуска)
- length (длина)
- weight (вес)
- fuel (количество топлива в баке) + геттер для этого поля
Создать конструктор в классе Самолет, принимающий в качестве аргументов значения
четырех полей класса (значение поля “количество топлива в баке” установить равным
 */

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
