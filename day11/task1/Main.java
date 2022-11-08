package day11.task1;
/* SAI
Каждый класс-сотрудник должен реализовывать интерфейс Worker, в котором
необходимо объявить методы doWork() и bonus().
Каждый раз когда сотрудник выполняет свою работу (вызов метод doWork()), ему
выплачивается заработная плата (сокр. ЗП) (80 - сборщику, 100 - курьеру).
А также при вызове doWork() у Сборщика, происходит увеличение значения поля
countOrder в классе Warehouse на 1. При вызове doWork() у Курьера, происходит
увеличение переменной balance в классе Warehouse на 1000.
Сотрудникам полагается бонус (индивидуальный расчет для каждого): когда на складе
отгружен 1500-й заказ, заработанная к тому моменту ЗП сборщика утраивается. Когда
складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
Для демонстрации и тестирования работы программы создайте склад и по 1 рабочему,
вызовите у каждого методы doWork() и bonus(), столько раз, чтобы каждый из
сотрудников получил бонус. Выведите в консоль баланс и количество выполненных
заказов на складе и ЗП каждого из сотрудников.
Создать второй склад, также принять по 1 сотруднику с однократным вызовом
doWork() у каждого. Проконтролировать, что у склада 1 и его сотрудников при этом
значения не меняются
 */

public class Main {
    public static void main(String[] args) {

        Warehouse warehouseOne = new Warehouse(); //Первый склад

        Picker pickerOne = new Picker();
        pickerOne.setWarehouse(warehouseOne);

        Courier courierOne = new Courier();
        courierOne.setWarehouse(warehouseOne);

        for (int i = 0; i < 1500; i++) { //цикл для получения бонуса Сборщику
            pickerOne.doWork();
        }
        pickerOne.bonus();

        for (int i = 0; i < 1000; i++) { //цикл для получения ,онуса Курьеру
            courierOne.doWork();
        }
        courierOne.bonus();
        System.out.println(warehouseOne);
        System.out.println(pickerOne);
        System.out.println(courierOne);
        System.out.println();

        Warehouse warehouseTwo = new Warehouse(); //Второй склад

        Picker pickerTwo = new Picker();
        pickerTwo.setWarehouse(warehouseTwo);
        pickerTwo.doWork();

        Courier courierTwo = new Courier();
        courierTwo.setWarehouse(warehouseTwo);
        courierTwo.doWork();

        System.out.println(warehouseTwo);
        System.out.println(pickerTwo);
        System.out.println(courierTwo);
    }
}
