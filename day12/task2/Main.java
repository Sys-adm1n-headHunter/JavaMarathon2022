package day12.task2;
/* SAI
Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
Вывести список.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
